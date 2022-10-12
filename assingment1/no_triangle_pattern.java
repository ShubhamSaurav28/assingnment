package assingment1;

import java.util.Scanner;

public class no_triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int f=0;
		int v=1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				f++;
				System.out.print(f+" ");
			}
			for(int m=1;m<i;m++) {
				--f;
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
