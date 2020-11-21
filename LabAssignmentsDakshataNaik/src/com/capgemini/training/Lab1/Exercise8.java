package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean result=checkNumber(n);
		if(result) {
			System.out.println("Number is a power of 2");
			
		}else
			System.out.println("Number is not power of 2");
	}

	private static boolean checkNumber(int n) {
		for(int i=0;i<=n;i++){
		if(Math.pow(2, i)==n) {
			return true;
			
		}
		
		}
		
		return false;
	}

}
