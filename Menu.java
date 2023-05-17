package resturant;
import java.util.*;

public class Menu {

	
    static ArrayList<Food> menu;
  

    public Menu() {
        menu = new ArrayList<Food>();
        menu.add(new Food ("Hamburger", 10.5));
        menu.add(new Food ("French Fries", 5.25));
        menu.add(new Food ("Hot dog", 7.25));
        menu.add(new Food ("Soda", 2.5));
        menu.add(new Food ("Ice Cream", 3.25));
      
        
    }
    
    public Food getFood(int x) {
    	
    	return menu.get(x-1);
    }

    
 
    
    public static double calculateTotal (ArrayList<Food> order) {
    	
    	double total = 0;
    
    		for (Food f : order) {
    	
    			total += f.getPrice();
    		}
    		
    	
    	return total;
    }
    
  
    
    public void printMenu() {
    	
    	int x = 1;
    	
    	for (Food f : menu) {
    		
    		System.out.print(x + ". ");
    		System.out.println(f);
    		System.out.println();
    		x++;
    	}
    
    	
    }
    
    
}
