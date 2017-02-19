package com.msp.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ByteNCharStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//______----__________----------__________------------___________
//1: Start: Using ByteStream
		
		/*
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			long start=System.currentTimeMillis();
			 in= new FileInputStream("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/SystemDetails.java");
			 out= new FileOutputStream("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/Out.java");
			int c=0;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
			long end=System.currentTimeMillis()-start;
			System.out.println("Total time:-"+end+"ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			in.close();
			out.close();
		}
		*/
//End: Using ByteStream
//______----__________----------__________------------___________
		
		
//---------------------------------------------------------
//2:Start: Using CharacterStream
		
		/*FileReader input= null;
		FileWriter output=null;
		 long start=System.currentTimeMillis();
		 try
		 {
			 input=new FileReader("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/SystemDetails.java");
			 output=new FileWriter("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt");
			 int cr;
			 while((cr=input.read())!=-1)
		 {
			 output.write(cr);
		 }
		 long end=System.currentTimeMillis()-start;
		System.out.println("Total time:-"+end+"ms");
		 }
		 finally
		 {
			 if(input!=null)
			 {
				 input.close();
			 }
			 if(output!=null)
			 {
				 output.close();
			 }
		 }
	*/
//End: Using CharacterStream
//______----__________----------__________------------___________
	
//---------------------------------------------------------
/*3:Start: Using BufferedReader to read lines
 instead of reading char to read line*/
	
	BufferedReader read= null;
	BufferedWriter write=null;
	//PrintWriter print=null;
	long start=System.currentTimeMillis();
	try
	{
		read=new BufferedReader(new FileReader("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/SystemDetails.java"));
		write=new BufferedWriter(new FileWriter("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt"));
		//print=new PrintWriter(new FileWriter("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt"));
		//read.mark(1000);
		//read.reset();
		String l;
	while((l=read.readLine())!=null)
	{
		write.write(l);
		//print.println(l);
	}
	long end=System.currentTimeMillis()-start;
	System.out.println("Total time:-"+end+"ms");
	}
	finally
	{
		if(read!=null)
		 {
			read.close();
		 }
		if(write!=null)
		//if(print!=null)
		 {
			write.close();
			 //print.close();
		 }
	}
//End: Using CharacterStream
//______----__________----------__________------------___________

	}
}