package com.qa.day5.project;

public class Vehicle1 extends Vehicle {
	
	//Attributes
	private boolean existingMOT;
	private int lastServiced;
	
	//Constructor	
	public Vehicle1(String engTypeP, float engSizeP, String vehTypeP, int manYearP, boolean existingMOT, int lastServiced) {
		super(engTypeP, engSizeP, vehTypeP, manYearP);
		this.existingMOT = existingMOT;
		this.lastServiced = lastServiced;
	}

	//Methods
	@Override
	public float fixVehicle() {
		
		float cost = 0;
		
		if (existingMOT == false) {
			cost += 300f;
		}
		
		if (lastServiced < 2020) {
			cost += 150f;
		} else if (lastServiced > 2020 && lastServiced < 2021) {
			cost += 75f;
		} 
		
		if (getEngType() == "petrol") {
			cost += 100f;
		} else if (getEngType() == "diesel") {
			cost += 200f;
		} else if (getEngType() == "electric") {
			cost += 300f;
		}
		
		if (getEngSize() <= 1.4) {
			cost += 100f;
		} else if (getEngSize() > 1.4 && getEngSize() <= 2) {
			cost += 200f;
		} else if (getEngSize() > 2) {
			cost += 300f;
		}
		
		if (getVehType() == "hatchback") {
			cost += 100f;
		} else if (getVehType() == "salon") {
			cost += 200f;
		} else if (getVehType() == "SUV") {
			cost += 300f;
		}
		
		if (getManYear() > 2020) {
			cost += 100f;
		} else if (getManYear() < 2020 && getManYear() > 2010) {
			cost += 200f;
		} else if (getManYear() < 2010) {
			cost += 300f;
		}
		
		System.out.print("The total cost to fix this vehicle is £");
		
		return cost;
	}
	
	//Getters and setters
	public boolean isExsitingMOT() {
		return existingMOT;
	}

	public void setExistingMOT(boolean existingMOT) {
		this.existingMOT = existingMOT;
	}

	public int getLastServiced() {
		return lastServiced;
	}

	public void setLastServiced(int lastServiced) {
		this.lastServiced = lastServiced;
	}	

	



	
	
	
	
}
