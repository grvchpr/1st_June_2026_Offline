package com.kodewala.stream.api2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Delhi", "Raipur", "Jaipur", "Ahmedabad",
				"Mumbia", "Hyderabad");

		// Single threaded stream
		List<String> out = list.stream().filter(w -> w.startsWith("B")).collect(Collectors.toList());

		// processing 1 gb data --> 5 mins
		System.out.println(out);

		list.parallelStream().filter(w -> w.startsWith("B"));

		// System.out.println(out1);
	}

}
