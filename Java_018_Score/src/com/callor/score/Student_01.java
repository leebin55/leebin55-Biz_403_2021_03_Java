package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {
		
		/*
		 * 선언하는 코드와 생성하는 코드 분리하자
		 * FileWriter, FileReader  : 파일 열기
		 * PrintWriter, BufferedReader : 내용을 쓰거나 읽음
		 */
		FileReader fileReader= null;
		BufferedReader buffer = null;
		
		String fileName = "src/com/callor/score/Student.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			/*
			 * ==========================================================
			 * while(true)반복문의 사용
			 * 
			 * -  조건없이 무한 반복
			 * -  반복 수행하는 과정에서 if()조건문 추가
			 * 		반복을 중단
			 * -  무한반복에 조건을 부여하여 탈출구를 만들때 쉽게 구현 할 수 있음
			 * 장점 : 다양한 방법의 다양한 조건의 탈출구를 필요할때 적절하게 구현다능
			 * 단점 : if() 조건문 필요
			 * 		: 때로는 추가 코드 필요
			 *		: 무한반복코드가 실행되는 동안 탈출구 어떻게 만들지 고민
			 */
		//	while(true) {
		//	String reader = buffer.readLine();
		//	if(reader == null)break;
			//파일의 끝에 다다르면 EOF(End of File) 이 되면
			//reader는 null이 담ㅣ게 됨
			// ==파일이 끝나면 더이상 읽지 마라
			//
		//	System.out.println(reader);
		//	}
			/*
			 * =============================================================
			 * while(조건식) 무한반복문
			 * 
			 *  -  무한반복코드가 중단되는 조건이 한개만 있을 경우
			 *  -  조건식을 어떻게 만들것인가 잘 구상해야함
			 *  -  while(조건) 이 "시작전" 조건이 true가 되도록 (아니면 do while 문 이용)
			 *  -  반복문 탈출 : 코드내에서 조건식이 false가 되도록 연산
			 *  -  코드내 조건이 false가 되더라도 이후의 명령들이 한 번씩 실행 되고 탈출
			 *    
			 */
			String reader = new String(); //최초에는 true (처음에는 null값이 아님)
			//즉 문자열 변수 reader 를 null이 아닌값으로 생성
			//조건문을 실행하기 전해 
			// reader = buffer.readLine() 을 실행하고
			// reader 저장된 값이 null 인지 비교 >> 위에 String reader = new Stirng코드 의미 없어짐
			// reader 에 저장된 값을 마치 method가 return 하는 것처럼 동작
			// () return 하는 값이 null 이 아닌 가 비교
			// 그 결과가 true : 코드 진행
			// false :  즉시 while 명령이 끝
			while((reader =buffer.readLine())!= null) {
				//최초에 while() 문에서 reader != null은 true
				//reader = buffer.readLine();//처음에 null이 아니기 때문에 처음에 while문에진입해
				//한줄을 읽음
				//System.out.println(reader); // null값이 찍힘
				
				/* 
				 * students 배열은
				 * 자동으로 분해된 문자열 개수만큼 생성 , 각 요소에 값이 저장됨
				 * 
				 */
				String[] students = reader.split(":");
				System.out.printf("%s\t%s\n",students[1],students[5]);
			}
			//=========================================================================
			System.out.println("=".repeat(50));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(fileName + "파일이 없습니다.");
		} catch (IOException e) {
			// TODO 파일을 읽어들일때 문제 발생 String reader = buffer.readLine()
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		
	}
}
