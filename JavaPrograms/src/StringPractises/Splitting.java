package StringPractises;

public class Splitting {
	public static void main(String[] args) {
		String str = " Scaler by InterviewBit";
		//split string from space
		//syntax: string.split(string regex, int limit).........regex= string is divided at this specified regex
		
		String [] result = str.split(" ");
		for(int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}

}
}