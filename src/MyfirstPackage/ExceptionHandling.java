package MyfirstPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =87;
		int b= 0;
		
		try {
			
			
			try{ ///nested try catch
				
				int  c=a/b;
			}
			catch(Exception ex)
			{
			System.out.println("inside nested try");	
			}
			int d =a/b;
		}
				catch(ArithmeticException e)
		{
			System.out.println("inside arithmetic exception "  + e);	
			System.out.println("inside arithmetic exception "  + e.getStackTrace());	//fail safe 
			System.out.println("inside arithmetic exception "  + e.getMessage()); // will show error message
			System.out.println("inside arithmetic exception "  + e.getLocalizedMessage());	
		}
		catch(Exception ex)
		{
			System.out.println("exception caught");
			
		}
		finally {
			System.out.println("code in finally block");// code in finally block will always execute irrespective of what happens
		}
		System.out.println("Next line of code");
	}

}
