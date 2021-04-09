package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FileWriter_01 {

	public static void main(String[] args) {
		
		//메모리에 저장된 데이터를 console에 출력할때
		System.out.println("출력");
		
		//키보드로 부터 데이터를 입력받기 위해서
		Scanner scan = new Scanner(System.in);
		//scan.nextLine();
		
		//임의의 숫자를 만들기 위해
		Random rnd = new Random();
		rnd.nextInt(100);
		
		//파일에 저장하기
		// 1. 어디에 어떤 파일로 저장할까
		String fileName = "src/com/callor/app/mydata.txt";
		
		// 2. 무엇을 사용하여??
		// 두개의 객체를 "선언"!! > 생성아직 안함
		
		FileWriter fileWriter = null;
		PrintWriter out = null; //이 두개의 클래스가 협력해서 사용
		
		//3. 파일에 데이터를 기록하기 위하여 파일을 열어라
		//      == 새로운 파일을 생성
		//      == 만약 이미 있으면 지우고 다시 만들어라
		try {
			fileWriter = new FileWriter(fileName); //try -catch 의무적
			out = new PrintWriter(fileWriter); // 데이터를 저장해줌
			
			out.println("대한민국만세");
			out.printf("%d x %d = %d\n", 3 ,4, 3*4);
			out.println("우리나라 만세"); 
			//FileWriter.PrintWriter.println
			
			out.flush();
			out.close();
			System.out.println("저장완료");
			//주기억장치에 데이터를 보조기억장치에 저장
			// 하지만 주기억장치는 빠르지만 보조기억장치는 느림
			//그래서 임시보관장치에 내보냄?
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
