package assingment1;

import java.util.Scanner;

public class mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int c=(n-1)/2;
		int t=c;
		if(n%2!=0) {
			for( int k=1;k<=c;k++) {
				for(i=1;i<t;i++,t--) {
					System.out.print(" ");
				}
				for(int j=2*(i-1)+1;j<=;j--,i++) {
					System.out.print("* ");
				}
				System.out.println()
		}}
	}

}
