package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		//public int sum=0;
		double result=CalculateDifference(sum1(n)-sum2(n));
		System.out.println(result);
		

	}

	private static double CalculateDifference(int i) {
		return i;
		// TODO Auto-generated method stub
		
	}

	private static int sum2(int n) {
		
		long sum2=0;
		for(int i=1;i<=n;i++) {
			sum2=sum2+i;
			
		}
		return (int) (sum2*sum2);
	}

	private static int sum1(int n) {
		long sum1=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+i*i;
			
		}
		
		return (int) sum1;
	}

}
