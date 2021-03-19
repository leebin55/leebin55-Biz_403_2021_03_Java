package com.callor.controller;

public class Variable_01 {

	public static void main(String[] args) {
		int intNum = 4 ;
		System.out.println(intNum %2);
		System.out.println(intNum % 2 == 0);
		System.out.println(intNum % 2 == 0 ? "0" : "0아님"); //'?'는 제한이 있다
		
		int intResult = intNum % 2 ;
		boolean bYes = (intNum % 2) == 0;// boolean이란값은 true false만 담을 수 있음
		Boolean bYes1 = 3 == 3; //3이 3하고 같냐? 참이면 bYes1dp 참이 담김
	
		/*
		 * boolean 블린값(형)
		 * true, false : 키워드이면서 하나의 값
		 * 값 : 연산된 결과
		 */
		boolean bYes2 = true;
		bYes2 = false;
	
		//비교연산자
		//어떤 값들이 같은지, 크기가 어떠한지를 판단하는 연산
		// 결과는 true, false 두가지만존재
		
		bYes = 3 > 3; //false
		bYes = 3 >= 3; //true
		bYes = 3 < 3;
		bYes = 3 <= 3;
		bYes =3 == 3 ;
		
		
		//어떤 조건이 true일때만 코드를 실행
		//
		if( bYes ) { //(조건)이 true일때 실행 (단, 반복X)
			//bYes에 담긴 값이 true 일때 실행할코드들
			System.out.println("bYes 는 true");
		}
	}
}
