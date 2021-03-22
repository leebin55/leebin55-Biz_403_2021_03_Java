package com.callor.controller;

public class Controller_02 {

	public static void main(String[] args) {
		
		/*boolean(boolean)
		 * True, false 2가지 값만
		 * 특별한 형태
		 * 대입연산자(=) 오른쪽의 연산을 수행하여
		 * 		3 ==3 (==: 동등연산자, 일치연산자)
		 * 결과를 bYes변수에 담아라
		 * 
		 * 동등연산자 : 두 값이 같은가??
		 * 		결과 - True 또는 False 
		 */
		boolean bYes =  3 == 3; //True
		
		bYes = 15 % 3 == 0;//True
		
		int intNum = 15;
		//intNum 에 담긴 값이 3의 배수???
		System.out.println(intNum % 3 == 0);
		
		//intNum 에 담긴값이 5의 배수??
		System.out.println(intNum % 5 == 0);
		
		//intNum 에 담긴 값이 3의 배수 이면서
		//			5의 배수 인가??
		//>> %3 == 0 AND  %5 == 0???
		
		//&& : And 관계 연산자
		bYes = intNum % 3 == 0 && intNum % 5 == 0;
		
		intNum = 12;
		
		//intNum 에 담긴 값이 3의 Or 5의 배수???
		//|| : OR 관계 연산자 
		bYes = intNum % 3 == 0 || intNum % 5 == 0;
	
		
		/* 관계연산자
		 * 2가지 이상의 비교연산 (==, <, >, <=, >=, !=)을
		 * 동시에 수행하기 위한 연산
		 */
		
		//and (*)
		//&& true = 1 false = 0
		//곱셈
		bYes = true && true;//true를 1로 보고 false를 0으로 보기
		bYes = true && false;
		bYes = false && true;
		bYes = false && false;
		
		//or (+)
		// || (filter  기호) true=1 false=0
		// 덧셈
		bYes = true || true;
		bYes = true || false;
		bYes = false || true;
		bYes = false || false;
	
	}
}
