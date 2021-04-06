package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {

	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		//두개의 매개변수를 갖는 addNum() method에게 
		//정수 31과 29를 전달
		//그 결과를 retNum 변수에 저장
		Integer retNum = nsV1.addNum(31, 29);
		if(retNum == null) {
			System.out.println("Not Even");
		}else {
			System.out.println(retNum +" is Even");
		}
		
	
		Float retNum1 = nsV1.addNum(30.2f, 33.2f);
		//실수 뒤에 f를 쓰지 않으면 오류 > 더블형 실수가되기 때문
		//Integer retNum1 = nsV1.addNum(30.2f, 33.2f); > Type Mismatch
		//return type : float 를 Integer에 담을 수 없음
		//			  : return 되는 결과값을 저장하는 변수(retNum1) 도 만드시 float 또는 Float형 이어야 함!!

		//NullPointerException 발생
		//float retNum2 = nsV1.addNum(30.2f, 33.2f);   >   exception 발생
		/* 
		 * 변수를 선언하는 방식
		 * 
		 *  primitive방식 : 숫자값만 저장
		 *  
		 *  wrapper class 방식 : 숫자값 + null값
		 *  		java 나 DB(Date Base) 와 연동되는 프로젝트 구현할때는 null 이라는 값 항상 인식
		 *  		어떤 결과가 null을 갖게되는 경우 >> primitive방식에서는 취급 불가
		 *  
		 *  
		 *  
		 */

		/*
		 * 객체지향 특징 중 "다형성" (method의 중복선언)
		 * 다형성
		 * 같은 이름의 method 를 갖더라도
		 * type에 따라 java는 "자동으로" 매개변수 형식과 일치하는 method 를 찾아 연결
		 */
		//public Integer addNum(int num1, int num2) 호출
		nsV1.addNum(30, 40);
		//public Float addNum(float num1, float num) 호출
		nsV1.addNum(30.0f, 40.0f);
	}
}
