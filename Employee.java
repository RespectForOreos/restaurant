package resturant;

public class Employee {
	
	String name;
	int securityCode;
	
public Employee (String name, int code) {
	
	this.name = name;
	//the security code is used to identify each employee
	securityCode = code;
}

public String getName() {
	
	return name;
	
}

public int getSecurityCode() {
	
	return securityCode;
}

}
