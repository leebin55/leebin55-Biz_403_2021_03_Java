package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_05 {

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
				//System.out.println(reader); // score파일이 ":"을 기준으로 나누어져 있음
				/* 
				 * 문자열.split("기준문자열")
				 * 문자열에 저장된 값을 기준문자열로 나누어
				 * 문자열 배열로 만들어주는 method
				 */
				String[] scores = reader.split(":");
				
				System.out.printf("학번 : %s\t국어 : %s\t영어 : %s\t수학 : %s\n ",
						scores[0],scores[1],scores[2],scores[3]);
				int intKor =Integer.valueOf(scores[1]);
				int intEng =Integer.valueOf(scores[2]);
				int intMath =Integer.valueOf(scores[3]);
				
				int sum = intKor + intEng + intMath;
				
				
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
