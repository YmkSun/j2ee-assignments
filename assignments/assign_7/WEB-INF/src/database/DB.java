package database;

import java.sql.*;
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
	
	public void insertDB(Profile p) throws SQLException{
		Profile pro=p;
		//execute statement to update or insert into profile table...
		String sql="Insert into userProfile values('"+pro.getUserID()+"', '"+pro.getUserName()+"', '"+pro.getPassword()+"', '"+pro.getEmail()+"', '"+pro.getAddress()+"')";
		st.executeUpdate(sql);
		System.out.println("Data insert successful...");
				
	}

}
