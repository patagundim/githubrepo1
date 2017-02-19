package com.msp.objectstream;

import java.io.Serializable;


public class Address  implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getStNo() {
		return stNo;
	}
	public void setStNo(int stNo) {
		this.stNo = stNo;
	}
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	private int stNo;
	private int hNo;
	private int pin;
	
	public String toString()
	{
		StringBuffer buff= new StringBuffer();
		buff.append("home No:"+hNo);
		buff.append("\n");
		buff.append("Street No:"+stNo);
		buff.append("\n");
		buff.append("pin No:"+pin);
		
		return buff.toString();}
}
