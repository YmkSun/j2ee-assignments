package student;

import java.sql.*;

import com.opensymphony.xwork2.ActionSupport;

public class StudentRegistration extends ActionSupport {
	
	private String sname, email, address, contactNo;
	private String message;
	
	private String url;
	private Connection c;
	private Statement st;
	private ResultSet rs;
	
	public StudentRegistration(){}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSname() {
		return sname;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNo() {
		return contactNo;
	}
	
	public String getMessage() {
		return message;
	}

	public String toString() {
		return "StudentRegistration [sname=" + sname + ", email=" + email + ", address=" + address + ", contactNo=" + contactNo + "]";
	}
	
	public String execute() {
		boolean flag;
		
		if(!(getSname().trim().equals("")) && !(getEmail().trim().equals("")) && !(getAddress().trim().equals("")) && !(getContactNo().trim().equals(""))){
			System.out.println("not null");
			
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
				
				String sql="Insert into registrationDB values('"+getSname()+"', '"+getEmail()+"', '"+getAddress()+"', '"+getContactNo()+"')"; //sname, email, address, contactNo
				st.executeUpdate(sql);
				
				flag=true;
			
			}catch (Exception e) {
				flag=false;
				addActionError(getText(e.getMessage()));
				
				System.out.println("Duplicate User...");
			}
			
			
		}
		else{
			flag=false;
			addActionError(getText("label.error"));
			
		}
		
		if(flag==true){
			setMessage("Student Insert Successful");
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}

}
