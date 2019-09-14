package OPPsConcept;

public interface UsBank {

	int min_balc =100;
	
	public void credit();
	public void debit();
	public void transfer();
	
	//Interface can have only method declaration
	//no method body only methd prototype
	//in interface we are allowed to declare variables but variables are static and final in nature
	//i.e value of variables can not be changed
	//no static method in interface
	//we can not create object of an interface
	//interface is abstract in nature
	
	
}
