package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 99;
		
		int total = 홍길동.getTotal();//총점을 return
		System.out.println("홍길동 총점 : " + total);
		
		//정보의 은밀 ( 멤버변수를 private으로 선언)
		//멤버변수의 값이 원치않게 변경되는 것을 방지
		//홍길동.total = 900;//=> total과 avg가 public이면 평균 과 총점값이 누구든 접근가능해서 
		//결과가 엉뚱하게 나올수 있음
		// 연결연산자를 통해 total멤버변수 값을 직접 저장 불가
		//=> total 접근제어자 : private이기 때문
		System.out.println("홍길동 평균 : " + 홍길동.getAvg());//getAvg평균을 return
		
		/* 
		 * getter method
		 * 메서드 이름 지을때
		 * "get*()" method는 private으로 선언된 멤버변수의 값을 읽을 때 사용하는
		 * method선언 접두사
		 */
		
		System.out.println(홍길동.getClass());//class com.callor.apps.model.ScoreVO
		//이러한 클래스로 부터 만들어졌음을 보여줌
		//현재 홍길동이라는 객체가 썻던 클래스가 누구인가 보여줌
		
		//객체지향 특징
		//추상화 상속 캡슐화(내부에서 어떻게 작동되는지 모르지만 어찌고 저지고)
		//정보의은닉 메소드재정의
	}
}
