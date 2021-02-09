package profile;

import java.sql.*;

public class DBConnect {

	private String[] profileDB;

	private String url;
	private Connection c;
	private Statement st;
	private int rs;
	
	public DBConnect(){
		try{
			//connect to database...
			Class.forName("com.mysql.jdbc.Driver");
			url="jdbc:mysql://localhost:3306/profile";
			c=DriverManager.getConnection(url,"root","root");
			
			//c=DriverManager.getConnection("jdbc:oracle:thin:@server6.oracle.imceits.mm:1523:imct","js2001","js2001");
			
			st=c.createStatement();
			System.out.println("Connected...");
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("Error loading driver: "+ cnfe);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertDB(String str[]){		
		profileDB=str;
		try {
			String mobile=profileDB[3]+"-"+profileDB[4];
			//execute statement to update or insert into profile table...
			String sql="Insert into profile values('"+profileDB[0]+"', '"+profileDB[1]+"', '"+profileDB[2]+"', '"+mobile+"', '"+profileDB[5]+"', '"+profileDB[6]+"', '"+profileDB[7]+"', '"+profileDB[9]+"', '"+profileDB[10]+"')";
			rs=st.executeUpdate(sql);
			System.out.println("Data insert successful...");
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	}
	
}
