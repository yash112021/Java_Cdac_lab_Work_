package com.demo.bean;

public class Faculty {
	// data Members 
	private int fid;
	private String fname;
	private Skill sk;
	private Address add;
	
	// 
	public Faculty() {
		//	super();
	}

	
	// parameterised constructor 
	public Faculty(int fid, String fname, Skill sk, Address add) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.sk = sk;
		this.add = add;
	}


	// getters and setters
	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public Skill getSk() {
		return sk;
	}


	public void setSk(Skill sk) {
		this.sk = sk;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", sk=" + sk + ", add=" + add + "]";
	}

	
	
	
}
