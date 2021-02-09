package foodDrink;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderCartServlet extends HttpServlet {
	
	//doGet method...
	public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws IOException, ServletException {
		
		//creating a httpSession...
		HttpSession session=rq.getSession();
		
		//getting an arrayList attribute from session...
		ArrayList<String> cartItems=(ArrayList<String>)session.getAttribute("previousItems");
			
		if (cartItems==null) {
				cartItems=new ArrayList<String>();
		}
		
		System.out.println(rq.getParameter("check"));
		
		//send to foodorder.html if 'Back' button from FoodDrinkServlet is clicked...
		if(rq.getParameter("check").equals("Back")){
			rp.sendRedirect("./foodorder.html");
		}
		
		else{
			//get parameters from checkboxes of FoodDrinkServlet...
			if (rq.getParameter("checkfood")!=null){
				
				String[] checks=rq.getParameterValues("checkfood");
				for(String s: checks){
					
					//get attributes from session into arrayList that was set for each checkbox in FoodDrinkServlet...
					cartItems.add((String)session.getAttribute(s));
					System.out.println(s+" "+(String)session.getAttribute(s));
				}
			}
			
			//set the arrayList as a "previousItems" session attribute...
			session.setAttribute("previousItems", cartItems);
			
			//setting the content type as HTML...
			rp.setContentType("text/html");
			PrintWriter out=rp.getWriter();
			
			//writing output for html...
			out.println("<html>");
			
			out.println("<head>");
			out.println("<title>Cart Information</title>");
			out.println("</head>");
			
			out.println("<body>");
			
			out.println("<h2>All Orders In Your Cart Are</h2>");
			int i=0;
			out.println("<form action='order' method='get'><center>");
			
			//show "No Item!!!" if there was no checkout...
			if (cartItems.size() == 0) 
				out.println("<h4>No item!!!</h4>");
			else {
				//show checkout items into table...
				out.println("<table border='1'><tr><td>");
				out.println("<table>");
				
				for(String s: cartItems){
					out.println("<tr><td>"+s+"</td>");
					i++;
				}
				out.println("</table>");
				out.println("</td></tr></table>");
				
			}
			out.println("</center>");
			out.println("<br>There are "+i+(i<2?" order":" order(s)")+" in your Cart!<br>");
			out.println("<input type='submit' name='BackOrder' value='Back'>");
			out.println("</form>");
			
			out.println("</body>");
			
			out.println("</html>");
			//end of writing output for HTML...
		}
		

	}
	
	//doPost method...
	public void doPost(HttpServletRequest rq, HttpServletResponse rp) throws IOException, ServletException {
		doGet(rq, rp);
	}

}
