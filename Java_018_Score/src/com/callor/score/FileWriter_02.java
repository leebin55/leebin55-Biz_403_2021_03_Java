package com.callor.score;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_02 {
/*
 * PrintWriter_01 과 결과 가 똑같음 
 * 		>> 그럼 둘의 차이는??
 * 
 * PrintWriter 클래스만으로도 파일에 데이터 기록 가능
 *  >> 그럼왜  FileWriter 를 같이 사용???
 *  
 *  FileWriter 생성자의 두번째 파라메터(매개변수) 때문
 *   	new FileWriter(파일이름,bAppend)
 *   
 *   FileWriter 객체의 두번째 파라메터를 true 로 설정하면
 *   	파일을 Append Mode 로 Open
 *   
 *   두번째 parameter 가 없거나(기본값 false), false 설정
 *      : 기록하고자 하는 파일이 없으면 만듬
 *      : 기록하고자 하는 파일이 있으면 기존 파일을 삭제하고 다시 만듬
 *      
 * 	 두번째 parameter 가 true
 * 		: 기록하고자 하는 파일이 없으면 만듬
 * 		: 기록하고자 하는 파일이 있으면 Append Mode 로 열기
 *  	: 새로운 내용을 print() 하면 기존 내용의 끝에 계속 이어서 기록
 */
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/test1.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			//FileWriter(fileName, true) true 추가
			fileWriter = new FileWriter(fileName,true); 
			out = new PrintWriter(fileWriter);
			
			for(int i = 0; i < 10 ; i++ ) {
				out.printf("%05d\n", i+1);
				
			}
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
