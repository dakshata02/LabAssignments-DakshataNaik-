package com.capgemini.training.Lab5.exe3;

import java.util.Scanner;

public class EmployeeExceptiondemo {
	static void checkSalary(int salary) throws EmployeeException {
		if (salary < 3000)
			throw new EmployeeException("salary exception occured");
		else
			System.out.println("Your salary = " + salary);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		try {
			checkSalary(salary);
		} catch (EmployeeException e) {
			System.out.println("Your salary is less  than 3000 " + e);
		}
	}
}
