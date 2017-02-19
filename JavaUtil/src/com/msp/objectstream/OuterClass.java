package com.msp.objectstream;

public class OuterClass {
public static int k=0;
	public void func1()
	{
		System.out.println("OuterClass");
	}
	public class InnerClass
	{
		int m=0;
		public void innerFunc()
		{
			k=100;
			System.out.println("Non static InnerClass");
			System.out.println("k:"+k);
			func1();
		}
	}
	static class InnerStaticClass
	{
		int i=0;
		public void innerStatFunc()
		{
			System.out.println("InnerStaticClass");
			System.out.println("I"+i);
			//func1();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass.InnerClass in=new OuterClass().new InnerClass();
		in.m=3;
		in.innerFunc();
		OuterClass.InnerStaticClass sin=new OuterClass.InnerStaticClass();
		sin.i=10;
		sin.innerStatFunc();
	}

}
