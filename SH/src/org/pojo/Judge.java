package org.pojo;

import java.sql.Timestamp;

/**
 * Judge entity. @author MyEclipse Persistence Tools
 */

public class Judge implements java.io.Serializable {

	// Fields

	private String judgeid;
	private Gorder gorder;
	private Timestamp judgetime;
	private String judges;

	// Constructors

	/** default constructor */
	public Judge() {
	}

	/** minimal constructor */
	public Judge(String judgeid, Gorder gorder, Timestamp judgetime) {
		this.judgeid = judgeid;
		this.gorder = gorder;
		this.judgetime = judgetime;
	}

	/** full constructor */
	public Judge(String judgeid, Gorder gorder, Timestamp judgetime,
			String judges) {
		this.judgeid = judgeid;
		this.gorder = gorder;
		this.judgetime = judgetime;
		this.judges = judges;
	}

	// Property accessors

	public String getJudgeid() {
		return this.judgeid;
	}

	public void setJudgeid(String judgeid) {
		this.judgeid = judgeid;
	}

	public Gorder getGorder() {
		return this.gorder;
	}

	public void setGorder(Gorder gorder) {
		this.gorder = gorder;
	}

	public Timestamp getJudgetime() {
		return this.judgetime;
	}

	public void setJudgetime(Timestamp judgetime) {
		this.judgetime = judgetime;
	}

	public String getJudges() {
		return this.judges;
	}

	public void setJudges(String judges) {
		this.judges = judges;
	}

}