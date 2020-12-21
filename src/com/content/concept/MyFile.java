package com.content.concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFile {
	
	File file = new File("/home/opensource/Music/apples.txt");
	
	public void printcontent() throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine())
		System.out.println(scan.nextLine());
		
	}

}
