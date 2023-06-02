package Arrays;

import java.util.Arrays;

public class Inserting_Values {

	public static void main(String[] args) {  
		Integer arr[] = {1,2,3,4,5,6};  
		int n = arr.length;  
		int index = 3; 
		int index2 = 369;
		System.out.println("Original Array: "+Arrays.toString(arr));  
		Integer newArr[] = new Integer[n+2];  
		int j = 0;  
		  
		for(int i = 0; i<newArr.length; i++) {  
		if(i==index ) {  
		newArr[i] = 7;  
		}else {  
		newArr[i] = arr[j];  
		j++;  
		}  
		}  
		newArr[index] = 7;  
		System.out.println("Array after adding value: "+Arrays.toString(newArr));  

	
	}
}










