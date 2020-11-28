package com.capgemini.training.lab6.exe1;

import java.util.Comparator;
import java.util.Map;

public class Sortbyval implements Comparator<Map.Entry<String, Integer> > {
//
//	@Override
//	public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
//		 return (a.getValue())-(b.getValue()); 
//		
//	}

	@Override
	public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
		// TODO Auto-generated method stub
		return (a.getValue().compareTo(b.getValue()));
	}

}
