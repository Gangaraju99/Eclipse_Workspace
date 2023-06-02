package Arrays;

import java.util.Arrays;

public class Removing {
	private static void remove(int x) {
		System.out.println("456");
		int [] firstArrays = {1,2,6,5,4,3};
		//System.out.println(firstArrays);
		int [] newArray = new int [firstArrays.length];
		int index = 2;
		for(int i =0,k=0;i<firstArrays.length-1;i++) {
			if(i==index) {
				continue;
			}
		
			newArray[k++]=firstArrays[i];
			
		}
	System.out.println("New Array:"+Arrays.toString(newArray)
			);
	}

}




