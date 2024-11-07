package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q13 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(45,6,8,1,2,3,46,89,9,4);
		Optional<Integer> s=l.stream().max(Integer::compareTo);
		System.out.println("Maximum number is : "+s.get());

	}

}
