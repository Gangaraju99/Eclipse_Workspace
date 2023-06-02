package Strings;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "Hello";
		
	//Approach -1
		char [] charArr = str.toCharArray();
		for(int i = charArr.length-1;i>=0;i--) {
			System.out.println(charArr[i]);
			
		}
	//System.out.println("===========");
	
	//Approach-2
		
	for(int i = charArr.length-1;i>=0;i--) {
		System.out.println(str.charAt(i));
	}
	
//	System.out.printl("===========");
	
	
	//Approach-3
	
	StringBuffer sb = new StringBuffer("Raju");
	System.out.print(sb.reverse());
	System.out.println();
	
	//Approach-4
	StringBuilder sbuilder = new StringBuilder(str);
	System.out.println(sbuilder.reverse());
	
	//
	
	
	
	
	
	
	}


}
