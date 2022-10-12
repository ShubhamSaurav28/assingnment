package assingment1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int i=2;
		while(n>0 && d>0) {
			if(i%n==0 && i%d==0)
				break;
			i++;
		}
		System.out.println(i);
	}

}
