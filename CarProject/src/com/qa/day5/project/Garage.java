package com.qa.day5.project;

import java.util.ArrayList;

public class Garage {

	
	ArrayList<Vehicle> orderList = new ArrayList<>();
	
	public boolean addVehicle(Vehicle model) {
		return orderList.add(model);		
	}
	
	public Vehicle removeVehicle(int index) {
		return orderList.remove(index);
	}
	
	public float fixTheVehicle(int ind) {
		return orderList.get(ind).fixVehicle();
	}
	
	public ArrayList<Vehicle> getVehicles() {
		return orderList;
	}
	
	public void showAll() {
		for(int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i));
		}
	}
	
	public Vehicle getVehicle(int index) {
		return orderList.get(index);
	}
	
	public boolean clearVehicles() {
		orderList.clear();
		return true;
	}
	
	public Vehicle updateVehicle(int index, Vehicle model) {
		return orderList.set(index, model);
	}
	
	
}
