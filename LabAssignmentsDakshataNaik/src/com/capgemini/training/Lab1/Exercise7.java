package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		boolean result= checkNumber(n);
		if(result) {
			System.out.println("not an Increasing number");
		}else {
			System.out.println("increasing number");
	}
	}

	public static boolean checkNumber(int n) {
		boolean flag=false;
		int rem=n%10;
		n=n/10;
		while(n!=0) {
			if(rem<n%10) {
				flag=true;
				break;
			}
			rem=n%10;
			n=n/10;
		}
		
		
		return flag;
		
		// TODO Auto-generated method stub
		
	}

}
