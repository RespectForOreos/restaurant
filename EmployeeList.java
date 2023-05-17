package resturant;

import java.util.ArrayList;

public class EmployeeList {
	
	private ArrayList<Employee> Employees;
	
public EmployeeList() {
	
	Employees = new ArrayList<Employee>();
	
	Employees.add(new Employee("Bob", 2134156));
	Employees.add(new Employee("Carl", 5849302));
	Employees.add(new Employee("Rick", 9437492));
	Employees.add(new Employee("Joe", 3829489));
		
	}



public ArrayList<Employee> getList(){
	
	return Employees;
}

}
