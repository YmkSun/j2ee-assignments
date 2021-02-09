package repeatVisit;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RepeatVisitServlet extends HttpServlet {
	
	
	private DBConnect db;
	private HashMap<String, User> userDB;
	private User user;
	
	public void init(){
		db=new DBConnect();
		userDB=db.getProfile();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		
		request.getServletContext().setAttribute("email", email);
		
		boolean b=checkUser(email, password);
		
		if(b==true){			
			
			String countLogin="0";
			
			Cookie[] cookie=request.getCookies();
			if(cookie!=null){
				for(Cookie c: cookie){
					if(c.getName().equals("accessCount")){
						countLogin=c.getValue();
					}
				}
			}
			String text=null;
			int count=0;
			try {
				count = Integer.parseInt(countLogin)+1; 
			} catch(NumberFormatException nfe) { }
			if(count==1){
				text="Welcome New User <i>"+email+"</i>!!!";
			}
			else{
				text="Welcome Back <i>"+email+"</i>!!!";
			}
			Cookie visitedCookie=new Cookie("accessCount",String.valueOf(count));			
			response.addCookie(visitedCookie);
			
			response.setContentType("text/html");
			
			PrintWriter pw=response.getWriter();
			
			pw.println("<html>");
			
			pw.println("<head>");
			pw.println("<title>User Profile Info.</title>");
			pw.println("</head>");
			
			pw.println("<body>");
			
			pw.println("<h3>"+text+"</h3>");
			
			pw.println("<table>");
			pw.println("<tr><td>First Name:</td><td>"+user.getFirstname()+"</td></tr>");
			pw.println("<tr><td>Surname:</td><td>"+user.getSurname()+"</td></tr>");
			pw.println("<tr><td>Email:</td><td>"+user.getEmail()+"</td></tr>");
			pw.println("<tr><td>Mobile No:</td><td>"+user.getMobile_no()+"</td></tr>");
			pw.println("<tr><td>Date of Birth:</td><td>"+user.getDate_of_birth()+"</td></tr>");
			pw.println("<tr><td>Country:</td><td>"+user.getCountry()+"</td></tr>");
			pw.println("<tr><td>Password:</td><td>"+user.getPassword()+"</td></tr>");
			pw.println("<tr><td>Subscribed:</td><td>"+user.getSubscribe()+"</td></tr>");
			pw.println("<tr><td>Check Policy:</td><td>"+user.getCheck_policy()+"</td></tr>");
			pw.println("</table>");
			
			pw.println("<h3>You have login "+count+" times...</h3>");
			
			pw.println("<br><br><a href='login.html'>Log Out</a>");
			
			pw.println("</body>");
			
			pw.println("</html>");
		}
		else{
			RequestDispatcher dispatcher = session.getServletContext().getRequestDispatcher("/login.html");
			if (dispatcher != null){
				dispatcher.forward(request, response);
			}
			//response.sendRedirect("./login.html");
		}
		
	}
	
	public boolean checkUser(String mail, String pass){
		boolean b=false;
		
		if(userDB.containsKey(mail)){
			user=userDB.get(mail);
			
			String m=user.getEmail();
			String p=user.getPassword();
			
			if(m.equals(mail) && p.equals(pass)){
				b=true;
			}
		}
				
		return b;
	}

}
