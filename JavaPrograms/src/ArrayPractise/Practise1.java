package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class Practise1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 4 };
		ArrayList<Integer> arrnew = new ArrayList();
		int j = 5;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != j) {
				arrnew.add(arr[i]);
			}
		}
System.out.println(arrnew);
	

	// second method
	
	int array1 [] = new int [] {10,20,30,04,0,50};
	ArrayList  array2 = new ArrayList();
	
	for(int i : array1) {
		array2.add(i);
	}
	array2.remove(3);
	System.out.println("Before deleting:"+Arrays.toString(array1));
	System.out.println("After deletion:"+ array2);
	
	
	// third method
	
	
	String array3 []=  new String[] {"raju", "sai","shiva","raghu"};
	String array4 [] = new String [array3.length-1];
	
	// get the specific index to remove
	int index =3;
	
	//(array3 == null || index<0 || index>=array3.length) {
		
		
		for(int i = 0, k=0; i<array3.length; i++) {
			//if the index is the removal element index
			
			if(i == index) {
				continue;
			}
	
		// if the index is not the removal element index
			
			array4 [k++] = array3[i];
		}
			System.out.println(Arrays.toString(array4));
	
		
			
			//
	
	
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
}
