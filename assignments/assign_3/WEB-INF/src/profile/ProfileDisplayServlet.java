package profile;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileDisplayServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		
		PrintWriter pr=res.getWriter();
		
		String[] db=new String[9];
		db[0]=(String)req.getServletContext().getAttribute("db1");
		db[1]=(String)req.getServletContext().getAttribute("db2");
		db[2]=(String)req.getServletContext().getAttribute("db3");
		db[3]=(String)req.getServletContext().getAttribute("db4");
		db[4]=(String)req.getServletContext().getAttribute("db5");
		db[5]=(String)req.getServletContext().getAttribute("db6");
		db[6]=(String)req.getServletContext().getAttribute("db7");
		db[7]=(String)req.getServletContext().getAttribute("db8");
		db[8]=(String)req.getServletContext().getAttribute("db9");
		
		pr.println("<html>");
		
		pr.println("<head>");
		pr.println("<title>Profile Display Servlet</title>");
		pr.println("</head>");
		
		pr.println("<body>");
		
		pr.println("<h3>Profile Information Display</h3>");
		
		pr.println("<table>");
		
		pr.println("<tr><td>First Name: </td><td>"+db[0]+"</td></tr>");
		pr.println("<tr><td>Surname:</td><td>"+db[1]+"</td></tr>");
		pr.println("<tr><td>E-Mail:</td><td>"+db[2]+"</td></tr>");
		pr.println("<tr><td>Mobile Phone:</td><td>"+db[3]+"</td></tr>");
		pr.println("<tr><td>Date of Birth:</td><td>"+db[4]+"</td></tr>");
		pr.println("<tr><td>Country:</td><td>"+db[5]+"</td></tr>");
		pr.println("<tr><td>Password:</td><td>"+db[6]+"</td></tr>");
		pr.println("<tr><td>Subscribed:</td><td>"+db[7]+"</td></tr>");
		pr.println("<tr><td>Checked Policy:</td><td>"+db[8]+"</td></tr>");
		
		pr.println("</table>");	
		
		
		pr.println("<br><br><a href='link'>Client Server Info.</a>");
		
		pr.println("</body>");
		pr.println("</html>");
	}

}
