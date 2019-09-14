package TrainingAssigmentW1;

public class BasicProgramUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicProgramUsingLoops obj=new BasicProgramUsingLoops();
//obj.SumAndAverage(10, 20);
//obj.SquareBoard(2);
//obj.SumOfDigits(4444);
//obj.factorial(0);
//obj.NumberReversal(12345);
//obj.CheckNumberPladinrome(1221);
//obj.CheckArmstrog(371);
//obj.FibonacciUpTillN(8);

obj.findDuplicate();
	}
void SumAndAverage(int lower ,int upper)
{
int count=0;
int sum=0;
for(sum=0;lower<=upper;lower++)
{
	count = count+1;
	sum =lower+sum;
	}
float average = sum/count;
System.out.println("the Sum is "+ sum + "\n The average is" + average);
}
void SquareBoard(int n)
{
	int i,j;
	for (i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		System.out.print(" * ");
				}
		System.out.println("\n");
	}
	}
void SumOfDigits(int n)

{
	int sum =0;
	//sum = sum +(n%10);
	//n=n/10;
	while(n > 0)
	{
		sum = sum + (n % 10);
		n = n/10;
		}
	System.out.println("sum of digits \n"+ sum);
}
void factorial(int n)
{
int fact=1;
if (n==0)
	System.out.println("factorial of given number is\n"+fact);
else{
for(;n>=1;n--)
	fact = fact*n;
	System.out.println("factorial of given number is \n"+fact);
}
}
int NumberReversal(int n)
{
	int rev=0;
	System.out.println("reverseof given number "+ n + " is\n");
for(;n>0;n=n/10)

 rev= (rev*10) + (n%10);
 //n=n/10;

	System.out.println(rev);
	return rev;
}
void CheckNumberPladinrome(int n)
{
int m;
	m=NumberReversal(n);
	if(n==m)
		System.out.println("Hence number is Pladinrome");
				
}
void CheckArmstrog(int n)
{
	int arm=0,input,count;
	input=n;
	for(count=0;n>0;n=n/10)
	{
	count=count + 1;	
	}
	n=input;
	
	for(;n>0;n=n/10)
	{
		arm = arm + Rootn(n%10, count);
	}
	if(arm==input)
		System.out.println("entred number is an Armtrong number"+ arm);
	else
		System.out.println("not armstrong"+arm);
	}
int Rootn(int num,int root)
{int temp=1;
	for(;root>0;root--)
		temp=num * temp;
	return temp;
}
void FibonacciUpTillN(int n)
{
int first=0,second=1,next=0;

System.out.print(" " + first);
System.out.print(" " + second);
for(;next<n;)
{
//System.out.print(" " + temp);
next=first+second;
first=second;
second=next;
System.out.print(" " + next);
}
}
void findDuplicate()
{
int arr[]={12,13,14,14,15,13,16,13,11};
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
	{System.out.println("duplicate elements in arry " + arr[i]);
	arr[j]=0;
	}
}
}
}
}


