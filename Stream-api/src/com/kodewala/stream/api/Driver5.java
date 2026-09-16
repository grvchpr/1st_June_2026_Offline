package com.kodewala.stream.api;

import java.util.Arrays;
import java.util.List;

public class Driver5 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("CH", "DL", "AHM", "HYD", "BLR");

		// filter the city starting with C and give me first city

		// list.stream().filter(c -> c.startsWith("C")).limit(1).forEach(e ->
		// System.out.println(e));

		// list.stream().sorted().forEach(n -> System.out.println(n));

		// skip

		// list.stream().skip(2).forEach(n -> System.out.println(n));

		// find first

		String element = list.stream().findFirst().get();

		System.out.println(element);

	}

}
