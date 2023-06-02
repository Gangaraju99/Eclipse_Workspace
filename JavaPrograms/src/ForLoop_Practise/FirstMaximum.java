package ForLoop_Practise;

public class FirstMaximum {
	private static void big(String n) {
		int	 big [] = {56,89,63,789,563,1002};
		int max = big[0];
		int secondMax =big[0];
		int j = 0;
	
      for(int i =0; i<big.length;i++) {
		    if(big[i]>max) {
				   max= big[i];
			  }
		  }
       for(int p = 0; p<big.length;p++) {
		 
		if(max!=big[p]) {
			if(big[p]>secondMax) {
				secondMax = big[p];
				}
			}
			
		}
	System.out.println("First Biggest Number =" + max);
	System.out.println("Second Biggest Number =" + secondMax);
	
	}

}


