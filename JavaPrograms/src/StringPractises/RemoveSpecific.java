package StringPractises;

public class RemoveSpecific {
	
	  public static void main(String args[]) 
	    {
	   //   String str = "Scaler by InterviewBit";
	    /* 
	      //remove the specified character.
	      System.out.println("String after removing 'e' = "+str.replace("e", ""));    
	     //remove the first occurrence of the specified character.
	     System.out.println("String after removing First 'e' = "+str.replaceFirst("e", ""));   

	    //remove all occurrences of the specified character.
	     * */
	     String st = "sb1g5er7";
	  System.out.println("String after replacing all small letters = "+st.replaceAll("([A-Z,a-z])", ""));
	  int sum =0;
	  char[] arr = (st.replaceAll("([A-Z,a-z])", "")).toCharArray();
	  
	  for(int i=0; i<arr.length;i++) {
		  sum = sum+ arr[i];
	  }
	System.out.println(sum);
	    
	    }
	 
	  
	  
	  
	}

