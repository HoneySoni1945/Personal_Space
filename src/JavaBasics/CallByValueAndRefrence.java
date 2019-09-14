package JavaBasics;

public class CallByValueAndRefrence {

	int p =30;
	int q= 60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndRefrence obj = new CallByValueAndRefrence();
		 int x =10;
		 int y=20;
		 obj.sum(x, y);//call by value
		 
		 /// swap using call by reference 
		
		System.out.println("before swap p="+ obj.p);
		System.out.println("before swap q="+ obj.q);
		
		obj.swap(obj);
	
		System.out.println("after swap p"+ obj.p);
		System.out.println("after swap q"+ obj.q);
	}

	public void swap(CallByValueAndRefrence newobj) {
		newobj.p=newobj.p+newobj.q;
		newobj.q=newobj.p-newobj.q;
		newobj.p=newobj.p-newobj.q;
	}

	public void sum(int i,int j) {
		int sum = i +j;
		System.out.println("sum of given number is " + sum);
		
	}
}
