package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q7 {

	public static void main(String[] args) {
		
		List<String> l1=Arrays.asList("sravani","vani","chintre");
         Optional<String> s=l1.stream().max((a,b)->(Integer.compare(a.length(),b.length())));
	s.ifPresent(n->System.out.println(n));	
		
	}

}
