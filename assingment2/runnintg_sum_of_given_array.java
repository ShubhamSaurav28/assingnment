package assingment2;

import java.util.Scanner;

public class runnintg_sum_of_given_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int []sum=new int [n];
		sum[0]=arr[0];
		System.out.print(sum[0]+" ");
		for(int i=1;i<n;i++) {
			sum[i]=sum[i-1]+arr[i];
			System.out.print(sum[i]+" ");
		}
	}

}
