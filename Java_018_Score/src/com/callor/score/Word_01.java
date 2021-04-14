package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/Word.txt";
		
		FileReader fileReader= null;
		BufferedReader buffer = null;
		System.out.println("=".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				
					String reader = buffer.readLine();
					if(reader == null)break;
					String[] words = reader.split(":");
					System.out.println(words[0]+"\t" + words[1]);
				
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName + "이름의 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
