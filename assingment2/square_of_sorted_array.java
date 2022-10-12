package assingment2;

import java.util.Scanner;

public class square_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			arr[i]=s*s;
		}

		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
	}

	}
	}
