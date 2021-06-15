package com;

import java.util.Comparator;

public class AgeWiseSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getAge() == e2.getAge())
			return 0;
		else if (e1.getAge() > e2.getAge())
			return 1;
		else
			return -1;
	}

}
