package com.capgemini.training.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	static int modifyNumber(int num)
	{
		StringBuffer temp = new StringBuffer();
		int difference=0;
		String str=Integer.toString(num);
		for(int i=0;i<str.length()-1;i++)
		{
			char c=str.charAt(i);
			int n1=c;
			char c1=str.charAt(i+1);
			int n2=c1;
			temp.append(Math.abs(n1-n2));
			
		}
		temp.append(str.charAt(str.length()-1));
		String s=temp.toString();
		int result=Integer.parseInt(s);
		

		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		 int output=modifyNumber(number);
		 System.out.println(output);
	}

}