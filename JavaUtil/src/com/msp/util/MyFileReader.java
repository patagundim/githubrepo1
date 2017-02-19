package com.msp.util;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		
		File file= new File("C:/Users/mspatagundi\\Desktop\\xml.xml");
		System.out.println(file.getName());
		if(file.isFile() && file.exists())
		{
			System.out.println("File exists");
		}
		FileReader read= new FileReader(file);
		//FileInputStream in= new FileInputStream(file);
		//FileOutputStream out= new FileOutputStream("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt");
		FileWriter write= new FileWriter("C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/util/out.txt");
		int l=(int) file.length();
		System.out.println(l);
		//byte[] c1=new byte[l]; //for FileInput stream
		char [] c1= new char[(int) file.length()];//for file reader
		int c;
		try{
		while((c=read.read(c1))!=-1)
		{
			System.out.println(c);
			write.write(c1);
			//out.write(c1);
		}
		}finally
		{
			read.close();
			//in.close();
			write.flush();
			write.close();
			//out.close();
			
		}
		FileDescriptor desc= new FileDescriptor();
		/*Path file1=Paths.get("C:\\Users\\mspatagundi\\Desktop\\xml.xml");
		try {
			String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\mspatagundi\\Desktop\\xml.xml")), StandardCharsets.UTF_8);
		System.out.println("text"+text.substring(text.indexOf("?>"), text.lastIndexOf(">")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*try (InputStream in = Files.newInputStream(file);
			    BufferedReader reader =
			      new BufferedReader(new InputStreamReader(in))) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        System.out.println(line);
			    }
			} catch (IOException x) {
			    System.err.println(x);
			}*/
	}
}


