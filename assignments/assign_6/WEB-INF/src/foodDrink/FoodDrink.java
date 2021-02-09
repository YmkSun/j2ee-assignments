package foodDrink;

public class FoodDrink {
	
	private String foodType, foodName, orderType;
	private int quantity;
	private double price;

	public FoodDrink(){}

	public FoodDrink(String foodType, String foodName, String orderType, int quantity, double price) {
		this.foodType = foodType;
		this.foodName = foodName;
		this.orderType = orderType;
		this.quantity = quantity;
		this.price = price;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFoodType() {
		return foodType;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getOrderType() {
		return orderType;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "<b>Food:</b>"+foodName+" <b>Order Type:</b>"+orderType+" <b>Quantity:</b>"+quantity+" <b>Price:</b>"+price;
	}
	
	
	

}
