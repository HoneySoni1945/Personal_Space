package MyfirstPackage;

import java.util.ArrayList;

public class testCall{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicMathOp obj=new basicMathOp();
 /*int m=obj.add(2, 5);
 System.out.println("sum is "+ m);
 System.out.println();
 //calling static method
 basicMathOp.multi(3,4);*/
 
 int [] arr=new int[10];
 arr[0]=12;
 arr[1]=13;
 arr[2]=14;
 arr[3]=13;
 arr[5]=14;
 
 for (int i=0 ; i<arr.length;i++)
	 {
	 for(int j=i+1;j<arr.length;j++)
	 {
		 if(arr[i]==arr[j])
			 System.out.println("duplicate found at index "+ i + " its value is " + arr[j]);		 
	 }
 }
 
 ///Array list 
 
 /*ArrayList arrlst = new ArrayList();
 
 arrlst.add("et");
 		arrlst.add(23);*/
 
/* for(Object value:arrlst){
	 System.out.println(value);
 }
 ArrayList<Integer> lst=new ArrayList<Integer>();
 lst.add(12);
 lst.add(10);*/
 
// boxing andunboxing
 }
	}
