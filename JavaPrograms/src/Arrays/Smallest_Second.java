package Arrays;

public class Smallest_Second {
	public static void main(String[] args) {
		/*
		 * int a []= {2,9,6,7,3,8}; Arrays.sort(a);
		 * System.out.println("smallest number is:"+a[0]);
		 * System.out.println("Second smallest number is:"+a[1]); }
		 */

		int[] arr = {23,12,5,6,8,94,5};
		int small = arr[0];
		int secondSmall = arr[0];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}

		for (int p = 0; p < arr.length; p++) {

			if (small != arr[p]) {
				if (arr[p] < secondSmall) {
					secondSmall = arr[p];

				}

			}

		}

		System.out.println("First smallest Number =" + small);
		System.out.println("Second smallest Number =" + secondSmall);

	}
}


