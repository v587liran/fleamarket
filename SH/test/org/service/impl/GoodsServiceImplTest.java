package org.service.impl;

import static org.junit.Assert.fail;

import org.factory.ServiceFactory;
import org.junit.Test;
import org.pojo.Goods;
import org.pojo.Goodstype;
import org.pojo.Guser;

public class GoodsServiceImplTest {

	@Test
	public void testAdd() throws Exception {
		Guser guser=new Guser();
		guser.setGuserid("1001");
		guser.setGusername("zhangsan");
		
		Goodstype goodstype=new Goodstype();
		goodstype.setGoodstypeid("1001");
		goodstype.setTypename("家居");
		
		Goods goods=new Goods();
		goods.setGoodsid("1001");
		goods.setGoodsname("西瓜");
		goods.setGoodsprice(19);
		goods.setUsedtime("9tian");
		goods.setGoodsdetails("idjweiodjiowe");
		goods.setGoodsphoto("dwejio");
		goods.setGoodstype(goodstype);
		
		goods.setGuser(guser);
		
		ServiceFactory.getGoodsServiceInstance().add(goods);
		
		
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
