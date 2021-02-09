package student;

import java.sql.*;

public class DBOperation {
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public DBOperation(){
		try{
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
			
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void acceptStudent(Student s) throws Exception{
		String sql="Insert into studentDB12 values('"+s.getRollNo()+"', '"+s.getFullName()+"', '"+s.getEmailID()+"', '"+s.getContactNo()+"')";
		st.executeUpdate(sql);
		System.out.println("Student data insert successful!");
	}
	
	public Student inquiryStudent(String rollno) throws Exception{
		String rno=rollno;
		Student s=new Student();
		
		String sql="Select * from studentDB12 where rollno='"+rno+"'";
		rs=st.executeQuery(sql);
		
		while(rs.next()){
			s.setRollNo(rs.getString(1));
			s.setFullName(rs.getString(2));
			s.setEmailID(rs.getString(3));
			s.setContactNo(rs.getString(4));
		}
		
		return s;
	}

}
