package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver2 {

	public static void main(String[] args) {
		// Storing the data.. 1 M
		List<List<String>> cities = Arrays.asList(Arrays.asList("Bangalore", "Chennia"),
				Arrays.asList("Hyderabad", "Ahmedabad", "Ajmer"), Arrays.asList("delhi"));

		System.out.println(cities);
		
		// Processing --> Task(find the name starting with "A" and convert to upper
		// case)

		
		  List<String> output = cities.stream().flatMap(list ->list.stream()).filter(w -> w.startsWith("A")).map(word
		  -> word.toUpperCase()) .collect(Collectors.toList());
		  
		  System.out.println(output);
		  
		 
	}

}
