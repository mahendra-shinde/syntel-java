package com.mahendra;

import java.io.*;

public class Demo2 {

	public static void main(String[] args) {
			//Try-With-Resource
		//Class must implement AutoClosable interface
		//FileReader has implemented AutoClosable already!
		try (FileReader file = new FileReader("/home/mahendra/Desktop/data.txt")) {
			
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException ex) {
			System.out.println("Exception occured!");
			System.out.println(ex.getMessage());
		}

	}

}
