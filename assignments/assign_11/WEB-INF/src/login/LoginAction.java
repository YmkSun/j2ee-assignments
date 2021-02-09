package login;

import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String username, password;
	//private String sname, email, address, contactNo;
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public LoginAction(){
		
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() throws Exception{
		
		boolean b=false;
		
		if(!(getUsername().trim().equals("")) && !(getPassword().trim().equals(""))){
			String sql="Select * from login where username='"+getUsername()+"' and password='"+getPassword()+"'";
			rs=st.executeQuery(sql);
			
			while(rs.next()){
				b=true;
			}
		}
						
		if(b==true){
			HttpServletRequest request = ServletActionContext.getRequest(); 
			HttpSession session = request.getSession();			
			session.setAttribute("user", getUsername());
			return SUCCESS;
		}
		else{
			addActionError(getText("label.error"));
			return ERROR;
		}
	}
	
	public String display() throws Exception{
		
		boolean b=false;
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		String sql="Select * from registrationDB";
		rs=st.executeQuery(sql);
		
		while(rs.next()){
			Student s=new Student();
			s.setName(rs.getString(1));
			s.setEmail(rs.getString(2));
			s.setAddr(rs.getString(3));
			s.setContact(rs.getString(4));
			al.add(s);
			b=true;
		}
		
		if(b==true){
			HttpServletRequest request = ServletActionContext.getRequest(); 
			HttpSession session = request.getSession();			
			session.setAttribute("students", al);
			return SUCCESS;
		}
		else{
			addActionError(getText("label.nodata"));
			return ERROR;
		}
	}

}
