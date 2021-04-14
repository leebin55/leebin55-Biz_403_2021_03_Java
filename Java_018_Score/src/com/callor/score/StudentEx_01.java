package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/Student.txt";
		System.out.println("=".repeat(50));
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer =new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)break;
				
				String[] students = reader.split(":");
				System.out.println(students[1] +"\t"+ students[5]);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=".repeat(50));
	}
}
