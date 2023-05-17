package resturant;

import java.util.ArrayList;

public class OrderList {
	//initiatilizes arrayList of arrayLists of foods (arrayList of orders)
	private static ArrayList<ArrayList<Food>> OrderList =new ArrayList<ArrayList<Food>>();



public static void AddCompletedOrder(ArrayList<Food> f) {
	//adds order to arrayList
	OrderList.add(f);
	
}
//calculates the total revenue across all orders
public double TotalRevenue() {
	
	double total = 0;
	
	for (int x = 0; x <OrderList.size(); x++) {
		
		total += Menu.calculateTotal(OrderList.get(x))*1.08;
		
	
	}
	
	return Math.round(total*100)/100.0;
}
//returns the total amount of orders 
public int totalOrders() {
	
	return OrderList.size();
	
}
//removes an order from the list
public void removeOrder(int orderNum) {
	
	OrderList.remove(orderNum-1);
}
//prints the total amount of order and the total revenue
public String toString() {
	
	return "The total amount of completed orders for today is: " + totalOrders() + "\nThe total revenue for today is: $"+ TotalRevenue();
	
}
	
}
