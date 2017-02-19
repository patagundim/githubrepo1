package com.msp.objectstream;

import java.io.Serializable;


public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fname;
	private String lname;
	private Address add;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public String toString()
	{
		StringBuffer buff= new StringBuffer();
		buff.append("Fname:"+fname);
		buff.append("\n");
		buff.append("Lname:"+lname);
		buff.append("\n");
		buff.append("Address:"+add.toString());
		
		return buff.toString();}
}
