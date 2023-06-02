package StringPractises;

public class RemoveSlashes {
	public static void main(String[] args) {
		
		
		String str =6+"{\"name\":\"John Smith\", \"age\":30}";
		System.out.println("given string::"+str);
		
		
		
		String str2 = str.replace("\"","\\\"");
		System.out.println("original string::"+str2);
		
		
		String substring = str2.substring(0,9).replaceAll("\\\\"," ");
		System.out.println(substring);
		String[] split = str2.split(":");
		String a = split[0];
		String b = split[1];
		String c = split[2];

		String last = substring+":"+b+c;
		System.out.println(last);

				
		
		
		
		
		
		
		
		
		
		
	}

}
