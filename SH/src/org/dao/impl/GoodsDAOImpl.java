package org.dao.impl;

import java.util.List;

import org.dao.IGoodsDAO;
import org.hibernate.Query;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Goods;

public class GoodsDAOImpl implements IGoodsDAO {

	@Override
	public void doCreate(Goods vo) throws Exception {
		HibernateSessionFactory.getSession().save(vo);
	}

	@Override
	public void doUpdate(Goods vo) throws Exception {
		HibernateSessionFactory.getSession().update(vo);
		
	}

	@Override
	public void doRemove(String id) throws Exception {
		Goods goods =(Goods) HibernateSessionFactory.getSession().get(Goods.class, id);
		HibernateSessionFactory.getSession().delete(goods);
	}

	@Override
	public Goods findById(String id) throws Exception {
		return (Goods) HibernateSessionFactory.getSession().get(Goods.class, id);
	}

	@Override
	public List<Goods> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception {
		String hql = "FROM Goods AS n WHERE n." + column + " LIKE ?";
		Query query = HibernateSessionFactory.getSession().createQuery(hql);
		query.setString(0, "%" + keyword + "%");
		query.setFirstResult((pageNo - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	@Override
	public int getAllCount(String keyword, String column) throws Exception {
		String hql = "SELECT COUNT(n) FROM Goods AS n WHERE n." + column+ " LIKE ?";
		Query query = HibernateSessionFactory.getSession().createQuery(hql);
		query.setString(0, "%" + keyword + "%");
		return ((Long) query.uniqueResult()).intValue();
	}

	@Override
	public List<Goods> findAll() throws Exception {
		String hqlString="FROM Goods";
		Query query=HibernateSessionFactory.getSession().createQuery(hqlString);
		return query.list();
	}

}
