package assingment2;

import java.util.Scanner;

public class max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=Integer.MIN_VALUE;
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>t)
				t=arr[i];
		}
		System.out.println(t);
	}

}
