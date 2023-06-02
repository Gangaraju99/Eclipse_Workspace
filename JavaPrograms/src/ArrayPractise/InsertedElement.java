package ArrayPractise;

import java.util.Arrays;

public class InsertedElement {

	private static int [] insertX(int n, int x,int[] y, int position) {
	int newarray [] = new int [n+1];
	// insert the elements from the old array into the new array
	for(int i =0; i<n+1;i++) {
		if(i<position -1) {
			newarray [i] = y[i];
		}
		else if( i == position-1) {
			newarray[i] = x;
		}// index positon is 5 i.e i==4;
			else {
				newarray [i] =y[i-1];
			}
			}
		
		return newarray;
		
	}
	public static void main(String[] args) {
		int n = 10;
		int arr [ ] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("initial array:"+Arrays.toString(arr));;
 		
		// Element to be inserted
		int x = 50;
		//position at which element is to be inserted
		int position = 5;
		int [] arr7 = insertX(n,x, arr, position);
		 
		System.out.println(" \nArray with"+x+"inserted at position"+ position+":"+
		Arrays.toString(arr7));
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
