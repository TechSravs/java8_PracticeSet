package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q12 {

	public static void main(String[] args) {
		List<String> l=Arrays.asList("sravani","shaiksha","vani"," "," ");
		Stream<String> s=l.stream().filter(n-> !n.isEmpty());
		s.forEach(n-> System.out.println(n));
		

	}

}
