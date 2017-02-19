package com.msp.objectstream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectStreams {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws MyException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		String fileName="C:/Users/mspatagundi/workspacejuno/JavaUtil/src/com/msp/objectstream/person.tmp";
		FileOutputStream foo=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(foo);
		Address add= new Address();
		add.sethNo(23);
		add.setStNo(12);
		add.setPin(591312);
		
		Person per=new Person();
		per.setFname("Mahaninga");
		per.setLname("Patagundi");
		per.setAdd(add);
		oos.writeObject(per);
		oos.writeObject(add);
		
		oos.close();
		
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
			Object obj=null;
			try
			{
			while((obj=ois.readObject())!=null)
			{
				if(obj instanceof Person)
				{
					System.out.println("Person:-"+obj.toString());
					System.out.println("------------------");
				}
				else if(obj instanceof Address)
				{
					System.out.println("Address:-"+obj.toString());
					//throw new MyException("Hello");
				}
			}
			}
			catch(EOFException e)
			{
				
			}
		ois.close();
		}
	
	/*catch(MyException e)
	{
	//custom checked exception(normal)
		e.printStackTrace();
	}*/
	/*catch(MyRunTimeException e)
	{
		e.printStackTrace();
	}*/
	//custom unchecked (runtime) exception
	/*Address ad=(Address) ois.readObject();
	if(ad instanceof Address)
	{
		throw new MyRunTimeException("hello");
	}*/

}
