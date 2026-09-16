package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;

public class Driver4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("CH", "DL", "AHM", "HYD", "BLR", "CHE", "AHM", "HYD", "BLR", "CHE");

		// Task : Find the unique city
		
	//	List<String> out = list.stream().distinct().collect(Collectors.toList());
		
	//	System.out.println(out);
		
		
		list.stream().distinct().forEach(e -> System.out.println(e));
		
	}

}
