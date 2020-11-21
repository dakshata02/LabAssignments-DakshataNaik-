package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//Create a method to find the sum of the cubes of the digits of an n digit number
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
			
		}
		System.out.println(sum);
       
	}

}
