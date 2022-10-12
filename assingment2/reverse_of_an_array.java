package assingment2;

import java.util.Scanner;

public class reverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-i;i++) {
			int t=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=t;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
