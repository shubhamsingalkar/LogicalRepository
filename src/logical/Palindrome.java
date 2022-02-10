package logical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		int n1=n;
		int nrev=0;
		
		while(n>0) {
			
			nrev=nrev*10+(n%10);
			n=n/10;
		}
		if(nrev==n1) {
			System.out.println(n1+" is Palindrome");
		}
		else System.out.println(n1+" is not palindrome");
		}
}
