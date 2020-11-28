package com.cg.training.lab9.exe4;

public class Car {

	private String CarName;
	private String CarColor;
	
	public Car(){
		
	}
	

	@Override
	public String toString() {
		return "Car [CarName=" + CarName + "]";
	}


	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarColor() {
		return CarColor;
	}

	public void setCarColor(String carColor) {
		CarColor = carColor;
	}

	public Car(String carName, String carColor) {
		super();
		CarName = carName;
		CarColor = carColor;
	}
	
}
