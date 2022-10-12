package assingment1;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int i=1;
		int b=0;
		while(i<=n) {
			b=3*i+2;
			if(b%a!=0) {
				System.out.println(b);
				}
			else {
				n++;
			}
			i++;
		}
	}

}
