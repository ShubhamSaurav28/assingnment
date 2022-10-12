package assingment1;

import java.util.Scanner;

public class space_no_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=n;
		int t=0;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
				t=k;
			}
			for(int j=1;j<2*f-2;j++) {
				System.out.print("  ");
			}
			for(int m=1;m<=i;m++,t--) {
				if(n==t) {
					continue;
				}
				System.out.print(t+" ");
			}
			f--;
			System.out.println();
		}
	}

}
