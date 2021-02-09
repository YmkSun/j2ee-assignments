package foodOrder;

import java.sql.*;

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
	
	public boolean checkUser(String mail, String pass){
		boolean b=false;
		String m,p;
		
		try {
			//execute statement to update or insert into profile table...
			String sql="Select * from profile";
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				m=rs.getString(3);
				p=rs.getString(7);
				System.out.println(m+" "+p);
				
				if(m.equals(mail) && p.equals(pass)){
					b=true;
					break;
				}				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return b;
	}
	
	public void insertOrder(String[] fodb){
		String[] foDB=fodb;
		try {
			//execute statement to update or insert into profile table...
			String sql="Insert into food_order values('"+foDB[0]+"', '"+foDB[1]+"', '"+foDB[2]+"', '"+foDB[3]+"', '"+foDB[4]+"')";
			st.executeUpdate(sql);
			System.out.println("Food Order Data insert successful...");
			
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
