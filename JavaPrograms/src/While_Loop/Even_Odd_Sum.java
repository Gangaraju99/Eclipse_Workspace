package While_Loop;

public class Even_Odd_Sum {
	public static void main(String[] args) {
		adding ();
	}
		private static void adding( ) {
		int a[] = { 10, 7, 23, 1, 64 };
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];

			} else {
				sum2 = sum2 + a[i];
			}
		}
		System.out.println("Even numbers sum=" + sum);
		System.out.println("Odd numbers sum2" + sum2);
}
	}







