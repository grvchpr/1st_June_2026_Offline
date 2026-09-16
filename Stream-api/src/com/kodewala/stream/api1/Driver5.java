package com.kodewala.stream.api1;

import java.util.Arrays;
import java.util.List;

class Employee {
	String name;
	int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Driver5 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Rahul", 20000), new Employee("Sanjay", 30000),
				new Employee("Mohit", 40000), new Employee("Raza", 54000), new Employee("Anil", 103000));

		Employee out = employees.stream().sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())).skip(1)
				.findFirst().get();
		
		System.out.println(out.getName() + " and " + out.getSalary());

	}

}
