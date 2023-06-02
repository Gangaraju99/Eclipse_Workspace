package ForLoop_Practise;

import java.util.Scanner;

public class SecondMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int num= sc.nextInt();
		int x,y,z =0;
		String words []= {"Zero","one","two","three","four","five","six","seven","eight","nine"};
		if(num<10) {
			System.out.println(words[num]);
			}else if(num<100){
				x=num/10;
				y=num%10;
				
				System.out.println(words[x]+" "+words[y]);
			}else if(num<1000) {
				x=num/100;
				y=(num%100)/10;
				z=num%10;
				System.out.println(words[x]+" "+words[y]+" "+words[z]);
			}
	sc.close();
	
	}

}


