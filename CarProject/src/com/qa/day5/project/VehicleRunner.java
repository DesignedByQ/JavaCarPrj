package com.qa.day5.project;

public class VehicleRunner {
	
	public static void main(String[] args) {
		
		
		//Objects
		//Parameters required - String engTypeP, float engSizeP, String vehTypeP, int manYearP, boolean existingMOT, int lastServiced
		Vehicle1 LexusRX300 = new Vehicle1("diesel", 2.2f, "SUV", 2001, false, 2017);
		Vehicle2 CamrySE = new Vehicle2("petrol", 1.6f, "salon", 2005, true, 2020);
		Vehicle3 Peugot106 = new Vehicle3("electric", 1.2f, "hatchback", 2013, false, 2022);
		
		Garage quikfit = new Garage();
		
		//Run
//		System.out.println(LexusRX300.fixVehicle());
//		System.out.println(CamrySE.fixVehicle());
//		System.out.println(Peugot106.fixVehicle());
		
		//quikfit.fixing();
		
		//System.out.println(quikfit.addVehicle(Peugot106));
		quikfit.addVehicle(Peugot106);
		quikfit.addVehicle(CamrySE);
		
		//quikfit.removeVehicle(1);
		//System.out.println(quikfit.getVehicles());
		
		System.out.println(quikfit.fixTheVehicle(1));
		
		quikfit.showAll();
		
		quikfit.updateVehicle(0, LexusRX300);
		
		quikfit.showAll();
		
		System.out.println(quikfit.clearVehicles());
		
		System.out.println(quikfit.getVehicles());
	
	}

}
