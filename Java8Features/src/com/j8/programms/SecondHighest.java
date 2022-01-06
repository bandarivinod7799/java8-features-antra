package com.j8.programms;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighest {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Vinod", 112, 20000.0));
		emp.add(new Employee("Satish", 113, 70000.0));
		emp.add(new Employee("Nadish", 114, 15000.0));
		emp.add(new Employee("ABCD", 115, 30001.0));
		emp.add(new Employee("LMN", 116, 7005.0));
		emp.add(new Employee("XYZ", 108, 6500.0));

		List<Employee> collect = emp.stream().sorted(Comparator.comparingDouble(Employee::getEmpSal).reversed())
				.limit(2).collect(Collectors.toList());

		Optional<Employee> findFirst = emp.stream().sorted(Comparator.comparingDouble(Employee::getEmpSal).reversed())
				.skip(1).findFirst();
		System.out.println(collect);
		System.out.println("Second Highest salary   " + findFirst);
		emp.forEach(e -> System.out.println(e.getName()));
	}

}
