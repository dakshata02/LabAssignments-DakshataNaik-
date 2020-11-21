package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise5Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number upto which you want sum");
		int num=sc.nextInt();
	   
	   System.out.println(calculateSum(num));

	}
	public static int calculateSum(int num ) {
		int sum=0;
		//while(num!=0) {
			for(int i=1;i<=num;i++) {
				if(i%3==0 || i%5==0) {
					sum=sum+i;
					
				}
			}
		//}
		return sum;
		
	}

}
