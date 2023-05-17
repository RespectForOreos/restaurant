package resturant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
	String s = "";
	int securityCode = 0;
	EmployeeList employeeList = new EmployeeList();
	OrderList orderList = new OrderList();
	Scanner console = new Scanner(System.in);
	int orderNum = 0;
		 
		 
	do {
	orderNum++;
	Order.newOrder();
	System.out.println("Your order number is: "+ orderNum);
	System.out.println("\n\nWould you like to start a new order? (yes or no)");
	s = console.nextLine();
	
	} while (s.equals("yes"));

	

	System.out.println("What is your employee ID?");
	securityCode = console.nextInt();
	String a;
	
	for( Employee e : employeeList.getList()) {
		
		if (securityCode == e.getSecurityCode()) {
			
			System.out.println("Hello " + e.getName());
			System.out.println();
			System.out.println(orderList);
			
			
			System.out.println("Would you like to remove an order?");
			a = console.next();
			
			if(a.equals("yes")) {
				
				//2134156
				System.out.println("The order numbers currently in the system are: ");
				for (int x = 1; x <= orderList.totalOrders(); x++) {
					System.out.print(x + " ");
				}
				
				System.out.println("\nWhich item would you like to remove?");
				orderList.removeOrder(console.nextInt());
				System.out.println("Item removed!\nNew order data is: ");
				System.out.println(orderList);
				
			}
			
			
			} 
			
			}
		
	}
	
	
}
	

