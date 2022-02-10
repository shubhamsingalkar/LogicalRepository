package logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//while(true) {   //for continuation
			
		Scanner sc =new Scanner (System.in);
		System.out.println("Please enter number");
            
		int n=sc.nextInt();
		int count=0;
		
		for (int i=1;i<=n;i++) {
			
			if(n==0 || n==1) {
				System.out.println("Number is not prime");
				}
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is Prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
			System.out.println("=============================");
		//}
	}

}
