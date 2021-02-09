package student;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentInfo extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		PrintWriter pr=response.getWriter();
		
		pr.println("<html>");
		
		pr.println("<head>");
		pr.println("<title>Student Information Form</title>");
		pr.println("</head>");
		
		pr.println("<body>");
		
		pr.println("<h2>Student Information Form</h2>");
		
		pr.println("<form action='studentForm2'>");
		
		pr.println("<br><table>");
		
		pr.println("<tr><td><label>Name</label></td><td><input type='text' name='sname' size='20'></td></tr>");
		pr.println("<tr><td><label>Prno</label></td><td><input type='text' name='prno' size='20'></td></tr>");
		pr.println("<tr><td><label>Class Name</label></td><td><input type='text' name='cname' size='20'></td></tr>");
		pr.println("<tr><td><label>Training Center</label></td><td><input type='text' name='tcenter' size='20'></td></tr>");
		pr.println("<tr><td><input type='submit' value='Submit'></td><td><input type='submit' value='Cancel'></td></tr>");
		
		pr.println("</form>");
		
		pr.println("<br><br>");
		
		pr.println("</body>");
		
		pr.println("</html>");
		
		
	}

}
