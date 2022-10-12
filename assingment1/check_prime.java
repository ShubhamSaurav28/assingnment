package assingment1;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2,t=0;
		while(i<n) {
			if(n%i==0) {
				t=1;
			}
			i++;
		}
		if(t==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
