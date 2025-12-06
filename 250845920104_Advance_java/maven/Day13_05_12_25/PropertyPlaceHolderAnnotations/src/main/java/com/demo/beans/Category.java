package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c1")
public class Category {
	// date Members
	@Value("${cat.cid}")
	private int cid;
	@Value("${cat.cname}")
	private String cname;
	@Value("${cat.descr}")
	private String descr;
	
	// default constructor 
	public Category() {
		super();
	}
	
	// parameterised constructor
	public Category(int cid, String cname, String descr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.descr = descr;
	}

	
	// getters and setters 
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	// toString Method 
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", descr=" + descr + "]";
	}

	
	
	
	
	
}
