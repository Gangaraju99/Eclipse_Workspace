package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Long_Substring {
	public static void main(String[] args) {
		lengthOfLongestSubString("gangaraju");
	}
	public static void lengthOfLongestSubString(String s) {
		String LongestSubstring = null;
		int LongestSubstringLength = 0;
		Map<Character, Integer > Map = new LinkedHashMap<Character, Integer>();
		char [] arr = s.toCharArray();
		for(int i =0;i<arr.length;i++) {
			char ch = arr[i];
			if(!Map.containsKey(ch)) {
				Map.put(ch,i);
			}else {
				i=Map.get(ch);
				Map.clear();
				
			}
	if(Map.size()>LongestSubstringLength) {
		LongestSubstringLength = Map.size();
		LongestSubstring =Map.keySet().toString();
		
	}
		}
		System.out.println("The longest substring :"+LongestSubstring);
		System.out.println("the longest substring length:"+LongestSubstringLength);
	
	}
	

}







