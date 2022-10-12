package assingment1;

import java.util.Scanner;

public class von_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int k=0;
		int sum=0;
		for(int i=1;i<=n;i++) {
			long j=sc.nextInt();
			while(j>0) {
				k=(int) (j%10);
				sum=sum+ (int) (k*Math.pow(2,s));
				j=j/10;
				s++;
			}
			s=0;
			System.out.println(sum);
			sum=0;
		}
	}

}
