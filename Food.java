package resturant;

public class Food {


	  private String name;
	  private double price;
	  
	  
	  public Food(String name, double price) //takes in food name and price
	  { 
	    this.name = name;
	    this.price = price;
	   
	  }

	
	  public String getName(){

	    return name;
	    
	  }
	  
	  public double getPrice() {
		  return price;
	  }

	  public String toString (){

	    return name + ", $" + price ;
	    
	  }
	  
	}
