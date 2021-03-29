package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_02 {
	
	/*
	 *  ScorVO 클래스를 디자인하고 클래스를 사용하여 객체를 생성한 후 사용하기
	 *  
	 */
	public static void main(String[] args) {
		
		//객체이름을 "홍길동"으로 하여 "객체 생성"
		ScoreVO 홍길동 = new ScoreVO();
		
		//객체.멤버변수 : .(dot) - 점 연결연산자, 객체연결연산자,
		//클래스(객체) 선언된 변수나, method 에 접근하기 위한 연산자
		홍길동.name = "홍길동";//홍길동 객체에 name이라는 멤버변수 저장
		
		홍길동.kor = 90;
		홍길동.eng = 88;
		홍길동.math = 77;//세 변수의 값을 저장해두고
		
		//객체.method()
		//		객체 연결연산자를 통해서 getTotal() method를 호출(실행)하고
		//		return된 결과를 total 변수에 담아라
		int total = 홍길동.getTotal();
		float avg = 홍길동.getAvg();// 값을 가져오기
		
		ScoreVO 이몽룡 = new ScoreVO();
		이몽룡.kor = 88;
		이몽룡.eng = 77;
		이몽룡.math = 99;
		
		total = 이몽룡.getTotal();
		avg = 이몽룡.getAvg(); //객체를 선언해서 사용하면 변수를 잘못써도 쉽게 발견 가능
		
		//객체지향 장점
		//객체 연결연산자를 통하여 멤버변수나 method에 접근을 하면
		//오타등으로 발생하는 오류르르 최소화 할 수 있음
		//코딩의 자동완성 기능 활용가능
	}
}
