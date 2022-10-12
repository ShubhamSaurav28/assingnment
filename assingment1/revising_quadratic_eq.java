package assingment1;

import java.util.Scanner;

public class revising_quadratic_eq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double d=b*b-(4*a*c);
		int n=0;
		double x1=0;
		double x2=0;
		if(d==0) {
			System.out.println("Real and Equal");
			n=1;
		}
		else if(d>0) {
			System.out.println("Real and Distinct");
			n=2;
		}
		else if(d<0) {
			System.out.println("Imaginary");	
			
		}
		if(n==1 || n==2) {
			x1=((double)(-b)+(double)Math.sqrt(d))/(double)(2*a);
			x2=((double)(-b)-(double)Math.sqrt(d))/(double)(2*a);	
		
		if(x1>=x2) {
			System.out.print((int)x2+" "+(int)x1);
			}
		else if(x2>x1) {
			System.out.print((int)x1+" "+(int)x2);
		}
	}
	}
}
