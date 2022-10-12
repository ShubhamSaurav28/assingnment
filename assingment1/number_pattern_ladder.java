package assingment1;

import java.util.Scanner;

public class number_pattern_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int k=1;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print(k+"	");
				i++;
				k++;
			}
			System.out.println();
			row++;
		}
	}

}
