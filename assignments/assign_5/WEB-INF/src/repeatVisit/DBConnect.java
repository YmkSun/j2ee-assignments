package repeatVisit;

import java.sql.*;
import java.util.*;

public class DBConnect {
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect(){
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
		
	public HashMap<String, User> getProfile(){
		HashMap<String, User> db=new HashMap<String, User>();
		String mail;
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from profile";
			rs=st.executeQuery(sql);
						
			while(rs.next()){
				User u=new User();
				u.setFirstname(rs.getString(1));
				u.setSurname(rs.getString(2));
				u.setEmail(rs.getString(3));
				mail=rs.getString(3);
				u.setMobile_no(rs.getString(4));
				u.setDate_of_birth(rs.getString(5));
				u.setCountry(rs.getString(6));
				u.setPassword(rs.getString(7));
				u.setSubscribe(rs.getString(8));
				u.setCheck_policy(rs.getString(9));
				
				db.put(mail, u);
			}
			
			System.out.println("User Profile Data successful...");
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return db;
	}

}
