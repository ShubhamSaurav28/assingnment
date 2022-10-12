package assingment1;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int a=0;
		int b=1;
		while(n>0) {
			i=n%10;
			a=a+i*b;
			b=b*2;
			n=n/10;
		}
		System.out.println(a);
	}

}
