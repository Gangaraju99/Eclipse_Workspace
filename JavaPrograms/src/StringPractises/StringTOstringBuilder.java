package StringPractises;

public class StringTOstringBuilder {
	
  public static void main(String args[]) {
	      String strs[] = {"Scaler", "by", "InterviewBit!"};
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      System.out.println(sb.toString());
	   }
	 }

