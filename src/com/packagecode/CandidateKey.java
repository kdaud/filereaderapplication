package com.packagecode;

import java.util.Scanner;

public class CandidateKey {
	
	Scanner scanner = new Scanner(System.in);
	
	protected void myCaller() {
		System.out.println("Enter your age: ");
		try {
			int age = scanner.nextInt();
			System.out.println("Your are " + age + " years old");
		}
		catch (Exception ex) {
			System.out.println("Put integer value " + ex);
		}
		System.out.println("After Handling Exception");
		
	}
	
	public void myMath() {
		double a = 4;
		double y = 3;
		double myres = a / y;
		System.out.println(myres);
		Short short1=new Short((short) 1);
		System.out.println(short1);
	}

}
