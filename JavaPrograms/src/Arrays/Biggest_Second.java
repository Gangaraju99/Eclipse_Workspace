package Arrays;

public class Biggest_Second {

	public static void main(String[] args) {
		/*
		 * Integer a[] = { 8,5,9,3,6,74,25,63}; //Arrays.sort(a,
		 * Collections.reverseOrder()); Arrays.sort(a);
		 * System.out.println(Arrays.toString(a));
		 * System.out.println("Biggest number is:"+a[a.length-1]);
		 * System.out.println("Second Bigest Number is:"+a[a.length-2]);
		 * 
		 */

		int big[] = { 56, 89, 63, 789, 563, 1002 };
		int max = big[0];
		int secondMax = big[0];
		int j = 0;

		for (int i = 0; i < big.length; i++) {
			if (big[i] > max) {
				max = big[i];
			}
		}

		for (int p = 0; p < big.length; p++) {

			if (max != big[p]) {
				if (big[p] > secondMax) {
					secondMax = big[p];

				}

			}

		}

		System.out.println("First Biggest Number =" + max);
		System.out.println("Second Biggest Number =" + secondMax);

	}
}
