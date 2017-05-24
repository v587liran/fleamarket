package org.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Goodstype entity. @author MyEclipse Persistence Tools
 */

public class Goodstype implements java.io.Serializable {

	// Fields

	private String goodstypeid;
	private String typename;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goodstype() {
	}

	/** minimal constructor */
	public Goodstype(String goodstypeid) {
		this.goodstypeid = goodstypeid;
	}

	/** full constructor */
	public Goodstype(String goodstypeid, String typename, Set goodses) {
		this.goodstypeid = goodstypeid;
		this.typename = typename;
		this.goodses = goodses;
	}

	// Property accessors

	public String getGoodstypeid() {
		return this.goodstypeid;
	}

	public void setGoodstypeid(String goodstypeid) {
		this.goodstypeid = goodstypeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}