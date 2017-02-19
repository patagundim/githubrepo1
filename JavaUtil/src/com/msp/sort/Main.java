package com.msp.sort;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Order o1=new Order(1,2.3f,"I1");
	Order o2=new Order(3,5.6f,"a");


	int res=o1.compareTo(o2);
	System.out.println("Result:"+res);
	System.out.println("Hashcode:-"+o1.hashCode());
	System.out.println("Hashcode:-"+o1.toString());
	}

}
