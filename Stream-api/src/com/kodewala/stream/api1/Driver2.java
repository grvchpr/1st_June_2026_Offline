package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(32, 543, 2, 98, 6, 3, 21, 46, 7, 3, 56, 3, 63, 8, 52, 45, 8, 6, 3, 78,
				54321, 632);

		Map<Boolean, List<Integer>> output = input.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(output);
	}

}
