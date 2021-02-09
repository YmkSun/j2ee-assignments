package foodDrink;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FoodDrinkServlet extends HttpServlet {
	
	//member data arrayList to keep foodDirnk database...
	private ArrayList<FoodDrink> alist;
	
	//doGet method...
	public void doGet(HttpServletRequest rq, HttpServletResponse rp) throws IOException, ServletException {
		
		//creating a httpSession...
		HttpSession session=rq.getSession();
		
		//get an attribute from session...
		String fotype=(String)session.getAttribute("fotype");
		
		//get the parameter form fdorder radio button of foodorder.html...
		String type=rq.getParameter("fdorder");
		System.out.println(type);
		
		//if the input from radio button is null and not from the OrderCartServlet.java...
		if(type==null && rq.getParameter("BackOrder")==null){
			rp.sendRedirect("./foodorder.html");
		}
		
		else{
			if(type!=null){
				//setting the attribute by the radio button of foodorder.html...
				session.setAttribute("fotype", type);
				fotype=type;
			}
			//getting the data from foodDrink database into arrayList...
			alist=new DBConnect().checkFD(fotype);
			
			//setting the content type as HTML...
			rp.setContentType("text/html");
			PrintWriter out=rp.getWriter();
			
			//writing output for HTML...
			out.println("<html>");
			
			out.println("<head>");
			out.println("<title>Order Information</title>");
			out.println("</head>");
			
			out.println("<body>");
			
			out.println("<center><h2>"+fotype+" Order</center>");
			
			out.println("<form action='cart' method='get'>");
			
			int i=0;
			//showing the data from database into table by for loop...
			for(FoodDrink fd: alist){
				out.println("<table>");
				out.println("<tr><td><input type='checkbox' name='checkfood' value="+fotype+i+"></td>");
				out.println("<td>Food Name: '"+fd.getFoodName()+"'</td></tr>");
				out.println("<tr><td></td><td>Order Type: '"+fd.getOrderType()+"'</td></tr>");
				out.println("<tr><td></td><td>Quantity: '"+fd.getQuantity()+"'</td></tr>");
				out.println("<tr><td></td><td>Price: '"+fd.getPrice()+"'</td></tr>");
				out.println("</table>");
				out.println("<br>");
				
				String name=type+i;
				String vaule=fd.toString();
				session.setAttribute(name, vaule);
				i++;
			}
			
			out.println("<input type='submit' name='check' value='Check Out'>&emsp;<input type='submit' name='check' value='Back'>");
			
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
