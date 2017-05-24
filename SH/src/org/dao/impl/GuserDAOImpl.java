package org.dao.impl;

import java.util.List;

import org.dao.IGuserDAO;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Guser;

public class GuserDAOImpl implements IGuserDAO {

	@Override
	public void doCreate(Guser vo) throws Exception {
		HibernateSessionFactory.getSession().save(vo);
	}

	@Override
	public void doUpdate(Guser vo) throws Exception {
		HibernateSessionFactory.getSession().update(vo);
	}

	@Override
	public void doRemove(String id) throws Exception {
		Guser guser=(Guser) HibernateSessionFactory.getSession().get(Guser.class, id);
		HibernateSessionFactory.getSession().delete(guser);
	}

	@Override
	public Guser findById(String id) throws Exception {
		return (Guser) HibernateSessionFactory.getSession().get(Guser.class, id);
	}

	@Override
	public List<Guser> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception {
		String hql="FROM Course AS c WHERE c."+column+" LIKE ?";
		Query query=HibernateSessionFactory.getSession().createQuery(hql);
		query.setString(0, "%"+keyword+"%");
		query.setFirstResult((pageNo-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	@Override
	public int getAllCount(String keyword, String column) throws Exception {
		String hql="SELECT COUNT(*) FROM Course AS c WHERE c."+column+" LIKE ?";
		Query query=HibernateSessionFactory.getSession().createQuery(hql);
		query.setString(0, "%"+keyword+"%");
		return ((Long)query.uniqueResult()).intValue();
	}

	@Override
	public List<Guser> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
