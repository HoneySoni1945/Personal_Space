package OPPsConcept;

public class BMW extends Cars {
	
	//when some method is present in parent class as wellas in child class with same name andsamenumber of parameter then this is call method over riding
	public void start() {
		System.out.println("BMW auto start car....");
	}
	
	public void theftSafty() {
		System.out.println("BMW safty feature");
	}

}
