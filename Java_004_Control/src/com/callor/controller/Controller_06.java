package com.callor.controller;

import java.util.Random;

//JDK 에 수많으 도구들이 포함 되어 있음
// JDK에 있는 필요한 도구들을 사용하여 
//프로젝트 만들수 있음
// JDK에 있는 모든 도구를 포함하면 프로젝트가 너무 거대해 질 것임
//이러한 문제를 방지하기위해
//Java에서 기본적인 도구 외엔느 파일로 제공하고
//필요에 따라 import하여 사용할 수 있음.

//import java.uril.Random;
//지금부터 Controller_06클래스에서 java.util 패키지으 Random이라는
//도구를 사용하여 코딩하겠다 라는 성언

/*
 * eclipse에서 도구를 사용하기 위해서 import하고자 할때
 * Ctrl Shift O
 * 
 * 코드의 모양 정렬
 * Ctrl Shift F
 */
public class Controller_06 {

	public static void main(String[] args) {
		
		/*프로젝트에서 JDK의 클래스(도구)를 사용하는 방법
		 * ==> 변수를 선언하고 초기화 하는것과 유사
		 * 
		 *  	int 키워드는 정수형 변수 선언
		 *  	Integer 키워드는 정수형 변수 선언 (원래는 키워드가 아니고 class)
		 *  
		 *  *키워드는 java가 처음 탄생될때부터 만들어진 '명령어'
		 *  *class: 키워드처럼 사용 but, java가 탄생하고 이후에 필요에 따라
		 *  			추가,확장된 명령
		 *
		 */
		
		
		Random rnd = null; //Random 변수선언
		rnd = new Random(); //초기화
		
		Random rnd1 =new Random();
		int num1 = 0;			//int 첫글자 소문자 keyword
		Integer num2 =0;		//class는 첫글자 대문자 Integer, Random, String은 클래스
								//class 초기화할때
		Integer num3 = new Integer(0);
		
		String str1 = "";//String 은 선언하고 초기화할대
		str1= "홍길동";
		
		String str2 = null;
		str2 = "이몽룡";
		String str3 = new String();
		
		/* wrapper클래스( 클래스이지만 변수선언처럼 사용할수 있는 도구들)
		 * 		   > Integer, Long, Float, Double, Boolean,Charactor
		 * 
		 * 			 int	,long, float, double, boolean char 키워드에
		 * 			확장된 기능을 할 수 있도록 만들어진 class
		 * 			
		 * 기본 기능은 값을 저장하는 변수를 선언
		 * 기본기능에 별도로 확장된 추가명령을 수행할 수 있도록 
		 * 만들어진 도구들
		 */
		
		
	}
}
