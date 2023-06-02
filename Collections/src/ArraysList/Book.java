package ArraysList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Change {

	static void change() {
		List<Object> arr1 = new ArrayList<>();
		List<Object> arr4 = new ArrayList<>();


		arr1.add(25);
		arr1.add(65);
		arr1.add(96);
		arr1.add(25);
		arr1.add(75);
		arr1.add(53);
		
		  
	
		arr4.add(75);
		arr1.removeAll(arr4);
		System.out.println(arr1);
		// change the element of the array list

		arr1.set(4, 12);
		System.out.println(arr1);
		
		// Remove method
		arr1.remove(3);
		System.out.println(arr1);
		
		boolean remove = arr1.remove(Integer.valueOf(25));
System.out.println(arr1);

        arr1.removeAll(arr1);
        System.out.println(arr1);
        
	}

}

public class Book {

	public static void main(String[] args) {

		Change ch = new Change();
		ch.change();
		List<String> book = new ArrayList<>();

		// add() method without index parameter elements
		book.add("java");
		book.add("python");
		book.add("html");
		book.add("spring boot");
		// add element at specific index ...add index method()
		book.add(2, "css");
		// print elements
		System.out.println(book);

		// access elements
		String str1 = book.get(2);
		System.out.println(str1);

		// Using iterator we can access all elements in the arraylist

		Iterator<String> iterator = book.iterator();
		// hasNext: returns true if there is a next element in the arraylist
		// while(iterator.hasNext()) {
		// next(): returns the next element in the arraylist
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(",");
		}

		// index of each element
		/*
		 * while(iterator.hasNext()) { // access element String element =
		 * iterator.next(); System.out.print(element+":"); // access index of each
		 * element System.out.println(book.indexOf(element));
		 * 
		 * 
		 * }
		 */
		while (iterator.hasNext()) {

			// access element
			String element = iterator.next();
			System.out.print(element + ": ");

			// access index of each element
			System.out.println(book.indexOf(element));
		}

		// ListIterator

		ListIterator<String> lt = book.listIterator();
		lt.add("method");
		lt.add("class");
		lt.add("interface");
		lt.add("python");
		lt.add("overriding");
		// lt.add("encapsulation");

		String s1 = lt.next();
		System.out.println(s1 + ",");

		int index = lt.nextIndex();
		System.out.println(index);

		String previous = lt.previous();
		System.out.println(previous);

		int index2 = lt.previousIndex();
		System.out.println(index2);

	}
}
