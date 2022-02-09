package logical;

import java.util.Scanner;

public class DigitAddition {
	
	int digitsum(int n) {
		int sum;
		for(sum=0;n>0; sum+=n%10,n/=10);
		return sum;
	}

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
	DigitAddition digit=new DigitAddition();
		System.out.println("Addition of digits is: "+digit.digitsum(n));
		sc.close();
	}
	

}
