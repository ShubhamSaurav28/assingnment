package assingment1;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=n;
		int i=0;
		int j=1;
		while(s>0) {
			s=s/10;
			i++;
		}
		int k=0;
		int [] a=new int [9];
		while(j<=i) {
			k=n%10;
			n=n/10;
			a[j]=k;
			j++;
		}
		j=0;
		while (j<=9) {
			System.out.print(a[j]);
		
	}

}
