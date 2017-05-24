package org.service;

import java.util.List;
import java.util.Map;

import org.pojo.Goods;
import org.pojo.Goodstype;

public interface IGoodsService {
	
	public void add(Goods goods) throws Exception;

	public void delete(String id) throws Exception;

	public void update(Goods goods) throws Exception;

	public Goods findById(String id) throws Exception;

	public Map<String, Object> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception;

}
