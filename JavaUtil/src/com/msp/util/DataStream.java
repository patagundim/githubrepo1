package com.msp.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class DataStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		final int[] units={2,3,4,8,9,1,3};
		final double [] prices={14.2,25.4,36.4,69.4,85.6,25.4,36.4};
		final String [] desc={"Daal","Butter","chilly","Daal","Butter","chilly","kallu"};
		DataOutputStream out= new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt")));
		try
		{
		for(int i=0;i<prices.length;i++)
		{
			out.writeInt(units[i]);
			out.writeDouble(prices[i]);
			out.writeUTF(desc[i]);
		}
		}
		finally
		{
			out.close();
		}
		
		DataInputStream in= new DataInputStream(new BufferedInputStream(new FileInputStream("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt")));
		int uni;
		double pri;
		String des;
		double total=0.0;
		try
		{
		while(true)
		{
			uni=in.readInt();
			pri=in.readDouble();
			des=in.readUTF();
			System.out.format("You ordered %d" + " units of %s at $%.2f%n",
		            uni, des, pri);
		        total += uni * pri;
			
		}
		}
		catch(EOFException e)
		{
			
		}
	}

}
