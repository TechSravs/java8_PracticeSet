package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Q14 {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("sravani","sravs","vani",",");
		String s=l.stream().collect(Collectors.joining(","));
		System.out.println(s);
	}
	

}
