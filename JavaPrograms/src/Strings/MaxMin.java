package Strings;

public class MaxMin {
	public static void main(String[] args) {
		//String s = "2,1,3,53,47";
		int [] c = {2,5,6,3,9,1};		
		//char [] c = s.toCharArray();
		int max =c[0];
		int min =c
				[0];
		for (int i = 0; i<c.length;i++) {
			if(c[i]>max) {
				max=c[i];
			}
			if(c[i]<min) {
				min = c[i];
			}
		}
		System.out.println("maximum value:"+max);
		System.out.println("minimum value:"+min);
				
		}
		
	}





