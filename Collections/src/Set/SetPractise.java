package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractise {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(23);
		set1.add(91);
		set1.add(45);
		set1.add(12);
		set1.add(10);
		set1.add(200);
		

		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(200);
		// union
		set2.addAll(set1);
		System.out.println(set2);
		//
		boolean b = set1.retainAll(set2);
		System.out.println(set1);
		
		//difference
		set1.removeAll(set2);
		System.out.println(set1);
		
		//substring
		boolean j = set1.containsAll(set2);
		System.out.println(j);
		

		boolean all = set1.removeAll(set1);
		System.out.println(all);

	// Ignoring duplicates elements
	HashSet<String> hs = new HashSet<String>();
	hs.add("abstract");
	hs.add("overloading");
	hs.add("polymorphism");
	hs.add("abstract");
	
	Iterator<String> it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	
	
	
	
	
	
	
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
