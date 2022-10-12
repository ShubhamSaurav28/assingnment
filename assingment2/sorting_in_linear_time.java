package assingment2;

import java.util.*;

public class sorting_in_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		int x=0,y=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0)
				x++;
			else if(arr[i]==1)
				y++;
		}
		for(int i=0;i<n;i++) {
			if(i<x)
				arr[i]=0;
			else if(i>=x && i<x+y)
				arr[i]=1;
			else
				arr[i]=2;
			System.out.println(arr[i]);
		}
	}

}
