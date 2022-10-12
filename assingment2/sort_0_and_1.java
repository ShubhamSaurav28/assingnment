package assingment2;

import java.util.Scanner;

public class sort_0_and_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a==0)
				b++;
		}
		for(int i=0;i<n;i++) {
			if(b>0)
				arr[i]=0;
			else
				arr[i]=1;
			System.out.print(arr[i]+" ");
			b--;
		}
	}

}
