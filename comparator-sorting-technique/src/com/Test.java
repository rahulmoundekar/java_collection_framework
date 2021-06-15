package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(2, "h", 24));
		list.add(new Employee(5, "t", 20));
		list.add(new Employee(8, "l", 32));
		list.add(new Employee(9, "j", 28));
		list.add(new Employee(10, "e", 36));
		list.add(new Employee(52, "s", 18));
		list.add(new Employee(42, "m", 15));
		list.add(new Employee(36, "z", 10));

		list.forEach(System.out::println);

		Collections.sort(list, new AgeWiseSorting());
		System.out.println("_______________________________________");
		list.forEach(System.out::println);
		System.out.println("_______________________________________end");

		Collections.sort(list, new NameWiseSorting());
		list.forEach(System.out::println);

	}

}
