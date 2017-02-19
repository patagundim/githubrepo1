package com.msp.util;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		String enterTime="10:30";
		String exitTime="11:29";
		
		String s1[]=enterTime.split(":");
		String s2[]=exitTime.split(":");
		int s=Integer.valueOf(s1[0])*60;
		int Totaltime=((Integer.valueOf(s2[0])*60)+Integer.valueOf(s2[1]))-((Integer.valueOf(s1[0])*60)+Integer.valueOf(s1[1]));
		int fare=2;
		float time=Totaltime/60f;
		if(time>=0 && time<=1)
		{
			fare=2+3;
		}
		else{
			fare=2+3+Math.round(time)*4;
		}
		System.out.println(fare);*/
		StringBuffer sb= new StringBuffer();
		sb.append("Buffer");
		String s1="Java";
		String s2=s1;
		
		System.out.println(s1+"--"+s2+"--");
		
		s1="Hello";
		System.out.println(s1+"--"+s2);
	}

}
