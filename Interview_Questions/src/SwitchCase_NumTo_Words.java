import java.util.Scanner;

public class SwitchCase_NumTo_Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String [] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		String numberInWords = "";
		
		
		if(number == 0) {
			System.out.println("zero");
		}
		
		while(number >0) {
			int digit = number%10;
		 numberInWords = words[digit]+" "+numberInWords;
		 number /= 10;
		}
		
		System.out.println(numberInWords);
		
		
	}

}
