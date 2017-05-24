package org.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;







import org.factory.DAOFactory;
import org.hibernate.Transaction;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Goods;
import org.pojo.Goodstype;
import org.service.IGoodsService;

public class GoodsServiceImpl  implements IGoodsService{

	@Override
	public void add(Goods goods) throws Exception {
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		try {
			DAOFactory.getGoodsDAOInstance().doCreate(goods);
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
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		DAOFactory.getGoodsDAOInstance().doRemove(id);
		tx.commit();
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void update(Goods goods) throws Exception {
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		DAOFactory.getGoodsDAOInstance().doUpdate(goods);
		tx.commit();
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public Goods findById(String id) throws Exception {
		Transaction tx = HibernateSessionFactory.getSession().beginTransaction();
		Goods good=null;
		try {
			good = DAOFactory.getGoodsDAOInstance().findById(id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return good;
	}

	@Override
	public Map<String, Object> findAll(int pageNo, int pageSize,
			String keyword, String column) throws Exception {
		Map<String, Object> map =new HashMap<String, Object>();
		try {
			map.put("allGoods",DAOFactory.getGoodsDAOInstance().findAll(pageNo,
					pageSize, keyword, column) );
			map.put("allCount", DAOFactory.getGoodsDAOInstance().getAllCount(keyword, 
					column));
		} catch (Exception e) {
			e.printStackTrace();
                throw e;
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return map;
	}
}
