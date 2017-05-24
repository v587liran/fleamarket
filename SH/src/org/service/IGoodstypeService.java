package org.service;

import java.util.List;
import java.util.Map;

import org.pojo.Goodstype;

public interface IGoodstypeService {
	
	public void add(Goodstype goodstype) throws Exception;

	public void delete(String id) throws Exception;

	public void update(Goodstype goodstype) throws Exception;

	public List<Goodstype> findAll() throws Exception;
	
	public Goodstype findById(String id) throws Exception;

	public Map<String, Object> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception;
	
}
