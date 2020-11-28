package com.capgemini.training.lab6.exe2;
import java.util.HashMap;
import java.util.Scanner;

public class Excercise2 {
	private static HashMap<Character, Integer> countChar(char[] input)
    {
         
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
       for (char c : input)
        {
            if(charMap.containsKey(c))
            {
                   charMap.put(c, charMap.get(c)+1);
            }
            else
            {
                 charMap.put(c, 1);
            }
        }
      
       return charMap;
    }
  
    public static void main(String[] args)
    
    {
       	Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
    	HashMap<Character, Integer> charMap=countChar(ch);
    	System.out.println(charMap);
  
     
    }
}


