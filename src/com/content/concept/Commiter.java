package com.content.concept;

import java.io.FileNotFoundException;

public class Commiter {
	
	public static void main(String[] args) throws FileNotFoundException {
		new MyFile();
		//myFile.printcontent();
		
		myArray();
	}
	
	public static void myArray() {
		int[] array = { 2, 5, 1, 7 };
		try {
			for (int j = 0; j < 4; j++) {
				System.out.println(array[j]);
			}
		}
		catch (Exception ex) {
			System.out.println(ex);
		
		}
	
   
}
}
