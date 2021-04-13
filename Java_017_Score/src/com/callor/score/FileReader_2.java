package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_2 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/sample_score.txt";

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(fileName);

			//for (int i = 0; i < 20; i++) {
				/*
				 * read() method는 
				 * fileReader 로 열린 파일에서
				 * 한 byte씩 데이터를 읽어서
				 * ASCII코드 값으로 return
				 */
			//	int result = fileReader.read();
			//	System.out.printf("%c", result);
			//}
			for (;;) {
				
				int result = fileReader.read();
				System.out.printf("%c", result);
			}
			//: Code point = 0xffffffff
			/*
			 * 
			 */

			//fileReader.close();
		} catch (FileNotFoundException e) {

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
