package profile;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileInfoServlet extends HttpServlet {
	
	private String[] profileDB;
	
	private String url;
	private Connection c;
	private Statement st;
	private int rs;
	
	//public void init(){}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		profileDB=new String[11];
		
		profileDB[0]=req.getParameter("fname");
		profileDB[1]=req.getParameter("sname");
		profileDB[2]=req.getParameter("email");
		profileDB[3]=req.getParameter("mobile1");
		profileDB[4]=req.getParameter("mobile2");
		profileDB[5]=req.getParameter("dob");
		profileDB[6]=req.getParameter("country");
		profileDB[7]=req.getParameter("password");
		profileDB[8]=req.getParameter("pconfirm");
		profileDB[9]=req.getParameter("subs");
		profileDB[10]=req.getParameter("check");
				
		if(!profileDB[7].equals(profileDB[8])){
			System.out.println("Password and Confrim Password are not the same...");
			res.sendRedirect("./profile.html");
		}
		else{
			
			if(checkInfo()){
				
				for(String s: profileDB){
					System.out.print(s+", ");
				}
				
				new DBConnect().insertDB(profileDB);
				
				req.getServletContext().setAttribute("db1", profileDB[0]);
				req.getServletContext().setAttribute("db2", profileDB[1]);
				req.getServletContext().setAttribute("db3", profileDB[2]);
				String mobile=profileDB[3]+"-"+profileDB[4];
				req.getServletContext().setAttribute("db4", mobile);
				req.getServletContext().setAttribute("db5", profileDB[5]);
				req.getServletContext().setAttribute("db6", profileDB[6]);
				req.getServletContext().setAttribute("db7", profileDB[7]);
				req.getServletContext().setAttribute("db8", profileDB[9]);
				req.getServletContext().setAttribute("db9", profileDB[10]);
				
				res.sendRedirect("./display");
			}
			else{
				System.out.println("Fill all the inputs...");
				res.sendRedirect("./profile.html");
			}
		}
		
		
	}
	
	public boolean checkInfo(){
		boolean b=true;
		
		for(int i=0; i<=8; i++){
			if(profileDB[i].equals("")){
				b=false;
			}
		}
				
		return b;
	}
	
}
