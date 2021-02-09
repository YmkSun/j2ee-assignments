package action;

import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport{
	
	private String orderCrust;
	private String orderAppetizer;
	private String orderCard;
	
	private String name;
	private List<String> crust;
	private String peas;
	private String paneer;
	private String peppers;
	private String pineapple;
	private String onion;
	private String tomato;
	private List<String> appetizer;
	private String address;
	private List<String> creditCard;
	private String creditNo;
	private String confirmNo;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCrust() {
		return crust;
	}
	public void setCrust(List<String> crust) {
		this.crust = crust;
	}
	
	public String getPeas() {
		return peas;
	}
	
	public void setPeas(String peas) {
		this.peas = peas;
	}
	
	public String getPaneer() {
		return paneer;
	}
	
	public void setPaneer(String paneer) {
		this.paneer = paneer;
	}
	
	public String getPeppers() {
		return peppers;
	}
	
	public void setPeppers(String peppers) {
		this.peppers = peppers;
	}
	
	public String getPineapple() {
		return pineapple;
	}
	
	public void setPineapple(String pineapple) {
		this.pineapple = pineapple;
	}
	
	public String getOnion() {
		return onion;
	}
	
	public void setOnion(String onion) {
		this.onion = onion;
	}
	public String getTomato() {
		return tomato;
	}
	public void setTomato(String tomato) {
		this.tomato = tomato;
	}
	
	public List<String> getAppetizer() {
		return appetizer;
	}
	public void setAppetizer(List<String> appetizer) {
		this.appetizer = appetizer;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(List<String> creditCard) {
		this.creditCard = creditCard;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getConfirmNo() {
		return confirmNo;
	}
	public void setConfirmNo(String confirmNo) {
		this.confirmNo = confirmNo;
	}
	
	public String getOrderCrust() {
		return orderCrust;
	}

	public void setOrderCrust(String orderCrust) {
		this.orderCrust = orderCrust;
	}
	
	public String getOrderAppetizer() {
		return orderAppetizer;
	}
	public void setOrderAppetizer(String orderAppetizer) {
		this.orderAppetizer = orderAppetizer;
	}
	
	public String getOrderCard() {
		return orderCard;
	}
	public void setOrderCard(String orderCard) {
		this.orderCard = orderCard;
	}
	public String display(){
		
		crust=new ArrayList<String>();
		appetizer=new ArrayList<String>();
		creditCard=new ArrayList<String>();	
				
		crust.add("Pan");
		crust.add("Thin Crust");
		crust.add("Deep Crust");
		crust.add("Cheese Burst");
		
		appetizer.add("Garlic Bread");
		appetizer.add("Cheese Garlic Bread");
		appetizer.add("Veg Soup");
		appetizer.add("Veg Sandwich");
		
		creditCard.add("Visa");
		creditCard.add("MasterCard");
		creditCard.add("American Express");
				
		return SUCCESS;
	}

}
