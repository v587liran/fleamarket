package org.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Gorder entity. @author MyEclipse Persistence Tools
 */

public class Gorder implements java.io.Serializable {

	// Fields

	private String gorderid;
	private Goods goods;
	private Guser guser;
	private Payment payment;
	private String tradeaddress;
	private Timestamp gordertime;
	private Boolean gorderflag;
	private Set judges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Gorder() {
	}

	/** minimal constructor */
	public Gorder(String gorderid, Timestamp gordertime) {
		this.gorderid = gorderid;
		this.gordertime = gordertime;
	}

	/** full constructor */
	public Gorder(String gorderid, Goods goods, Guser guser, Payment payment,
			String tradeaddress, Timestamp gordertime, Boolean gorderflag,
			Set judges) {
		this.gorderid = gorderid;
		this.goods = goods;
		this.guser = guser;
		this.payment = payment;
		this.tradeaddress = tradeaddress;
		this.gordertime = gordertime;
		this.gorderflag = gorderflag;
		this.judges = judges;
	}

	// Property accessors

	public String getGorderid() {
		return this.gorderid;
	}

	public void setGorderid(String gorderid) {
		this.gorderid = gorderid;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Guser getGuser() {
		return this.guser;
	}

	public void setGuser(Guser guser) {
		this.guser = guser;
	}

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getTradeaddress() {
		return this.tradeaddress;
	}

	public void setTradeaddress(String tradeaddress) {
		this.tradeaddress = tradeaddress;
	}

	public Timestamp getGordertime() {
		return this.gordertime;
	}

	public void setGordertime(Timestamp gordertime) {
		this.gordertime = gordertime;
	}

	public Boolean getGorderflag() {
		return this.gorderflag;
	}

	public void setGorderflag(Boolean gorderflag) {
		this.gorderflag = gorderflag;
	}

	public Set getJudges() {
		return this.judges;
	}

	public void setJudges(Set judges) {
		this.judges = judges;
	}

}