package com.capgemini.training.lab3;
import java.util.Scanner;

public class Exercise3 {
	static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
        return true; 
    } 
  
    // Function that replaces consonant with 
    // next immediate consonant alphabatically 
    static String replaceConsonants(char[] s)  
    { 
        // Start traversing the string 
        for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            { 
  
                
                if (s[i] == 'z')  
                { 
                    s[i] = 'b'; 
                } 
                  
                
                else
                { 
  
                    s[i] = (char) (s[i] + 1); 
                    if (isVowel(s[i]))  
                    { 
                        s[i] = (char) (s[i] + 1); 
                    } 
                } 
            } 
        } 
        return String.valueOf(s); 
    } 
	public static void main(String[] args)  
	{  
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	System.out.print("Enter a string: ");  
	String s= sc.nextLine();    
	
	 System.out.println(replaceConsonants(s.toCharArray())); 
}
}