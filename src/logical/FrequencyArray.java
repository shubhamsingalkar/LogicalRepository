package logical;

import java.util.Arrays;

public class FrequencyArray {

	static int index=0;
	static int [] counted ;

	public static void main(String[] args) {

		int a[]= {12,50,12,98,50,13,56,89,13,50,56};

		counted= new int [a.length];


		for(index=0;index<a.length;index++) {
			Arrays.sort(counted);
			if(Arrays.binarySearch(counted, a[index])<0) {
				
				System.out.println(a[index]+" has appeared "+count(a,a[index])+" times");
			}
		}

	}
	static int count(int[] b, int element) {

		int count=0;
		counted[index=0]=element;

		for(int index=0;index<b.length;index++) {

			if(b[index]==element) {

				count++;
			}
		}
		return count;


	}

}
