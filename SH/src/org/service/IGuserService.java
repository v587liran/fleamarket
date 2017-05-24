package org.service;

import java.util.Map;

import org.pojo.Guser;

public interface IGuserService {
	
	public boolean isRegist(Guser guser) throws Exception;
	
	public boolean isLogin(Guser guser) throws Exception;
	
	public void add(Guser guser) throws Exception;

	public void delete(String id) throws Exception;

	public void update(Guser guser) throws Exception;

	public Guser findById(String id) throws Exception;

	public Map<String, Object> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception;
}
