package org.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Guser entity. @author MyEclipse Persistence Tools
 */

public class Guser implements java.io.Serializable {

	// Fields

	private String guserid;
	private String gusername;
	private String password;
	private String phonenumber;
	private String wechat;
	private String address;
	private Set gorders = new HashSet(0);
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Guser() {
	}

	/** minimal constructor */
	public Guser(String guserid) {
		this.guserid = guserid;
	}

	/** full constructor */
	public Guser(String guserid, String gusername, String password,
			String phonenumber, String wechat, String address, Set gorders,
			Set goodses) {
		this.guserid = guserid;
		this.gusername = gusername;
		this.password = password;
		this.phonenumber = phonenumber;
		this.wechat = wechat;
		this.address = address;
		this.gorders = gorders;
		this.goodses = goodses;
	}

	// Property accessors

	public String getGuserid() {
		return this.guserid;
	}

	public void setGuserid(String guserid) {
		this.guserid = guserid;
	}

	public String getGusername() {
		return this.gusername;
	}

	public void setGusername(String gusername) {
		this.gusername = gusername;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getGorders() {
		return this.gorders;
	}

	public void setGorders(Set gorders) {
		this.gorders = gorders;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}