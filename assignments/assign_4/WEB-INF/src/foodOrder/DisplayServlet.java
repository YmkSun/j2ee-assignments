package foodOrder;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String orderType=request.getParameter("order");
		String quality=request.getParameter("qty");
		String email=(String)request.getServletContext().getAttribute("email");
		
		String drink="", fruit="";
		boolean b=true;
		
		
		if(/*request.getParameter("drink").equals("") ||*/ request.getParameter("drink")==null){
			drink+="none";
		}
		else{
			String[] drinks=request.getParameterValues("drink");
			for(int i=0; i<drinks.length; i++){
				drink+=drinks[i];
				if(i<drinks.length-1){
					drink+=", ";
				}
			}
		}
		
		
		if(request.getParameter("fruit")==null /*|| request.getParameter("fruit").equals("")*/){
			b=false;
		}
		else{
			String[] fruits=request.getParameterValues("fruit");
			for(int i=0; i<fruits.length; i++){
				fruit+=fruits[i];
				if(i<fruits.length-1){
					fruit+=", ";
				}
			}
		}
		
		System.out.println(email+"-"+orderType+"-"+drink+"-"+fruit+"-"+quality);
		
		
		
		if(b==false || orderType==null || quality.equals("") || quality==null){
			HttpSession session=request.getSession();
			RequestDispatcher dispatcher = session.getServletContext().getRequestDispatcher("/display");
			if (dispatcher != null){
				dispatcher.forward(request, response);
			}
		}
		
		else{
			String[] foDB=new String [5];
			foDB[0]=email;
			foDB[1]=orderType;
			foDB[2]=drink;
			foDB[3]=fruit;
			foDB[4]=quality;
			
			new DBConnect().insertOrder(foDB);
			
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			pw.println("<html>");
			
			pw.println("<head>");
			pw.println("<title>Food Order Information</title>");
			pw.println("</head>");
			
			pw.println("<body bgcolor='#FFCCFF'>");
			
			pw.println("<h3>Customer Food Order Information</h3>");
			
			pw.println("<table>");
			
			pw.println("<tr><td>Email:</td><td>"+email+"</td></tr>");
			pw.println("<tr><td>Order Type:</td><td>"+orderType+"</td></tr>");
			pw.println("<tr><td>Drink:</td><td>"+drink+"</td></tr>");
			pw.println("<tr><td>Fruit:</td><td>"+fruit+"</td></tr>");
			pw.println("<tr><td>Quality:</td><td>"+quality+"</td></tr>");
			
			pw.println("</table>");
			
			pw.println("</body>");
			
			pw.println("</html>");
		}
		
	}

}
