package interview.questions;

import java.security.SecureRandom;
import java.util.Random;

public class Password {
	private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	private static final String NUMBER = "0123456789";
	//private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?/{}[]|";
	private static final String ALL_CHAR =CHAR_LOWER + CHAR_UPPER+  NUMBER ;
	//SecureRandom is a subclass of the Random
	private static final SecureRandom RANDOM = new SecureRandom();

	public static String generatePassword(int length) {
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < length; i++) {
			//nextInt() method is used to generate a random integer within the specified range (min and max),
			//nextInt() is randomly select only some integer value
			int randomIndex = RANDOM.nextInt(ALL_CHAR.length());
			//based on the integer or index value chatAt() method will pick the value
			password.append(ALL_CHAR.charAt(randomIndex));
		}
		return password.toString();
	}

	public static void main (String...args) {
		int passwordLength = 6; // specify the desired password length
		String password = generatePassword(passwordLength);
		System.out.println("Generated Password: " + password);
	}

}
