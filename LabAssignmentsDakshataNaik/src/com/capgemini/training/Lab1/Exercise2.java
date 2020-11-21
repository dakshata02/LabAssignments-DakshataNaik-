package com.capgemini.training.Lab1;

import java.util.Scanner;

public class Exercise2 {

	private static final int Red = 0;
	private static final int Yellow = 1;
	private static final int Green = 2;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a your choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case Red:
			System.out.println("Stop");
			break;
		case Yellow:
			System.out.println("Ready");
			break;
		case Green:
			System.out.println("Go");
			break;
		}



	}

}
