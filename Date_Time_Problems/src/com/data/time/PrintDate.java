package com.data.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PrintDate {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2023-05-24");
		LocalDate date1 = LocalDate.of(2023,05,24);

		
		//plusDays() and minusDays()
		
		LocalDate ld = LocalDate.now();
		LocalDate minusDays = ld.plusMonths(2);
		LocalDate plusDays = ld.plusDays(1);
		
		//getter methods
		
		LocalDate local = LocalDate.now();
		DayOfWeek dayOfWeek = local.getDayOfWeek();
		Month month = local.getMonth();
		int dayOfMonth = local.getDayOfMonth();

		//idLeapYear()
		LocalDate currDate = LocalDate.now();
		boolean leapYear = currDate.isLeapYear();
		
		//period and duration
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = d1.plusDays(15).plusMonths(8).plusYears(2);
		int months = Period.between(d1, d2).getMonths();
		
		//date formatting
		LocalDate dl = LocalDate.now();
		String format = dl.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format);
		
		
		
		
		
		
	}

}
