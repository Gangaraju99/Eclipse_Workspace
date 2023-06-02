package SekharSir_Questions;

import java.util.Arrays;

class Intersection {
	static int[] commonElements(int[] x, int[] y) {
		int array1[] = x;
		int[] array2 = y;
	StringBuilder sb = new StringBuilder();


	
	for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					sb.append(array1[i]+",");
	                }
			       }
	              }	
	            
	
	String s1 = sb.toString();
	System.out.println(s1);
  char [] chararray= new char[s1.length()];
  chararray = s1.toCharArray();
  int [] intarray = new int [s1.length()];
   for(int i =1; i<s1.length();i++) {
	   intarray[i]= (int)chararray[i];
	   
   }
	System.out.println(Arrays.toString(intarray));			
				
			
		

 
	
		return intarray;
	}
}







public class Array_Problem {
	public static void main(String[] args) {
		int[] inputArray1 = { 2,13,14,15,16 };
		int[] inputArray2 = { 3,14,20,17,16};
		int[] resultarray1 = Intersection.commonElements(inputArray1, inputArray2);
     //	System.out.println(Arrays.toString(resultarray1));

     	
     	
	}

}
