package com.cg.training.lab9.exe2;

import java.util.Scanner;

public class FormatString {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string ");
			String s = sc.next();
				
		StrInterf formatString=(s1) -> s1.replaceAll("", " ");

		System.out.println("result :"+ formatString.formattingstring(s));
		
	}
}


