package com.cg.training.lab9.exe3;

import java.util.Scanner;

public class Excercise3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username");
	String str1 = sc.next();
	System.out.println("Enter password");
	String str2 = sc.next();
	validity p=(x,y)->x.equals("Dak") && y.equals("123456");
	System.out.println("Result:"+p.authentication(str1, str2));

}
}