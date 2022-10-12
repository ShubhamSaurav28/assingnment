package assingment1;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int i=0;
		int k=0;
		while(n>0) {
			i=n%10;
			if(i==d) {
				k++;
			}
			n=n/10;
		}
		System.out.println(k);
	}

}
