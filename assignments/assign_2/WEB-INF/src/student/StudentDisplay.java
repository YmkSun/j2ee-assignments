package student;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentDisplay extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		PrintWriter pr=response.getWriter();
		
		pr.println("<html>");
		
		pr.println("<head>");
		pr.println("<title>Student Display Form</title>");
		pr.println("</head>");
		
		pr.println("<body>");
		
		pr.println("<h2>Student Information Display</h2>");
		
		pr.println("<br><table>");
		
		pr.println("<tr><td>Name:</td><td>"+request.getParameter("sname")+"</td></tr>");
		pr.println("<tr><td>Prno:</td><td>"+request.getParameter("prno")+"</td></tr>");
		pr.println("<tr><td>Class Name:</td><td>"+request.getParameter("cname")+"</td></tr>");
		pr.println("<tr><td>Training Center:</td><td>"+request.getParameter("tcenter")+"</td></tr>");
		
		pr.println("</table>");
		
		pr.println("</body>");
		
		pr.println("</html>");
		
	}

}
