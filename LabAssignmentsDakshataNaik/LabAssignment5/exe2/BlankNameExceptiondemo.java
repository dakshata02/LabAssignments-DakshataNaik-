package com.capgemini.training.Lab5.exe2;

import java.util.Scanner;

public class BlankNameExceptiondemo {
	static void validageName(String fname, String lname) throws BlankNameException {
		if (fname.isEmpty() || lname.isEmpty())
			throw new BlankNameException("blank value entered");
		else
			System.out.println("Your name is : " + fname + " " + lname);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = sc.nextLine();
		System.out.println("Enter last name");
		String lname = sc.nextLine();
		try {
			validageName(fname, lname);
		} catch (BlankNameException e) {
			System.out.println("Exception occured for blank name" + e);
		}
	}

}
