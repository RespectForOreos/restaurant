package resturant;

import java.util.ArrayList;

public class OrderList {
	
	private static ArrayList<ArrayList<Food>> OrderList =new ArrayList<ArrayList<Food>>();



public static void AddCompletedOrder(ArrayList<Food> f) {
	
	OrderList.add(f);
	
}

public double TotalRevenue() {
	
	double total = 0;
	
	for (int x = 0; x <OrderList.size(); x++) {
		
		total += Menu.calculateTotal(OrderList.get(x))*1.08;
		
	
	}
	
	return Math.round(total*100)/100.0;
}

public int totalOrders() {
	
	return OrderList.size();
	
}

public void removeOrder(int orderNum) {
	
	OrderList.remove(orderNum-1);
}

public String toString() {
	
	return "The total amount of completed orders for today is: " + totalOrders() + "\nThe total revenue for today is: $"+ TotalRevenue();
	
}
	
}
