package org.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.factory.DAOFactory;
import org.jdbc.HibernateSessionFactory;
import org.pojo.Goods;
import org.pojo.Goodstype;
import org.service.IGoodstypeService;

public class GoodstypeServiceImpl implements IGoodstypeService {

	@Override
	public void add(Goodstype goodstype) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Goodstype goodstype) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Goodstype findById(String id) throws Exception {
		Goodstype goodstype=null;
		try {
			goodstype=DAOFactory.getGoodstypeDAOInstance().findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return goodstype;
	}

	@Override
	public Map<String, Object> findAll(int pageNo, int pageSize,String keyword, String column) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goodstype> findAll() throws Exception {
		List<Goodstype> list=new ArrayList<Goodstype>();
		try {
			list=DAOFactory.getGoodstypeDAOInstance().findAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		return list;
	}

}
