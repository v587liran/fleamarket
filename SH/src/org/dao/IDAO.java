package org.dao;

import java.util.List;

public interface IDAO<K, V> {

	public void doCreate(V vo) throws Exception;

	public void doUpdate(V vo) throws Exception;

	public void doRemove(K id) throws Exception;

	public V findById(K id) throws Exception;

	public List<V> findAll() throws Exception;
	
	public List<V> findAll(int pageNo, int pageSize, String keyword,String column) throws Exception;

	public int getAllCount(String keyword, String column) throws Exception;

}
