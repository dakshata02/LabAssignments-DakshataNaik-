package com.capgemini.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of arrays");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		for(int s:arr) {
			System.out.println("Element in array is "+s);
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("Second Smallest no in array is."+arr[1]);
		
		

	}

}
