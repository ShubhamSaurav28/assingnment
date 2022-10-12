package assingment1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a=sc.nextInt();
	        int r=0;
	        while (n%a!=0){
	            r=n%a;
	            n=a;
	            a=r;
	        }
	        System.out.println(a);
	}

}
