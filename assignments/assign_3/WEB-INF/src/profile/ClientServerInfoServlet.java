package profile;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClientServerInfoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		
		PrintWriter pr=res.getWriter();
		
		String clientIP=req.getRemoteAddr();
		String clientHost=req.getRemoteHost();
		
		String serverName=req.getServerName();
		int serverPort=req.getServerPort();
		
		pr.println("<html>");
		
		pr.println("<head>");
		pr.println("<title>Client Server Info</title>");
		pr.println("</head>");
		
		pr.println("<body>");
		
		pr.println("<h3>Client Information</h3>");
		pr.println("Client Name: "+clientHost);
		pr.println("<br>Client IP: "+clientIP);
		
		pr.println("<br><br><h3>Server Information</h3>");
		pr.println("Server Name: "+serverName);
		pr.println("<br>Server Port: "+serverPort);
		
		pr.println("</body>");
		pr.println("</html>");
	
	}

}
