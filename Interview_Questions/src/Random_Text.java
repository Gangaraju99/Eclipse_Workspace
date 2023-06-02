import java.util.Random;
import java.util.function.Supplier;

public class Random_Text {

	public static void main(String[] args) {

		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder();
		Random rd = new Random();
		int length = 6;
		for (int i = 0; i < 6; i++) {

			int index = rd.nextInt(s.length());
			char charAt = s.charAt(index);
			sb.append(charAt);

		}

		
		String string = sb.toString();
		System.out.println(string);
	}
}
