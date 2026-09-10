package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		// Storing the data.. 1 M
		List<String> cities = Arrays.asList("Bangalore", "Chennia", "Hyderabad", "Ahmedabad", "Ajmer");

		// Processing --> Task(find the name starting with "A")

		// 1. Convert the collection to stream object
		Stream<String> inputStream = cities.stream();

		// 2. find the name starting with 'A' --> use filter
		Stream<String> filteredStream = inputStream.filter(city -> city.startsWith("A"));

		// 3. Collect or print the city name
		
		List<String> cityStartsWithA = filteredStream.collect(Collectors.toList());
		
		System.out.println(cityStartsWithA);
		
	//	List<String> cityStartsWithA1 = 	cities.stream().filter(w->w.startsWith("A")).collect(Collectors.toList());
		
	//	System.out.println(cityStartsWithA1);
		
	}

}
