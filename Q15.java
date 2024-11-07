package com.java8_praticeSet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q15 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(4,5,6,5,3,7,8,9);
		Stream<Integer> s=l.stream().map(n->n*n);
		s.forEach(n-> System.out.println(n+ " "));
	}

}
