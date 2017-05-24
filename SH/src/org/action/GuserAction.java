package org.action;


import org.apache.struts2.ServletActionContext;
import org.factory.ServiceFactory;
import org.pojo.Guser;

import com.opensymphony.xwork2.ActionSupport;

public class GuserAction extends ActionSupport {
	private String id;
	private String gid;
	private String password;
	private String name;
	private String phonenumber;
	private String wechat;
	private String address;
	
	
	private Guser guser;
	private String message;
	private String url;
	
	public String login() throws Exception{
		guser=new Guser();
		guser.setGuserid(id);
		guser.setPassword(password);
		
		boolean flag=false;
		flag=ServiceFactory.getGuserServiceInstance().isLogin(guser);
		if(guser!=null&&flag){
			url="/pages/front/login_success.jsp";
			message="登录成功";
			ServletActionContext.getRequest().getSession().setAttribute("guser",guser);
			id = guser.getGuserid();
			
			ServletActionContext.getRequest().getSession().setAttribute("guserid",id);
			id=  (String) ServletActionContext.getRequest().getAttribute("guserid");
			
			
			return "success";
		} else {
			url="/pages/front/login_fail.jsp";
			message="密码或用户名错误";
			return "fail";
		}
	}
	
	public String regist() throws Exception {
		guser=new Guser();
		guser.setGuserid(id);
		guser.setGusername(name);
		guser.setPassword(password);
		guser.setWechat(wechat);
		guser.setAddress(address);
		guser.setPhonenumber(phonenumber);
		System.out.println(guser.toString());
		
		if(!ServiceFactory.getGuserServiceInstance().isRegist(guser)){
			url="/Regist.jsp";
			message="注册失败";
			return "forward";
		}
		url="/Login.jsp";
		message="注册成功";
		return "forward";
	}
	
	public String setGuserInfo() throws Exception{
		
		guser = ServiceFactory.getGuserServiceInstance().findById(gid);
		
		//guser.setGuserid(id);
		guser.setGusername(name);
		guser.setPassword(password);
		guser.setWechat(wechat);
		guser.setAddress(address);
		guser.setPhonenumber(phonenumber);
		
		ServiceFactory.getGuserServiceInstance().update(guser);;
		
		ServletActionContext.getRequest().getSession().setAttribute("guser",guser);
		
		url="/pages/guser/guser_lookinfo.jsp";
		message="修改成功";
		
		return "forward";
	}
	
	
	public void setGuserSetAttribute(){
		ServletActionContext.getRequest().getSession().setAttribute("guser",guser);
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Guser getGuser() {
		return guser;
	}

	public void setGuser(Guser guser) {
		this.guser = guser;
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
