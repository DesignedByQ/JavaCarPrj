package com.qa.day5.project;

public class SUV extends Vehicle {
	
	//Attributes
	private boolean exsitingMOT;
	private int LastServiced;
	
	//Constructor	
	public SUV(String engTypeP, float engSizeP, String vehTypeP, int manYearP, boolean exsitingMOT, int lastServiced) {
		super(engTypeP, engSizeP, vehTypeP, manYearP);
		this.exsitingMOT = exsitingMOT;
		LastServiced = lastServiced;
	}

	//Methods
	@Override
	public float fixVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Getters and setters
	public boolean isExsitingMOT() {
		return exsitingMOT;
	}

	public void setExsitingMOT(boolean exsitingMOT) {
		this.exsitingMOT = exsitingMOT;
	}

	public int getLastServiced() {
		return LastServiced;
	}

	public void setLastServiced(int lastServiced) {
		LastServiced = lastServiced;
	}	

	



	
	
	
	
}
