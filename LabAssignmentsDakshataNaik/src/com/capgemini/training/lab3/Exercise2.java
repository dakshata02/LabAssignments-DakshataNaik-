package com.capgemini.training.lab3;
import java.util.*; 
public class Exercise2{
	
// Function to reverse a string in Java using StringBuilder
public static String rev(String s){
	s= new StringBuffer(s).reverse().toString();
	return s;

}

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
String s= sc.next(); 
String s1= rev(s);
System.out.println("Result after reversing a string is : "+s+"|"+s1);
}
}