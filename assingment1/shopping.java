package assingment1;

import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=sc.nextInt();
			int h=sc.nextInt();
			int s1=0;
			int s2=0;
			int p=0;
			int l=0;
			for(s1=1;p<=a;s1+=2) {
				p+=s1;
			}
			for(s2=2;l<=h;s2+=2) {
				l+=s2;
			}
			if(p>l)
			System.out.println("Aayush");
			if(l>p)
			System.out.println("Harshit");
			
		}
	}

}
