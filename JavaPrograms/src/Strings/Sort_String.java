package Strings;

import java.util.Arrays;

public class Sort_String {
public static void main(String[] args) {
		
		String name = "5,2,3,6";
		char [] arr = name.toCharArray();
		char temp ;
		for (int i = 0; i<arr.length;i++) {
			for (int j = i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
	}	
				
}
System.out.println(new String (arr));

System.out.println("=================");

//Approach-2


char[]charArray =name.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));






}
}



