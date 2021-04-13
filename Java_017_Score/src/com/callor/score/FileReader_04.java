package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_04 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) { // txt로 된 파일이면 다 읽을 수 있음
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				System.out.println(reader);
			}
			buffer.close();// 끝난 다음 항상 닫기@!!!!!!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
