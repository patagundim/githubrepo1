package com.msp.objectstream;

import com.msp.objectstream.OuterClass.InnerClass;

public class ExternalClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*OuterClass.InnerClass in=new OuterClass().new InnerClass();
in.innerFunc();*/
		
		String[] st={"#shiv #hello #how #are #s #b","#hello hi. #wat"};
		String [] arr=new String[4];
		String s="#shiv hello how #are";
		for(int j=0;j<st.length;j++)
		{
			//System.out.println(st[j]);
			arr=st[j].split("\\s");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].contains("#"))
				{
					System.out.println(arr[i]);
				}
			}
		}
		
		System.out.println(arr.length);
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains("#"))
			{
				System.out.println(arr[i]);
			}
		}*/
		
	}

}
