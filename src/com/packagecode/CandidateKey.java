package com.packagecode;

import java.util.Scanner;

public class CandidateKey {
	
	Scanner scanner = new Scanner(System.in);
	
	protected void myCaller() {
		System.out.println("Enter your age: ");
		
		int age = scanner.nextInt();
		System.out.println("Your are " + age + " years old");
	}

}
