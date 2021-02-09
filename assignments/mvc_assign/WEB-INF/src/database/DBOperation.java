package database;

import java.sql.*;
import person.PersonalProfile;

public class DBOperation {
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public DBOperation(){
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
	
	public PersonalProfile getProfile(String mail){
		PersonalProfile p=new PersonalProfile();
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from persondb";
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				if(mail.equals(rs.getString(3))){
					p.setFirstName(rs.getString(1));
					p.setLastName(rs.getString(2));
					p.setEmail(rs.getString(3));
					p.setPassword(rs.getString(4));
					p.setAddress(rs.getString(5));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return p;
				
	}

}
