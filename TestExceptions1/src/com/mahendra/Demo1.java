package com.mahendra;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) {

		FileReader file = null;
		try {
			file = new FileReader("/home/mahendra/Desktop/data.txt");
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException ex) {
			System.out.println("Exception occured!");
			System.out.println(ex.getMessage());
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
