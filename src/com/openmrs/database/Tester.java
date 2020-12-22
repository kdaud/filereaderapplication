package com.openmrs.database;


public class Tester {
	
	public static void main(String[] args) {
		new Animal();
		Cow cow = new Cow();
		
		//		if (animal instanceof Mamal) {
		//			animal.eat();
		//		} else {
		//			System.out.println("You lack permision");
		//		}
		
		if (cow instanceof Mamal) {
			cow.myCalf();
		} else {
			System.out.println("No Permision");
		}
	}
}
