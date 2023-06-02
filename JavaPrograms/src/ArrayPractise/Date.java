package ArrayPractise;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class Date {
	public static void main(String[] args) {

		LocalTime t = LocalTime.now();
		System.out.println(t);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

		java.util.Date date = new java.util.Date();
		String formatdate = sdf.format(date);

		System.out.println(date);

		
		 Calendar calendar = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());
		   System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		   		

	}
}