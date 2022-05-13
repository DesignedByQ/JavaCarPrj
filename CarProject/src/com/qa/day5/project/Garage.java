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
	
	public Vehicle getVehicle(int index) {
		return orderList.get(index);
	}
	
	
//	public void printAll() {
//		for(int i = 0; i < orderList.size(); i++) {
//			System.out.println(orderList.get(i));
//		}
//	}
	
	
//	
//	public static String updateOrder(int index, String order) {
//		return orders.set(index, order);
//	}
//	
//	public static String getOneOrder(int index) {
//		return orders.get(index);
//	}
//	
//	
//	
//	public static boolean clearOrders() {
//		orders.clear();
//		return true;
//	}
//	
	
	
	
	
	
	
}
