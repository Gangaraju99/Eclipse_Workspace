package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Do {

public static void main(String[] args) {

	ArrayList<Object> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	


/*	for(Object i : list) {
		System.out.println(i);
		
	}
	*/
	
/*	Iterator<Object> iterator = list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
	}
	*/
	
	ListIterator<Object> lt = list.listIterator();
	while(lt.hasNext()) {
		System.out.println(lt.next());
	}
	
	System.out.println("============");
	
	
	while(lt.hasPrevious()) {
		System.out.println(lt.previous());
	}
	
	
	System.out.println("LinkedList");
	
	LinkedList<Object> ll = new LinkedList<>();
	boolean add = ll.add(10);
	System.out.println("add:"+add);
	ll.add(20);
	ll.addFirst(30);
	//boolean offerFirst = ll.offerFirst(40);
	//System.out.println("offer:"+offerFirst);
	
	
	Object first = ll.getFirst();
	System.out.println("get:"+first);
	
	Object first2 = ll.getFirst();
	System.out.println("get2:"+first2);
	
	 Object peek = ll.pollFirst();
	 System.out.println("poll:"+peek);
	 
	 Object pf = ll.peekFirst();
	 System.out.println("peek First:"+pf);
	
	for(Object link :ll) {
		System.out.println(link);
	}
		
	
	
	
	
	
	
	
}
}
