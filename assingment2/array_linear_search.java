package assingment2;

import java.util.Scanner;

public class array_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int t=0;
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==m) {
				System.out.println(i);
				t=1;
				break;
			}
		}
		if(t==0)
			System.out.println(-1);
	}

}
