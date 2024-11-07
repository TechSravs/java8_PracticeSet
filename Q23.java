package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q23 {

	public static void main(String[] args) {
		List<String>l=Arrays.asList("Shaikshavali","ram","sravani","vani","ruchi","dakshi");	
		 List<String> s=l.stream().filter(n -> n.length()>5).collect(Collectors.toList());
		 s.forEach(n -> System.out.println(n));
		 



	}

}
