package org.factory;

import org.dao.IGoodsDAO;
import org.dao.IGoodstypeDAO;
import org.dao.IGuserDAO;
import org.dao.impl.GoodsDAOImpl;
import org.dao.impl.GoodstypeDAOImpl;
import org.dao.impl.GuserDAOImpl;

public class DAOFactory {
	public static IGuserDAO getGuserDAOInstance(){
		return new GuserDAOImpl();
	}
	
	public static IGoodsDAO getGoodsDAOInstance(){
		return new GoodsDAOImpl();
	}
	public static IGoodstypeDAO getGoodstypeDAOInstance(){
		return new GoodstypeDAOImpl();
	}
}
