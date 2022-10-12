package assingment1;

import java.util.Scanner;

public class sum_of_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        int k=1;
        int e=0;
        int o=0;
        while (n>0){
            r=n%10;
            if(k%2==0){
                e=e+r;
            }
            else{
                o=o+r;
            }
            n=n/10;
            k++;
        }
        System.out.println(o);
        System.out.println(e);
	}

}
