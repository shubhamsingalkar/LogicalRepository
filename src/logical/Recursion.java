package logical;

public class Recursion {
	public static void main(String[] args) {
	
		  String str="Shubham";
		
		
		  System.out.println(recursiveMethod(str));

	}
	
	static String recursiveMethod(String str) {
		
		if(null==str || str.length()<=1) {
			return str;
		}
		
		return recursiveMethod(str.substring(1))+str.charAt(0);
		
	}
}
