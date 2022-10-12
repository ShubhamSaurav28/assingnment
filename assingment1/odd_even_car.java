package assingment1;

import java.util.Scanner;

public class odd_even_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int t=n;
		int j=0;
		while(i<=t) {
			int c=sc.nextInt();
			int s=0;
			int sum=0;
			while(c>0) {
				j=c%10;
				if(j%2==0) {
					s=s+j;
				}
				else if(j%2!=0) {
					sum=sum+j;
				}
				c=c/10;
			}
			if(s%4==0) {
				System.out.println("Yes");
			}
			else if(sum%3==0){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			i++;
		}
	}

}
