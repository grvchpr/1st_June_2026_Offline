package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("CH", "DL", "AHM", "HYD", "BLR", "CHE","AHM", "HYD", "BLR", "CHE");

		// find the city starting with 'C' and convert to lower case
		// and length should be more than 2

		List<String> output = list.stream().filter(city -> city.startsWith("C")).map(city -> city.toLowerCase())
				.filter(city -> city.length() > 2).collect(Collectors.toList());

		// when we call terminal operation, intermediate operation will be executed
		System.out.println(output);
		
		
		
	}

}
