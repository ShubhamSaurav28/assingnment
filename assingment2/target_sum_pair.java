package assingment2;

import java.util.Scanner;

public class target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==m)
					System.out.println(Math.min(arr[i],arr[j])+" and "+Math.max(arr[i],arr[j]));
			}
		}
	}

}
