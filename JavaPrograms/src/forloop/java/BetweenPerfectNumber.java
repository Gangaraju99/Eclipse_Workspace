package forloop.java;

public class BetweenPerfectNumber {
	
	// If the sum of the factors of a number excluding that number is equal to the given number then
	  //  it is called
	private static void findperfect() {
		int x = 23;
		int y = 99;
		
		for(int i = x; i<y; i++) {
			int sum =0;
			
			for(int j =1; j<=i/2; j++) {
				if(i%j==0) {
					sum += j;
					
				}
			}
		
		if (sum==i) {
			System.out.println(i);
		}
		
		}
	}

public static void main(String...args) {
	findperfect();
}

}
