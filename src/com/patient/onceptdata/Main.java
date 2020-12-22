package com.patient.onceptdata;

import java.io.Serializable;

public class Main {
	
	public static void main(String[] args) {
		Patient patient=new Patient();
		if (patient instanceof Serializable) {
			patient.conceptlab();
		} else {
			System.out.println("Error encountered in the transit");
	}
	}
	
}
