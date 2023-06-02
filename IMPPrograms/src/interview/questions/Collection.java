package interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map =  new HashMap<Integer,String >();
	
		map.put(101, "raju");
		map.put(102,"sai");
		map.put(103,"venkat");

		
		for(Map.Entry m : map.entrySet()) {
			
		
		System.out.println(m.getKey()+""+ m.getValue());
		}
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Collection [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	} 
	

}
