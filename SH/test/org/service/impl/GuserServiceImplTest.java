package org.service.impl;

import static org.junit.Assert.*;

import org.factory.DAOFactory;
import org.factory.ServiceFactory;
import org.junit.Test;
import org.pojo.Guser;

public class GuserServiceImplTest {

	@Test
	public void testAdd() throws Exception {
		Guser guser=new Guser();
		guser.setGuserid("1001");
		guser.setGusername("张三");
		guser.setPassword("123");
		ServiceFactory.getGuserServiceInstance().add(guser);
	}

	@Test
	public void testDelete() {
		String string="19";
		int a=20+Integer.parseInt(string);
		System.out.println(a);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() throws Exception {
		Guser guser=DAOFactory.getGuserDAOInstance().findById("1004");
		System.out.println(guser);
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsLogin() throws Exception {
		Guser guser=new Guser();
		guser.setGuserid("1004");
		guser.setGusername("张三");
		guser.setPassword("123");
		System.out.println(ServiceFactory.getGuserServiceInstance().isRegist(guser));
	}

}
