package com.qa.day5.project;

public class VehicleRunner {
	
	public static void main(String[] args) {
		
		
		//Objects
		//Parameters required - String engTypeP, float engSizeP, String vehTypeP, int manYearP, boolean existingMOT, int lastServiced
		Vehicle1 LexusRX300 = new Vehicle1("diesel", 1.6f, "SUV", 2001, false, 2017);
		Vehicle2 CamrySE = new Vehicle2("petrol", 1.2f, "salon", 2005, true, 2020);
		//Vehicle3  = new Vehicle2("petrol", 1.2f, "salon", 2005, true, 2020);
		
		//Run
		System.out.println(LexusRX300.fixVehicle());
		System.out.println(CamrySE.fixVehicle());
	
	}

}
