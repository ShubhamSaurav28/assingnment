package assingment1;

import java.util.Scanner;

public class pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			System.out.print(row);
			int i=1;
			while(i<=row-2) {
				System.out.print("	0");
				i++;
			}
			System.out.print("	");
			if(row>=2)
			System.out.print(row);
			System.out.println();
			row++;
		}
	}

}
