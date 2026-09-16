package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Hyderabad", "Surat", "Mysore", "Chennai", "Jaipur", "Noida", "Bangalore",
				"Gurugram", "Chennai", "Delhi", "Mumbai", "Ahmedabad");

		// count() vs Collectors.counting()
		long total = cities.stream().collect(Collectors.counting());

		System.out.println(total);

		Map<Object, List<String>> result = cities.stream().collect(Collectors.groupingBy(c -> c.length()));
		System.out.println(result);
	}

}
