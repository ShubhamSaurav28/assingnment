package assingment1;

import java.util.Scanner;

public class celcius_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		float c=0;
		float b=5/9f;
		for(int i=min;i<=max;i+=step) {
			c=(i-32)*b;
			System.out.print(i);
			System.out.print(" "+(int)c);
			System.out.println();
		}
	}
		

}
