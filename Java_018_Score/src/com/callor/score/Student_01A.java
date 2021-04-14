package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01A {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/Student.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		System.out.println("이름" + "\t" + "주소");
		System.out.println("=".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)break;
				String[] student = reader.split(":");
				System.out.println(student[1]+ "\t" + student[5]);
				
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=".repeat(50));
	}
}
