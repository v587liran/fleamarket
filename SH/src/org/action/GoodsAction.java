package org.action;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;
import org.factory.ServiceFactory;
import org.pojo.Goods;
import org.pojo.Goodstype;
import org.pojo.Guser;
import org.util.FileUtils;
import org.util.LogUtils;

import com.opensymphony.xwork2.ActionSupport;

public class GoodsAction extends ActionSupport{
	private Goods goods;
	
	private String imgeString;
	
	private String goodsid;
	private String goodsname;
	private String goodsprice;
	private String usedtime;
	private String goodsdetails;
	private String goodstypeid;
	
	private File photo;
	private String photoFileName;
	
	private String message;
	private String url;
	
	private int pageNo = 1;
	private int pageSize = 5;
	private String keyword = "";
	private String column = "goodsname";
	
	private List<Goods> allGoods;
	private List<Goodstype> allType;
	private int count;
	
	
	
	public String getGoodstypeid() {
		return goodstypeid;
	}

	public void setGoodstypeid(String goodstypeid) {
		this.goodstypeid = goodstypeid;
	}

	public String addGoods() throws Exception{
		Guser guser=(Guser) ServletActionContext.getRequest().getSession().getAttribute("guser");
		Goods goods=new Goods();
		goods.setGoodsid(UUID.randomUUID().toString());
		goods.setGoodsname(goodsname);
		goods.setGoodsprice(Integer.parseInt(goodsprice));
		goods.setUsedtime(usedtime);
		goods.setGoodsdetails(goodsdetails);
		goods.setGuser(guser);
		Goodstype goodstype=ServiceFactory.getGoodstypeServiceInstance().findById(goodstypeid);
		goods.setGoodsfalg(false);
		goods.setGoodstype(goodstype);
		
		// 文件上传操作
		String savePath = ServletActionContext.getServletContext().getRealPath("/upload")+ "/";

		String fileName = FileUtils.saveFile(photo, savePath, photoFileName);
		
		goods.setGoodsphoto(fileName);
		

		ServiceFactory.getGoodsServiceInstance().add(goods);
		
		
		LogUtils.addInfo("添加了物品信息: " +  guser.getGuserid()+ " -->  添加的");

		message = "发布闲置成功";
		url = "/pages/goods/goods_gerenfabulist.jsp";
		
		return "forward";
	}

	public String gerenfabulist() throws Exception {
		Map<String, Object> map = ServiceFactory.getGoodsServiceInstance().findAll(pageNo, pageSize, keyword, column);
		
		allGoods = (List<Goods>) map.get("allGoods");
		
		count = (Integer) map.get("allCount");
		
		System.out.println("----------------------------------");
		
		for(Goods g:allGoods){
			System.out.println(g.getGoodstype().getTypename()+"-----------------------");
		}

		return "gerenfabulist";
	}
	
	public String typePre() throws Exception{
		allType=ServiceFactory.getGoodstypeServiceInstance().findAll();
		
		ServletActionContext.getRequest().getSession().setAttribute("allType",allType);
		
		for(Goodstype g:allType){
			System.out.println(g.getGoodstypeid()+"<---->"+g.getTypename()+"<------------------------------>");
		}
		
		return "typePre";
	}
	
	public String getInfo() throws Exception{
		goods=ServiceFactory.getGoodsServiceInstance().findById(goods.getGoodsid());
		imgeString=goods.getGoodsphoto();
		System.out.println(imgeString);
		url="/pages/goods/goods_info.jsp";
		return "info";
	}
	
	
	

	public List<Goodstype> getAllType() {
		return allType;
	}

	public List<Goodstype> getAlltype() {
		return allType;
	}

	public void setAllType(List<Goodstype> alltype) {
		this.allType = alltype;
	}

	public String getImgeString() {
		return imgeString;
	}

	public void setImgeString(String imgeString) {
		this.imgeString = imgeString;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	

	public List<Goods> getAllGoods() {
		return allGoods;
	}

	public void setAllGoods(List<Goods> allGoods) {
		this.allGoods = allGoods;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getGoodsid() {
		return goodsid;
	}



	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}



	public String getGoodsname() {
		return goodsname;
	}



	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}



	public String getGoodsprice() {
		return goodsprice;
	}



	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}



	public String getUsedtime() {
		return usedtime;
	}



	public void setUsedtime(String usedtime) {
		this.usedtime = usedtime;
	}



	public String getGoodsdetails() {
		return goodsdetails;
	}



	public void setGoodsdetails(String goodsdetails) {
		this.goodsdetails = goodsdetails;
	}



	public File getPhoto() {
		return photo;
	}



	public void setPhoto(File photo) {
		this.photo = photo;
	}



	public String getPhotoFileName() {
		return photoFileName;
	}



	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}
}
