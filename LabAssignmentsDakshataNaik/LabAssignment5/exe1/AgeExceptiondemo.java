package com.capgemini.training.Lab5.exe1;

import java.util.Scanner;

public class AgeExceptiondemo {
	static void validate(int age) throws AgeException {
		if (age < 15)
			throw new AgeException("not valid");
		else
			System.out.println("valid age");

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			validate(age);
		} catch (AgeException e) {
			System.out.println("Exception occured " + e);
		}

	}
}
