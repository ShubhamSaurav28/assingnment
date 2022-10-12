package assingment1;

import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=0;
		int f=1;
		int s=0;
		if(n==0) {
			System.out.println("0");
		}
		else if (n==1) {
			System.out.println("1");
		}
		else {
		while(i<n-1) {
			s=j+f;
			j=f;
			f=s;
			i++;
			}
		System.out.println(s);
		}
		
	}

}
