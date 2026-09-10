package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {

	public static void main(String[] args) {
		// Storing the data.. 1 M
		List<String> cities = Arrays.asList("Bangalore", "Chennia", "Hyderabad", "Ahmedabad", "Ajmer");

		// Processing --> Task(find the name starting with "A" and convert to upper
		// case)

		List<String> output = cities.stream().filter(w -> w.startsWith("A")).map(word -> word.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(output);

		long totalElements = cities.stream().filter(w -> w.startsWith("A")).map(word -> word.toUpperCase()).count();
		System.out.println(totalElements);
	}

}
