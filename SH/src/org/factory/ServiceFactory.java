package org.factory;


import org.service.IGoodsService;
import org.service.IGoodstypeService;
import org.service.IGuserService;
import org.service.impl.GoodsServiceImpl;
import org.service.impl.GoodstypeServiceImpl;
import org.service.impl.GuserServiceImpl;

public class ServiceFactory {
	public static IGuserService getGuserServiceInstance() throws Exception{
		return new GuserServiceImpl();
	}
	
	public static IGoodsService getGoodsServiceInstance() throws Exception{
		return   new GoodsServiceImpl();
	}
	
	public static IGoodstypeService getGoodstypeServiceInstance() throws Exception{
		return new GoodstypeServiceImpl();
	}
}
