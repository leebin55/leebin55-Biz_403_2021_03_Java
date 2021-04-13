package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/sample_score.txt";
		/*
		 * FileReader 
		 * 
		 * 파일을 읽기위해서 open 하는 클래스
		 * OS에게 파일을 읽을 수 있도록 허락해달라고 요청
		 * 
		 */
		FileReader fileReader = null;
		/* 
		 * BufferedReader
		 * 
		 * FileReader가 open해 놓은 파일에서
		 * 데이터를 읽어 buffer라고 하는 "임시 기억장소에 저장"
		 */
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			/*
			 * 파일에 저장된 데이터의 라인 수 를 알때 : for 이용해 가능
			 * 
			 * 알 수 없을때??? while(true) 의 무한반복 이용
			 * 
			 * BufferdReader.readLine() method를 실행하면
			 * buffer에 저장된 데이터를 한 라인씩 읽어서
			 * String 데이터로 return
			 * 
			 * 만약 readLin() method를 데이터 개수만큼 반복하면 모든 데이터 읽기 가능
			 *  
			 *  하지만 이밥벙은  데이터 갯수 알아야만가능
			 *  
			 *  데이터의 개수를 정확히 알 수 없을때 >> 무한반복이용
			 *  but 중간에 탈출구를 고민해야 함
			 *  마찬가지로 readLine()탈출 할 수 있는 방법을 알려주느느데
			 *  
			 *  만약 더이상 읽을 데이터가 없을때는 readLin() 이  null 값 return
			 */
			//for(int i = 0; i < 30 ;i++) { 30줄 모든 데이터 읽음 
			while(true) {
				//but 몇줄인지 모르면???
				String str = buffer.readLine(); //String 형으로 반환
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			//}
			//String str = buffer.readLine(); //String 형으로 반환
			//System.out.println(str);
			//System.out.println(buffer.readLine());
			//System.out.println(buffer.readLine());
			//System.out.println(buffer.readLine());
			//buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
