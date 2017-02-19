package com.msp.util;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class SystemDetails {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		/*Properties prop=System.getProperties();
		System.out.println("Properties:-"+prop.getProperty("user.name"));
		Set set=prop.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println("Properties:-"+it.next());
		}*/
		
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName=scan.nextLine();
		System.out.println(userName);*/
	/*	
		Console con=System.console();
		String name=con.readLine("Please enter user name : ");
		System.out.println(name);*/
		
		int n, temp;
		   Scanner s = new Scanner(System.in);
		   
		   System.out.print("Enter no. of elements you want in array:");
		   n = s.nextInt();
		   int a[] = new int[n];
		   System.out.println("Enter all the elements:");
		   for (int i=0; i<n; i++) 
		    {
		    a[i]=s.nextInt();
		    }
	}

}
