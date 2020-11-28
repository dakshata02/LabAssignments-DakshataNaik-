package com.capgemini.training.lab6.exe1;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Excercise1 {

	public static void main(String[] args) {
		
		 HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		
	        hm.put("Angular", 98); 
	        hm.put("Spring", 85); 
	        hm.put("SQL", 91); 
	        hm.put("Java", 95); 
	      
	       List<Integer> output = sortByValue(hm); 
	       System.out.println("Sorted list:" + output);
   	}

	public static List<Integer> sortByValue(HashMap<String, Integer> hm) 

    { 
        List list = new LinkedList(hm.entrySet()); 
        System.out.println(list);
        Collections.sort(list, new Sortbyval()) ; 
     
       List result = new LinkedList(); 
       Iterator i=list.iterator();
       while(i.hasNext())
       {
    	   Map.Entry map=( Map.Entry )i.next();
          result.add( map.getValue()); 

        } 

        return result; 

    } 

}

	       

		
		

