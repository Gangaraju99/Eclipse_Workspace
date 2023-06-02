package Arrays;

import java.util.Arrays;

public class Zeroes_ones_Order {
	public static void main(String[] args) {
		
		
		int i []= {2,0,1,2,1,0,1,2,0,0,1,1,2,2};
		//Arrays.sort(i);
		
		for (int k =0; k<=i.length;k++) {
			for(int j=k+1; j<+i.length;j++) {
				if(i[k] >i[j]) {
					int temp = i[k];
					i[k] = i[j];
					i[j] = temp;
				}
			}
			
		}
		
		
		System.out.println(Arrays.toString(i));
		
		
		}

	}


