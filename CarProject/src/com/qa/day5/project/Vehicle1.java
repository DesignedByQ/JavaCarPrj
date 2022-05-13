package com.qa.day5.project;

public class Vehicle1 extends Vehicle {
	
	//Attributes
	private boolean existingMOT;
	private int LastServiced;
	
	//Constructor	
	public Vehicle1(String engTypeP, float engSizeP, String vehTypeP, int manYearP, boolean existingMOT, int lastServiced) {
		super(engTypeP, engSizeP, vehTypeP, manYearP);
		this.existingMOT = existingMOT;
		this.LastServiced = lastServiced;
	}

	//Methods
	@Override
	public float fixVehicle(String engTypeP, float engSizeP, String vehTypeP, int manYearP) {
		
		float cost = 0;
		
		if (existingMOT == false) {
			cost += 300f;
		}
		
		if (LastServiced < 2020) {
			cost += 150f;
		} else if (LastServiced > 2020 && LastServiced < 2021) {
			cost += 75f;
		} 
		
		if (engTypeP == "petrol") {
			cost += 100f;
		} else if (engTypeP == "diesel") {
			cost += 200f;
		} else if (engTypeP == "electric") {
			cost += 300f;
		}
		
		if (engSizeP <= 1.4) {
			cost += 100f;
		} else if (engSizeP > 1.4 && engSizeP <= 2) {
			cost += 200f;
		} else if (engSizeP > 2) {
			cost += 300f;
		}
		
		if (vehTypeP == "hatchback") {
			cost += 100f;
		} else if (vehTypeP == "salon") {
			cost += 200f;
		} else if (vehTypeP == "SUV") {
			cost += 300f;
		}
		
		if (manYearP > 2020) {
			cost += 100f;
		} else if (manYearP < 2020 && manYearP > 2010) {
			cost += 200f;
		} else if (manYearP < 2010) {
			cost += 300f;
		}
		
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
		return LastServiced;
	}

	public void setLastServiced(int lastServiced) {
		LastServiced = lastServiced;
	}	

	



	
	
	
	
}
