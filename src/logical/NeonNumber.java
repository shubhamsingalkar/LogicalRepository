package logical;

import java.util.Scanner;

public class NeonNumber {
//9^2=81 ==>8+1=9 (NEON NUMBER)
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int m=n*n; int digit=0;

		while(m>0) {
			int temp=m%10;
			 digit = digit+temp;
			m=m/10;
		}
		if(n==digit) {
			System.out.println(n+" is Neon number");
		}
		else
			System.out.println(n+" not Neon number");
	}

}
