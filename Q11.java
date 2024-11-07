package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q11 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(56,3,5,8,90,54,34);
		Stream<Integer> s=l.stream().sorted((a,b)->(b-a));
		s.forEach(n-> System.out.println(n+" "));
		
		
	 	
	}

}
