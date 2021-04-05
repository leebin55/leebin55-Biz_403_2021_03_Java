package com.callor.method;

public class Number_01 {

	public static void main(String[] args) {
	
		//문자열형 숫자
		String strNum1 = " 100";
		String strNum2 = "100.0";
		
		System.out.println(strNum1 + strNum2);//덧셈연산 안됨 >> 문자열 연결 연산
		
		//strNum1 ,strNum2에 저장된값으로 사칙연산
		//사칙연산 가능한 type 으로 변환시켜야!!
		
		/*
		 * Integer 클래스에 정의된 valueOf() static method를 호출하여 
		 * 문자열형 숫자를 정수형 값으로 변환
		 * intNum  에 그 값을 저장
		 * 
		 * static method : 
		 * 		클래스를 객체로 생성하지 않고도 호출가능
		 * 		단, 함수방식으로 호출불가 > 클래스.method()  형식으로!!!
		 */
		Integer intNum = Integer.valueOf(strNum1);
		Float floatNum = Float.valueOf(strNum2);
		System.out.printf(" %d + %f = %f\n",intNum,floatNum, intNum + floatNum);
		System.out.printf(" %d - %f = %f\n",intNum,floatNum, intNum - floatNum);
		System.out.printf(" %d * %f = %f\n",intNum,floatNum, intNum * floatNum);
		System.out.printf(" %d / %f = %f\n",intNum,floatNum, intNum / floatNum);
		
	}
}
