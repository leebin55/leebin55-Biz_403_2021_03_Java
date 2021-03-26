package com.callor.apps;

import java.util.Scanner;

/* 
 * 실제 App을 사용하여 업무를 수행할때는
 * 데이터 (값)을 키보드로 입력하고 
 * 입력된 데이터를 변수(배열)에 저장을 하고
 * 변수에 저장된 데이터를 연산수행하는 코드가 대부분
 */
public class KeyInput_01 {

	
	public static void main(String[] args) {
		
		System.out.println("Hello Korea");// ""안의 문자열을 print
		//JDK에 있는 out이라는 객체한테 보내고
		//그 out은 System 이라는 클래스에 보냄
		//코드로 작성한 어떤 연산결과를 콘솔에 출력해달라는 명령??
		
		
		/*
		 * 1. 키보드에서 데이터를 입력받기 위하여
		 * 		Scanner클래스를 사용하여 객체 생성
		 */
		//객체를 선언하고,
		Scanner scan = null;//입력장치 - 키보드
						//Scanner + ctrl + shift + o ;
						//java.util.Scanner >>객체선언
		
		//객페를 생성(초기화)하여 인스턴스로 만들어라
		//사용할 준비를 하라
		scan = new Scanner(System.in); //
		
		//객체를 선언 및 생성하고 사용할 준비를 하라
		Scanner scan1 = new Scanner(System.in); //실제로는 객체가 두개지만 하나밖에 연결안됨
		/*
		 * 2.Scanner 객체(Scanner클래스를 사용하여 만든 객체)
		 * 		 를 사용하여
		 * 		키보드로 부터 무언가를 입력을 받도록 대기
		 * 
		 * 		가. scan.nextInt()명령이 실행되면 App은 멈취었는 것 처럼 보임
		 *  	나. ==> 코드흐름이 Blocking되었다.(실제로는 내부에서 무한반복되고 있음)
		 *     다. 정수값을 입력을 하고 Enter 를 누를때까지
		 *     마냥 Blocking 상태로 대기함
		 *     
		 *     라. 정수를 입력하고 Enter 를 누르면
		 *     		입력한 정수값만 num변수에 저장
		 *     
		 */		
		int num = scan.nextInt();//()안에 숫자 없이 사용
						//키보드로부터 무언가를 입력하기를 기다림 
						//다음으로 코드가 진행이 안됨
		System.out.println("키보드로 입력한 값 : " + num);
	}
}
