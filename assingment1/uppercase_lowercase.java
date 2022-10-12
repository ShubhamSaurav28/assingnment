package assingment1;

import java.util.Scanner;

public class uppercase_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.next().charAt(0);
		if(i>=97 && i<=122) {
			System.out.println("lowercase");
		}
		else if(i>=65 && i<=90) {
			System.out.println("UPPERCASE");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
