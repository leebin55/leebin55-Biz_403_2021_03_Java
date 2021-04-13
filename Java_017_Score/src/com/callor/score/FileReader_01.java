package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		
		FileReader fileReader= null;
		
		try {
			fileReader = new FileReader(fileName);
			/*
			 * read() method를 실행하면 어떤 값을 읽어서 
			 * 		int형의 데이터를 return
			 * 
			 * 현재 열린 파일에서 1byte ㄹ르 읽어서 
			 * 		ASCII코드로 return 하는 method
			 */
			int result = fileReader.read();
			//FileReader 가 열어놓은 파일에서 1byte ㄹ르 읽어서
			//FileReader 에 read() >> int값을 return
			// 정수값이 해당하는 ASCII코드를 갖는 문자로 바꿔서 보여달라
			System.out.printf("%c",result);
			
			fileReader.close();
		}catch (FileNotFoundException e) {
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
