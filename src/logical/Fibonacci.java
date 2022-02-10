package logical;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("1,");

		int j=1,k=0;
		for(int i=0;i<10;i++) {
			int m=j+k;
			System.out.print(m+",");
			k=j;
			j=m;
		}
	}

}
