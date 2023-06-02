package ArrayPractise;

import java.util.HashSet;

public class Intersection {
	public static void main(String[] args) {
		int []  array1 = {10,20,30,40,50};
		int [] array2 = {60,70,80,90,30};
		HashSet <Integer> set = new HashSet <Integer>();
	
	for(int i = 0; i<array1.length;i++) {
		for(int j=0; j<array2.length;j++) {
			if(array1[i] ==(array2[j])) {
				set.add(array1[i]);
				
			}
		}
	}
	System.out.println("common element:"+set);
	}

}
