package ArrayPractise;

import java.util.Arrays;

public class Insert2 {
	public static void main(String[] args) {
		Integer []  arr = {10,23,14,45,52};
		int length = arr.length;
		int index = 3;
		Integer [] newarr = new Integer[length+1];
		 int j =0;
		 
		 for(int i = 0; i< newarr.length ;i++) {
			 if(i == index) {
				 newarr[i] =7;
			 }else {
				 newarr[i]=arr[j];
				 j++;
				 
			 }
		 
		 }
			System.out.println("Array after adding value:"+Arrays.toString(newarr));

	}

}
