package Strings;

public class Reverse_Each_Word {
	public static void main(String[] args) {
		String input = "java code";
		System.out.println(input);
		String output = "";
		String [] words = input.split(" ");
				for(String word : words) {
					String revword ="";
					for(int i = word.length()-1; i>=0;i--) {
						revword = revword+word.charAt(i);
					
				
					}
				
	output = output+ revword + "";
				}	
	System.out.println(output);
	}

}





