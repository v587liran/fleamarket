package org.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.factory.DAOFactory;
import org.hibernate.Transaction;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Guser;
import org.service.IGuserService;

public class GuserServiceImpl implements IGuserService {

	@Override
	public void add(Guser guser) throws Exception {
		Transaction tx=HibernateSessionFactory.getSession().beginTransaction();
		try {
			DAOFactory.getGuserDAOInstance().doCreate(guser);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public void delete(String id) throws Exception {
		Transaction tx=HibernateSessionFactory.getSession().beginTransaction();
		try {
			DAOFactory.getGuserDAOInstance().doRemove(id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public void update(Guser guser) throws Exception {
		Transaction tx=HibernateSessionFactory.getSession().beginTransaction();
		try {
			DAOFactory.getGuserDAOInstance().doUpdate(guser);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Guser findById(String id) throws Exception {
		Guser guser=new Guser();
		try {
			guser=DAOFactory.getGuserDAOInstance().findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return guser;
	}

	@Override
	public Map<String, Object> findAll(int pageNo, int pageSize,String keyword, String column) throws Exception {
		Map<String,Object> map=new HashMap<String, Object>();
		try {
			map.put("all", DAOFactory.getGuserDAOInstance().findAll(pageNo, pageSize, keyword, column));
			map.put("allCount", DAOFactory.getGuserDAOInstance().getAllCount(keyword, column));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return map;
	}

	@Override
	public boolean isLogin(Guser guser) throws Exception {
		Guser guser2=new Guser();
		try {
			guser2=findById(guser.getGuserid());
		
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		if(guser!=null&&guser2.getGuserid().equals(guser.getGuserid())){
			guser.setAddress(guser2.getAddress());
			guser.setGoodses(guser2.getGoodses());
			guser.setGuserid(guser2.getGuserid());
			guser.setGusername(guser2.getGusername());
			guser.setPassword(guser2.getPassword());
			guser.setPhonenumber(guser2.getPhonenumber());
			guser.setWechat(guser2.getWechat());
			return true;
		}
		return false;
	}

	@Override
	public boolean isRegist(Guser guser) throws Exception {
		Transaction tx=HibernateSessionFactory.getSession().beginTransaction();
		try {
			DAOFactory.getGuserDAOInstance().doCreate(guser);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return true;
	}

}
