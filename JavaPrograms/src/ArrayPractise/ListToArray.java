package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList< String > list = new ArrayList<String>();

		  list.add("1");
		 
		  list.add("2");
		 
		  list.add("3");
		  
		  list.add("4");
		 
		  list.add("5");
		  
		  list.add("6");
		 
		   String []  my_array = new String[list.size()];
		  
		  list.toArray(my_array);
		  
		  for (  String array : my_array)
		  {
		  System.out.println(array);
		  }
	}
}