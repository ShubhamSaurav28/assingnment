package assingment1;

import java.util.Scanner;

public class number_inverting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long i=0;
		long t=0
		long rev=0;
			while(n>0) {
				i=n%10;
				t=i;
				if (9-t<=i) {
					i=9-t;
				}
				n=n/10;
				rev=rev*10+i;
			}
			t=0;
			if(rev%10==0) {
				rev=rev+9;
			}
			while(rev>0) {
				i=rev%10;
				rev=rev/10;
				t=t*10+i;
			}
			System.out.println(t);
		}
}
	// wrong


