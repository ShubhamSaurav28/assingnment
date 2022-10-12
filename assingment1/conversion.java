package assingment1;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int sn=sc.nextInt();
		int a=0;
		int i=0;
		int s=0;
		while(sn>0) {
			a=sn%10;
			sn=sn/10;
			s=(int) (s+a*Math.pow(sb,i));
			i++;
		}
		while(s>0) {
			i=s%db;
			System.out.print(i);
			if(s%db==0)
			s=s/db;
			if(s%db!=0)
			s=(s-1)/db
		}
		System.out.println(s);
	}

}
