package com.capgemini.training.lab3;

import java.util.*;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		String numbers = sc.nextLine();

		int sum = 0;

		StringTokenizer st = new StringTokenizer(numbers);

		System.out.println("Given numbers are : ");
		while (st.hasMoreTokens()) {

			int n = Integer.parseInt(st.nextToken());
			System.out.println(n + " ");
			sum = sum + n;
		}

		System.out.println("Sum of all numbers is : " + sum);

	}

}