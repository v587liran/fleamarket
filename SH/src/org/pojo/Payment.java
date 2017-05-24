package org.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private String paymentid;
	private String payment;
	private Set gorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** minimal constructor */
	public Payment(String paymentid) {
		this.paymentid = paymentid;
	}

	/** full constructor */
	public Payment(String paymentid, String payment, Set gorders) {
		this.paymentid = paymentid;
		this.payment = payment;
		this.gorders = gorders;
	}

	// Property accessors

	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Set getGorders() {
		return this.gorders;
	}

	public void setGorders(Set gorders) {
		this.gorders = gorders;
	}

}