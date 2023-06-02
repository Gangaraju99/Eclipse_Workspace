package StringPractises;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String str1 = "Bored";
		String str2 = "Robed";
		//convert strings to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		//check to see if the lengths are the same 
		if(str1.length() == str2.length()) {
			//convert strings into char array
			char [] str1chararray = str1.toCharArray();
			char [] str2chararray = str2.toCharArray();
			// sort the char array
			Arrays.sort(str1chararray);
			Arrays.sort(str2chararray);
			// if the sorted arrays r same or identical then the strings r anagram
			
			boolean result = Arrays.equals(str1chararray,str2chararray );
			if(result) {
				System.out.println(str1 +"and"+str2+"are anagram of each other");
			}else {
				System.out.println(str1 +"and"+str2+"are not anagrams of each other");
			}
			
		}else {
				System.out.println(str1+" and "+str2+"are not anagrams of each other");
			}
		}
		
	}


