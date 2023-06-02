package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("java","scala","c++","haskell");
		
		
		List<String> collect = l.stream().map(u -> u.toUpperCase()).collect(Collectors.toList());
		
		
		
		System.out.println(collect);
		
		
		List<String> filter = l.stream().filter(p-> p.startsWith("j")).collect(Collectors.toList());
		System.out.println(filter);
		
	//applying 12% vat on each purchase
		
		List<Integer> list = Arrays.asList(100,200,300,400,500);
		Double double1 = list.stream().map(fun -> fun + 0.12*fun).reduce((sum,fun) -> sum+fun).get();
		
		System.out.println(double1);
		
	}

}
