package StringPractises;

public class Swapping {
	public static void main(String[] args) {
	//using third variable
	int a =10;
	int b = 20;
	int c = a;
	a=b;
	b=c;
	//without third variable
	
	a= a+b;//10+20=30
	b =a-b;//30-20
	a=a-b;//30-10
	
	//without third variable
	a=a*b;
	b=a/b;
	a=a/b;
	//bitwise xor(^)
	a=a^b;
	b=a^b;
	a=a^b;
	//single statement
	b=a+b-(a=b);
	System.out.println(a+" "+b);
		
		
		
		
		
		
		
		
		
		
	}

}
