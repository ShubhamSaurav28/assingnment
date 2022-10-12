package assingment1;

import java.util.Scanner;

public class inverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long s=n;
		long i=0;
		long t=0;
		long r=0;
		long j=0;
		long p=(long)Math.log10(s);
		long c=(s-s%((long)Math.pow(10, p)))/(long)Math.pow(10, p);
			while(n>0) {
				
				i=n%10;
				t=i;
				if(c==9 && j==p) {
					i=9;
				}
				else if (9-t<i) {
					i=9-t;	
				}
				n=n/10;
				r=r+i*((long)Math.pow(10, j));
				j++;
			}
			System.out.println(r);
	}

}/// chebcawa no. not total inverse
