package assingment2;

import java.util.Scanner;

public class pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		 {
			int n=sc.nextInt();
			int[]rose=new int [n];
			int[]a=new int [n];
			int[]b=new int [n];
			for(int j=0;j<n;j++) {
				rose[j]=sc.nextInt();
			}
			int m=sc.nextInt();
			int k=0;
			for(int i=0;i<n-1;i++) {
				for(int j=1;j<n;j++) {
					if(rose[i]+rose[j]==m) {
						a[k]=rose[i];
						b[k]=rose[j];
						k++;
					}
				}
			}
			int []p=new int [n];
			for(int i=0;i<n;i++) {
				if(a[i]>b[i]) {
					p[i]=a[i]-b[i];
				}
				else {
					p[i]=b[i]-a[i];
				}
			}
			int x=p[0];
			for(int i=0;i<n-1;i++) {
				if(p[i]<p[i+1]) {
					x=i;
				}
			}
			if(a[x]<b[x])
			System.out.println("Deepak should buy roses whose prices are "+a[x]+" and "+b[x]+".");
			System.out.println("Deepak should buy roses whose prices are "+b[x]+" and "+a[x]+".");
			t--;	
		}
	}
}
