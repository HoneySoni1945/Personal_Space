package OPPsConcept;

public class testBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBCbank acc =new HSBCbank();
		acc.credit();
		acc.debit();
		acc.transfer();
		acc.mutualfunds();
		acc.loan();
		
		System.out.println(UsBank.min_balc);
		
	}

}
