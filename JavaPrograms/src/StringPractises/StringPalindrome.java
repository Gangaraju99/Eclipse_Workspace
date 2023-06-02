package StringPractises;

public class StringPalindrome {
	

	public class PalindromeChecker 
	{
	    public static void main (String[] args) 
	    {
	       String str1 = "rotator";                         
	       String revstr = reverseString(str1); //revstr=reverse string
	       if (str1.equals(revstr)) 
	          {
	              System.out.println("The string" + str1 + " is a Palindrome String.");
	          } 
	        else 
	          {
	           System.out.println("The string" + str1 + " is not a Palindrome String.");
	          }
	    }
	    // a method for reversing a string
	    public static String reverseString(String str2) 
	    {
	        String revstr = "";
	        for (int i = str2.length() - 1; i >= 0; i--) 
	         {
	            revstr += str2.charAt(i);
	         }
	            return revstr;
	     }
	}
}
