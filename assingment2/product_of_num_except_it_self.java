package assingment2;

import java.util.Scanner;

public class product_of_num_except_it_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long [] arr=new long [(int) n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		long [] left=new long [(int) n];
		left[0]=1;
		for(int  i=1;i<n;i++){
			left[i]=left[i-1]*arr[i-1];
		}
		long [] right=new long [(int) n];
		right[(int) (n-1)]=1;
		for(int  i=(int) (n-2);i>=0;i--){
			right[i]=right[i+1]*arr[i+1];
		}
		for(int  i=0;i<n;i++) {
			arr[i]=left[i]*right[i];
			System.out.print(arr[i]+" ");
		}
		
	}

}
