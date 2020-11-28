package com.cg.training.lab9.exe4;

import java.util.ArrayList;
import java.util.List;

public class CarTester {

	
	
	public static void main(String[] args) {
		List<Car> CarList=new ArrayList<>();
		getDetails(CarList);
		CarList.stream()
		.map(Car::getCarName)
		.forEach(System.out::println);
	   

		
	}

	private static void getDetails(List<Car> carList) {
		carList.add(new Car("bmw","blue"));
		carList.add(new Car("Audi","Black"));

		
	}

}
