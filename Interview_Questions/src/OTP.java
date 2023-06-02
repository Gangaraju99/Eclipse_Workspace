import java.util.Random;

public class OTP {
	public static void main(String[] args) {
		
		String number = "123456789";
		Random random = new Random();

		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<5;i++) {
			 
				int nextInt = random.nextInt(number.length());
				char charAt = number.charAt(nextInt);
				sb.append(charAt);
		
		}
		
		String string = sb.toString();
		System.out.println(string);
		
	}

}
