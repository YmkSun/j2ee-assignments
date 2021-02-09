package foodOrder;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AcceptServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		
		request.getServletContext().setAttribute("email", email);
		
		boolean b=new DBConnect().checkUser(email, password);
		
		if(b==true){
			response.setContentType("text/html");
			
			PrintWriter pw=response.getWriter();
			
			pw.println("<html>");
			
			pw.println("<head>");
			pw.println("<title>Customer Food Order</title>");
			pw.println("</head>");
			
			pw.println("<body bgcolor='#FFCCFF'>");
			
			pw.println("<form action=\"display\" method='get'>");
			pw.println("<h2>Customer's Order Form</h2>" +
					"<table width='100%'>" +
							"<tr>" +
							"<td width='30%'><h3>Customer Email:</h3></td>" +
							"<td width='30%'>"+email+"</td><td width='30%'></td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'><h3>Order Type:</h3></td>" +
							"<td width='30%'><input type='radio' name='order' value='Take Away'>&nbsp;Take Away</td>" +
							"<td width='30%'><input type='radio' name='order' value='Dine in Service'>&nbsp;Dine in Service</td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'><h3>Select Drink:</h3></td>" +
							"<td width='30%'></td>" +
							"<td width='30%'></td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'>&emsp;&emsp;&emsp;<input type='checkbox' name='drink' value='Milk'>Milk</td>" +
							"<td width='30%'><input type='checkbox' name='drink' value='Butter'>Butter</td>" +
							"<td width='30%'><input type='checkbox' name='drink' value='Cheese'>Cheese</td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'><h3>Select Fruit:(Required)</h3></td>" +
							"<td width='30%'></td>" +
							"<td width='30%'></td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'>&emsp;&emsp;&emsp;<input type='checkbox' name='fruit' value='Apple'>Apple</td>" +
							"<td width=''30%'><input type='checkbox' name='fruit' value='Banana'>Banana</td>" +
							"<td width='30%'><input type='checkbox' name='fruit' value='Grape'>Grape</td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%' align='center'><h3>Quality:</h3></td>" +
							"<td width='30%'><input type='text' name='qty' size='30' required></td>" +
							"<td width='30%'>Qty</td>" +
							"</tr>" +
							"<tr>" +
							"<td width='30%'></td>" +
							"<td width='30%'><input type='submit' name='orderbutton' value='Order'></td>" +
							"<td width='30%'></td>" +
							"</tr>" +
							"</table>");
			pw.println("</form>");
			
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

}
