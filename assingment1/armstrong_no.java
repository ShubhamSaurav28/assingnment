package assingment1;

import java.util.Scanner;

public class armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int i=(int)Math.log10(n)+1;
		int j=0;
		int s=0;
		while(n>0) {
			j=n%10;
			s=s+ (int)(Math.pow(j, i));
			n=n/10;
		}
		if(s==t) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
