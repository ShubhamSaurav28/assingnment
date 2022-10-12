package assingment1;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int i=1;
		int j=1;
		while(row<=2*n-1) {
			int star=n;
			while (i<=star) {
				System.out.print("*");
				i++;
				star--;
			}
			int space=-1;
			while (j<=space) {
				j++;
				space+=2
			}
		}
	}

}
