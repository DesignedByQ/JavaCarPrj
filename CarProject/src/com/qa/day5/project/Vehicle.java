package com.qa.day5.project;

public abstract class Vehicle {
	
	//attributes
	private String engType;
	private float engSize;
	private String vehType;
	private int manYear;
	
	//constructor
	public Vehicle(String engTypeP, float engSizeP, String vehTypeP, int manYearP) {
		super();
		this.engType = engTypeP;
		this.engSize = engSizeP;
		this.vehType = vehTypeP;
		this.manYear = manYearP;
	}
	
	//Methods
	public abstract float fixVehicle();
	
	
	@Override
	public String toString() {
		return "Vehicle [engType=" + engType + ", engSize=" + engSize + ", vehType=" + vehType + ", manYear=" + manYear
				+ "]";
	}

	//Getters and setters
	public String getEngType() {
		return engType;
	}

	public void setEngType(String engType) {
		this.engType = engType;
	}

	public float getEngSize() {
		return engSize;
	}

	public void setEngSize(float engSize) {
		this.engSize = engSize;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	public int getManYear() {
		return manYear;
	}

	public void setManYear(int manYear) {
		this.manYear = manYear;
	}

	

}
