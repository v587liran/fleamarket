package org.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private String goodsid;
	private Guser guser;
	private Goodstype goodstype;
	private String goodsname;
	private Integer goodsprice;
	private String usedtime;
	private String goodsdetails;
	private String goodsphoto;
	private Boolean goodsfalg;
	private Set gorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(String goodsid) {
		this.goodsid = goodsid;
	}

	/** full constructor */
	public Goods(String goodsid, Guser guser, Goodstype goodstype,
			String goodsname, Integer goodsprice, String usedtime,
			String goodsdetails, String goodsphoto, Boolean goodsfalg,
			Set gorders) {
		this.goodsid = goodsid;
		this.guser = guser;
		this.goodstype = goodstype;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.usedtime = usedtime;
		this.goodsdetails = goodsdetails;
		this.goodsphoto = goodsphoto;
		this.goodsfalg = goodsfalg;
		this.gorders = gorders;
	}

	// Property accessors

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public Guser getGuser() {
		return this.guser;
	}

	public void setGuser(Guser guser) {
		this.guser = guser;
	}

	public Goodstype getGoodstype() {
		return this.goodstype;
	}

	public void setGoodstype(Goodstype goodstype) {
		this.goodstype = goodstype;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Integer getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(Integer goodsprice) {
		this.goodsprice = goodsprice;
	}

	public String getUsedtime() {
		return this.usedtime;
	}

	public void setUsedtime(String usedtime) {
		this.usedtime = usedtime;
	}

	public String getGoodsdetails() {
		return this.goodsdetails;
	}

	public void setGoodsdetails(String goodsdetails) {
		this.goodsdetails = goodsdetails;
	}

	public String getGoodsphoto() {
		return this.goodsphoto;
	}

	public void setGoodsphoto(String goodsphoto) {
		this.goodsphoto = goodsphoto;
	}

	public Boolean getGoodsfalg() {
		return this.goodsfalg;
	}

	public void setGoodsfalg(Boolean goodsfalg) {
		this.goodsfalg = goodsfalg;
	}

	public Set getGorders() {
		return this.gorders;
	}

	public void setGorders(Set gorders) {
		this.gorders = gorders;
	}

}