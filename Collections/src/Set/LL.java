package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LL {
	public static void main(String[] args) {
		// creating ll from other collections
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);

		LinkedHashSet<Integer> ll = new LinkedHashSet<>(ar);
		System.out.println(ll);
		
		//list of elements in reverse order
		
		 LinkedList<String> oo=new LinkedList<String>();  
         oo.add("Ravi");  
         oo.add("Vijay");  
         oo.add("Ajay");  
         //Traversing the list of elements in reverse order  
         Iterator i=oo.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
           
			
	
	
	
	}

}
