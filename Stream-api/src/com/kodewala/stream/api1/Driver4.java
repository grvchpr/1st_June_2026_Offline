package com.kodewala.stream.api1;

public class Driver4 {

	public static void main(String[] args) {

		String input = "swiss"; // index of char and last index of char

		Character output = input.chars().mapToObj(c -> (char) c)
				.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();

		System.out.println(output);
	}

}
