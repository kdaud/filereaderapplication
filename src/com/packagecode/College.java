package com.packagecode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class College {
	
	File file = new File("/home/opensource/Documents/sample1.txt");
	
	public void myfilereader() throws FileNotFoundException {
		Scanner scanner=new Scanner(file);
		System.out.println(scanner.nextLine());
		while (scanner.hasNextLine()) {
		
	}
	}
}
