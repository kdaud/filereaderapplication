package com.packagecode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class College {
	
	File file = new File("/home/opensource/Documents/sample2.txt");
	
	public void myfilereader() throws FileNotFoundException {
		Scanner scanner=new Scanner(file);
		
		
		while (scanner.hasNextLine())
			System.out.println(scanner.nextLine());
		

	}
}
