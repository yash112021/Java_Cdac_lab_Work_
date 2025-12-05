package com.demo.bean;

public class Skill {
	// data Members 
	private int sid;
	private String skname;
	private int experi;
	
	//default constructor 
	public Skill() {
		super();
	}

	// parmaterised constrcutor 
	public Skill(int sid, String skname, int experi) {
		super();
		this.sid = sid;
		this.skname = skname;
		this.experi = experi;
	}

	// getters and setters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSkname() {
		return skname;
	}

	public void setSkname(String skname) {
		this.skname = skname;
	}

	public int getExperi() {
		return experi;
	}

	public void setExperi(int experi) {
		this.experi = experi;
	}

	// toSTring MEthod
	@Override
	public String toString() {
		return "Skill [sid=" + sid + ", skname=" + skname + ", experi=" + experi + "]";
	}
	
	
	
	
	
	
	
}
