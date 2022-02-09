package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateUsingHashMap {

	static void findDuplicates(int array[]) {
		
		HashMap<Integer, Integer> hh=new HashMap<Integer, Integer>();
		
		for(int s:array) {
			
			if(hh.get(s)==null) { //get(key) this meethod takes key and returns value 
				                   // of that key
				hh.put(s, 1);
			}
			else
				hh.put(s, hh.get(s)+1);
		}
		Set<Entry<Integer,Integer>> entrySet = hh.entrySet();
		
		for(Entry<Integer, Integer> res:entrySet) {
			
			System.out.println("Duplicate number: "+res.getKey()+" repeated times: "+res.getValue());
			
		}
	}
	
	public static void main(String[] args) {
		
		int aa[]=new int [] {14,54,101,14,54,65,14,101,78};

		findDuplicates(aa);
		
	}

}
