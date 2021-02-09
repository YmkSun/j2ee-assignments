package person;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import database.DBOperation;

public class PersonProfileServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		HttpSession session=request.getSession();
		
		String mail=(String)session.getAttribute("mail");
		
		PersonalProfile p=new DBOperation().getProfile(mail);
		
		if(p.getFirstName()==null){
			response.sendRedirect("./notfound.jsp");
		}
		else{
			session.setAttribute("pprofile", p);
			response.sendRedirect("./show.jsp");
		}
		
	}

}
