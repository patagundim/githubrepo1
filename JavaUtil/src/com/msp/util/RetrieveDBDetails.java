package com.msp.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class RetrieveDBDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//Register the driver
			
			//com.mysql.jdbc.Driver dr=new com.mysql.jdbc.Driver();//for Mysql database
			//DriverManager.registerDriver(dr);
			//Oracle.Jdbc.OracleDriver drr=new Oracle.Jdbc.OracleDriver();//for oracle data base
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","admin", "admin");
			
			if(con==null)
			{
				System.out.println("connection not Obtained");
			}
			//String query="INSERT INTO Student"+"(rollNO,name,age,standard )VALUES" + "(?,?,?,?)";
			//String query="INSERT INTO Student"+"(rollNO,name,age,standard )VALUES" + "(3,'mv',25,13)";
			/*String query="select a.rollNO,a.name,b.empId from Student a  JOIN college b ON a.rollNO=b.rollNo;";
			Statement st=con.createStatement();//This will provide non scrollable result set which travers only forward direction
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);//To get scrollable cursor 
			//through which we can read both in forward and backward direction
			ResultSet set=st.executeQuery(query);
			while(set.next())
			{
				System.out.println("rollNO:-"+set.getString("rollNO")+"--"+"empId:-"+set.getString("empId")+""+"Name:-"+set.getString("name"));
				//System.out.println("empIdL:-"+set.getString("empId"));
			}*/
			/*
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1,1);
			stmt.setString(2, "MS");
			stmt.setInt(3,20);
			stmt.setInt(4,12);
			stmt.execute();*/
			
			 String storeProcQuery="{ call getStudentDetails()}";
			CallableStatement csta=con.prepareCall(storeProcQuery);
			ResultSet set=csta.executeQuery();
			while(set.next())
			{
				Map map= new HashMap();
				System.out.println("rollNO:-"+set.getString("rollNO"));
				//System.out.println("empIdL:-"+set.getString("empId"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
