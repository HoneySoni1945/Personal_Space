package JavaBasics;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x[][]= new String[2][3];
System.out.println(x.length);
System.out.println(x[0].length);

x[0][0]="honey";
x[0][1]="tarun";
x[0][2]="rahul";
x[1][0]="soni";
x[1][1]="jain";
x[1][2]="rai";

//System.out.println(x[0][0]);

for(int i=0;i<x.length;i++) {
	for(int j=0;j<x[0].length;j++) {
		System.out.println(x[i][j]);
	}
}
	}	

}
