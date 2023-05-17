package resturant;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	
public Order () {
	
		
	}

public static void newOrder() {
	
	
	 
		Menu menu = new Menu();
			
			ArrayList<Food> order = new ArrayList<>();
			
		    Scanner console = new Scanner(System.in);
		      
		
		    int number = 0;
		
		    menu.printMenu();
		      
		    do {
		    	
		    		System.out.println("What number would you like to order? (Input \"0\" to complete your order)");
		    		number =  console.nextInt();
		    	   
		    	 //Checks if item is on menu
		    	 
		    	  if (number<1 || number > 5) {
		    		 //checks if the stop order number, 0, was entered
		    		  if (number == 0) {
		    			  
		    			  System.out.println("Your total will be: $"+ Math.round((Menu.calculateTotal(order) * 1.08)*100)/100.0);
		    			  System.out.println("Thanks for ordering!");
		    		  			}
		    		  
		    		  		else {
		    		  			System.out.println("Sorry, we don't have that"); 
		    		}	
		    		
		 }
		    	  
		    	  else {
		    		  
		    		  order.add(menu.getFood(number));
		    		  System.out.println("Order Recieved!");
		    		 
		    	  			}
		    	  
		    	  
		     } while (number != 0); 
		     
		   
		    OrderList.AddCompletedOrder(order);

		


		

	
}

}
