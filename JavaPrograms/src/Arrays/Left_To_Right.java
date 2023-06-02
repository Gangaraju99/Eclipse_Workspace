package Arrays;

public class Left_To_Right {
	public static void main(String[] args) {
		int a[] = { 2, 6, 5, 8, 9, 7, 5, };
		int n = 2; 
		//int first = pen[0];
		for (int i = 0; i <n; i++) {
			int j = 0;
			int first = a[0];
			
			for ( j = 0; j <a.length-1; j++) {
				a[j] = a[j + 1];

			}

	a[a.length-1]=first;
		}
System.out.println();
		System.out.println("output array"+"");
for(int i=0; i<a.length;i++) {
	System.out.print(a[i]+" ,");
}
		
	}

}


