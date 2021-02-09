package action;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import entity.*;
import service.*;

public class EmployeeServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

		HttpSession session=request.getSession();
		Employee e=(Employee)session.getAttribute("emp");
		System.out.println(e.toString());
		DBOperation dbo=new DBOperation();
		boolean b=dbo.Save(e);
		if(b==true){
			response.sendRedirect("./insertdone.jsp");
		}
		else{
			response.sendRedirect("./error.jsp");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
	}


}
