package assingment1;

import java.util.Scanner;

public class decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int i=0;
		while(0<n) {
			i=n%8;
			s=s*10+i;
			n=n/8;	
		}
		int a=0;
		int b=0;
		while(s>0) {
			a=s%10;
			b=b*10+a;
			s=s/10;
		}
		System.out.println(b);
	}

}
