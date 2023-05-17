package resturant;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	
public Order () {
	
		
	}

public static void newOrder() {
	
	
	 //creates menu object
		Menu menu = new Menu();
			//each order is represented by an arraylist of foods
			ArrayList<Food> order = new ArrayList<>();
			
		    Scanner console = new Scanner(System.in);
		      
		//this is to place orders, this corresponds to the items on the menu
		    int number = 0;
		//calls printMenu, prints all food items with prices
		    menu.printMenu();
		      
		    do {
		    	//prompts user which item they would want
		    		System.out.println("What number would you like to order? (Input \"0\" to complete your order)");
		    		number =  console.nextInt();
		    	   
		    	 //Checks if item is on menu
		    	 
		    	  if (number<1 || number > 5) {
		    		 //checks if the stop order number, 0, was entered
		    		  if (number == 0) {
		    			  //after 0 is inputted, it stops the order and calculates the total
		    			  System.out.println("Your total will be: $"+ Math.round((Menu.calculateTotal(order) * 1.08)*100)/100.0);
		    			  System.out.println("Thanks for ordering!");
		    		  			}
		    		  
		    		  		else {
							//if the number doesn't fall on the menu (1-5), it prints the message
		    		  			System.out.println("Sorry, we don't have that"); 
		    		}	
		    		
		 }
		    	  
		    	  else {
		    		  //After each number input, it adds the food to the arrayList of foods
		    		  order.add(menu.getFood(number));
		    		  System.out.println("Order Recieved!");
		    		 
		    	  			}
		    	  
		    	  
		     } while (number != 0); 
		     
		   //after everything is done, it adds the arrayList of foods (the order) to an arrayList of orders 
		    OrderList.AddCompletedOrder(order);

		


		

	
}

}
