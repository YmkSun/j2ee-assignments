package action;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import entity.*;
import service.*;

public class SearchEmpServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

		HttpSession session=request.getSession();
		int id=(int) session.getAttribute("empid");
		System.out.println("id in servlet:"+id);
		DBOperation dbo=new DBOperation();
		Employee employee=dbo.search(id);
		
		if(employee!=null){
			session.setAttribute("empsearched", employee);
			response.sendRedirect("./searchdone.jsp");
		}
		else{
			response.sendRedirect("./notfound.jsp");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
	}

}
