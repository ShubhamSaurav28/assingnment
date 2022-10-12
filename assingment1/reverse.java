package assingment1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int rev=0;
		if(n>=0 && n<=1000000000) {
		while(n>0) {
			i=n%10;
			n=n/10;
			rev=rev*10+i;
		}
		System.out.println(rev);
	}
	}

}
