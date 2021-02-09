package foodDrink;

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
	
	public ArrayList<FoodDrink> checkFD(String type){
		//creating the arrayList of FoodDrink object...
		ArrayList<FoodDrink> fdl=new ArrayList<FoodDrink>();
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from FoodDrink where foodtype='"+type+"'";
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				//creating an object instance of FoodDrink class...
				FoodDrink fd=new FoodDrink();
				fd.setFoodType(rs.getString(1));
				fd.setFoodName(rs.getString(2));
				fd.setOrderType(rs.getString(3));
				fd.setQuantity(rs.getInt(4));
				fd.setPrice(rs.getDouble(5));
				
				//adding FoodDrink object instances into arrayList...
				fdl.add(fd);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//return the arrayList...
		return fdl;
	}
}
