package logical;

import java.util.Scanner;

//Armstrong number means if the total number of digits in given number is powered with each digit then 
  // the addition of that digits is equals to given number
    //eg. 153==> 1^3+5^3+3^3=153,,, 1634==>1^4+6^4+3^4+4^4=1634
      
//note: all numbers from 1 to 9 are Amrstrong numbers
public class ArmstrongNumber {
	
	
	static boolean isArmstrong(int n) {
		
		int temp=n; int count=0; int sum=0;
		
		while(temp>0) {
			
			count++;
			temp=temp/10;
		}
		int temp2=n;
		while(temp2>0) {
			int digit=temp2%10;
		 int pow = (int) Math.pow(digit, count);
		 sum=sum+pow;
			temp2=temp2/10;
		}
		if(sum==n) {
		return true;
		}
		else
			return false;
	}
	
public static void main(String[] args) {
		// while(true) {  for continuation
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number:");
	int n=sc.nextInt();

	if(isArmstrong(n)){
		
		System.out.println(n+" is Armstrong number");
	}
	else
		System.out.println(n+" is not Armstrong number");
	//}
}

}
