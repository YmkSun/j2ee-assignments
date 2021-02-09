package database;

import java.sql.*;
import java.util.*;
import profile.*;

public class DB {
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public DB(){
		try{
			//connect to database...
			Class.forName("com.mysql.jdbc.Driver");
			url="jdbc:mysql://localhost:3306/profile";
			c=DriverManager.getConnection(url,"root","root");
			
			/*
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url="jdbc:oracle:thin:@server6.oracle.imceits.mm:1523:imct";
			c=DriverManager.getConnection(url,"js2001","js2001");
			*/			
			
			st=c.createStatement();
			System.out.println("Connected...");
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("Error loading driver: "+ cnfe);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isProfile(String s1, String s2, String s3) {
		boolean b=false;
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from userProfile";
			rs=st.executeQuery(sql);
			while(rs.next()){
				if(s1.equals(rs.getString(1)) && s2.equals(rs.getString(4)) && s3.equals(rs.getString(3))){
					b=true;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;
				
	}
	
	public ArrayList<Profile> getProfile(){
		ArrayList<Profile> al=new ArrayList<Profile>();
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from userProfile";
			rs=st.executeQuery(sql);
			while(rs.next()){
				Profile p=new Profile();
				p.setUserID(rs.getString(1));
				p.setUserName(rs.getString(2));
				p.setPassword(rs.getString(3));
				p.setEmail(rs.getString(4));
				p.setAddress(rs.getString(5));
				
				al.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return al;
	}

}
