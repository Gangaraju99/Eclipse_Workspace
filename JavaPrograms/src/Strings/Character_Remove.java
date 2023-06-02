package Strings;

public class Character_Remove {
	public static void main(String[] args) {
		String replace = "Ga&ng23651a$r)j@a*u";
		String h = replace.replaceAll("[^A-Z,a-z]", "");
		System.out.println(h);

		System.out.println("=============");

		// Remove White Spaces in String
		String remove = "    I     can ge t     t  h    e    j o   b";
		String str = remove.replaceAll("\\s", "" + "");
		System.out.println(str);

		System.out.println("============");

		// Remove duplicate characters

		String du = "gangaraju";
		char[] arr = du.toCharArray();
		StringBuilder sb4 = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = true;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					repeated = false;
					break;
				}
			}
			boolean repeat = true;
			if (!repeat) {

				sb4.append(arr[i]);
			}
		}

		System.out.println(sb4);

	}
}
