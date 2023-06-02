package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

	public static void main(String[] args) {
		List<Object> ar = new ArrayList<>();
		ar.add("Raju");
		ar.add("satish");
		ar.add("23");
		ar.add("56");
		ar.add("lokesh");
		
		// indexOf method ....gives -1 if there the element is present
		 int p = ar.indexOf("23");
		 System.out.println(p);

		// size() method
		System.out.println(ar.size());
		// iterate using for each loop
		for (Object o : ar) {
			System.out.println(ar);
			System.out.println(",");

		}

		// converting arraylist to array
		String[] s = new String[ar.size()];
		ar.toArray(s);
		for (String item : s) {
			System.out.println(item);
		}

		// convert array to arraylist

		ArrayList<String> l = new ArrayList<>(Arrays.asList(s));
		System.out.println(l);
		
		// convert arralist to string
		String str = ar.toString();
		
		// clone method

		List<Object> cl =(ArrayList<Object>) ((ArrayList<Object>) ar).clone();
		System.out.println(cl);
		
		// contains method
		System.out.println(ar.contains("Raju"));
		
		// isEmpty method----
		boolean empty = ar.isEmpty();
		System.out.println(empty);
		
       
	}
}
