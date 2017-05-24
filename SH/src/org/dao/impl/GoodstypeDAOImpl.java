package org.dao.impl;

import java.util.List;

import org.dao.IGoodstypeDAO;
import org.hibernate.Query;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Goodstype;

public class GoodstypeDAOImpl implements IGoodstypeDAO {

	@Override
	public void doCreate(Goodstype vo) throws Exception {
		
	}

	@Override
	public void doUpdate(Goodstype vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void doRemove(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Goodstype findById(String id) throws Exception {
		return (Goodstype) HibernateSessionFactory.getSession().get(Goodstype.class, id);
	}

	@Override
	public List<Goodstype> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAllCount(String keyword, String column) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Goodstype> findAll() throws Exception {
		String hql="FROM Goodstype";
		Query query=HibernateSessionFactory.getSession().createQuery(hql);
		return query.list();
	}

}
