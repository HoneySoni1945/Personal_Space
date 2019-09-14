package OPPsConcept;

public class testoppconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//static polymorphsim or run time polymorphism
		BMW b=new BMW();
		b.start();
		b.theftSafty();
        b.stop();
        b.refill();
        b.VechEng();
	
        System.out.println("*******************");
        
        Cars c=new Cars();
         c.start();
         c.stop();
         c.refill();
         c.VechEng();
         
         System.out.println("*********************");
         
         //Top casting
         Cars d = new BMW();//child class object can be refrenced by parent class refrence variable ---dynamic polymorphsim---run time polymorphsim
         d.start();
         d.stop();
         d.refill();
         d.VechEng();
         
         //down casting
         //BMW bw= (BMW)new Cars();//Class cast exception ... at run time no compile time error
	}

}
