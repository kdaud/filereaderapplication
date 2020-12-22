package com.patient.onceptdata;

import java.io.Serializable;
import java.util.Scanner;

public class Patient implements Serializable {
	
	private String patientName;
	private int age;
	
	protected void conceptlab() {
		Scanner scanner= new Scanner(System.in);
		try {
			System.out.println("Enter your GPA: ");
			int gpa=scanner.nextInt();
			System.out.println("CGPA: " + gpa);
		}
		catch (Exception e) {
			System.out.println("Error occured caused by " + e);
		}
	}
	
}
