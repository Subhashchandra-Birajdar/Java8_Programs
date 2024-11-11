package com.J8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Bannana","Apple","Mango","grapes");
		
		// ascending or natural order
		List<String> list = fruits.stream()
								.sorted()
								.toList();
		System.out.println("The ascending order is :"+list);
		
		// descending order is
		List<String> desc = fruits.stream()
					.sorted(Comparator.reverseOrder())
					.toList();
		System.out.println("The descending order is :"+desc);
	}
}
