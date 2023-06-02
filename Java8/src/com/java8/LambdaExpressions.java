package com.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("mango","grapes","orange","banana");
		
		//using for each loop
		for(String s : list) {
			System.out.println(s);
		}
		
		//in java 8
		//list.forEach(u->System.out.println(u));
	
		//method reference
		list.forEach(System.out::println);
		
	}

}
