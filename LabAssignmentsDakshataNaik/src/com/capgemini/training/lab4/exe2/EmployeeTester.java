package com.capgemini.training.lab4.exe2;

import java.util.Scanner;

public class EmployeeTester {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Enter Employee ID:");
		Integer id = sc.nextInt();
		employee.setId(id);
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		employee.setName(name);
		System.out.println("Enter Employee Salary:");
		Double sal = sc.nextDouble();
		employee.setSalary(sal);
		System.out.println("Enter Employee Designation:");
		String desig = sc.next();
		employee.setDesignation(desig);
		sc.nextLine();
		
		EmployeeServiceImplementation esi = new EmployeeServiceImplementation();
		esi.getDetails(employee);
		esi.displayDetails(employee);
		esi.findInsuranceScheme(employee);
		
	}

}
