package com.msp.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DummyTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		String startDateString = "abcda";
		Pattern pat= Pattern.compile("(a)\\2");
		Matcher mat=pat.matcher(startDateString);
		System.out.println(mat.groupCount());
if(startDateString.matches("(a)\\1"))
{
	System.out.println("true");}
		/*DateFormat dtf= new SimpleDateFormat("MM/dd/yyyy");
		Date dt= dtf.parse(startDateString);
		DateFormat dtf2= new SimpleDateFormat("MM-dd-yyyy");
		String newDate=dtf2.format(dt);
		//String [] sa= new String[startDateString.split("/").length];
		//sa=startDateString.split("/");
		//String res=sa[0]+"-"+sa[1]+"-"+sa[2];
		System.out.println(newDate);*/
	   
	}

}
