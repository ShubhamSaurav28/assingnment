package assingment1;

import java.util.Scanner;

public class fibonacci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int s=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			s=a+b;
			System.out.print(a+" ");
			a=b;
			b=s;
			}
		System.out.println();
		}
		
	}

}
