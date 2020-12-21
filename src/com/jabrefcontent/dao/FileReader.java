package com.jabrefcontent.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	
	File file = new File("/home/opensource/Desktop/kdaud.txt");
	

	//String string = "";
	
	

	public void myfilereader() throws IOException {
		Scanner scanner=new Scanner(file);
		System.out.println(scanner.nextLine());
		System.out.println("************************************");
		
		String filecontent="";
		while (scanner.hasNextLine()) {
			filecontent = filecontent.concat(scanner.nextLine() + "\n");
			//System.out.println(scanner.nextLine());
			
		}
		FileWriter writer = new FileWriter("/home/opensource/Desktop/software.txt");
		writer.write(filecontent);
		writer.close();
	}
	
}
