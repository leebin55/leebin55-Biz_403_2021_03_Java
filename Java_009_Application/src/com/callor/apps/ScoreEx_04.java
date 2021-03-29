package com.callor.apps;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.callor.apps.model.ScoreVO;
import com.callor.apps.service.ScoreServiceV2;
import com.callor.apps.service.ScoreServiceV5;

/* 
 * 객체 == 변수 (객체는 변수다 XXXX)
 * - 객체와 변수는 선언, 생성, 사용방법이 매우 유사
 * - 객체가 만들어진다 == 기억장치 어딘가에 저장소가 만들어짐
 * - 객체 연결연산자 (점 연산자)가 있음
 * - 객체 자체만으로는 어떤역할을 수행하지 않음
 *  	다만. method에 매개변수로 전달할 때는 거의 변수와 같이 사용
 */
public class ScoreEx_04 {

	public static void main(String[] args) {

		// 객체 이름짓기
		// 클래스 이름의 첫글자를 소문자로 하여 그대로 사용

		ScoreVO scoreVO = new ScoreVO();
		ScoreServiceV5 scoreServiceV5 = new ScoreServiceV5(6);
		ScoreServiceV2 scoreServiceV2 = new ScoreServiceV2();
		ScoreServiceV2 sServiceV2 = new ScoreServiceV2();

		Scanner scanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		Random random = new Random();
		Random rnd = new Random();

		ScoreServiceV2 ssV2 = new ScoreServiceV2();

		/*
		 * 기본 변수 선언 키워드(primitive variable keyword) int, long, double, float, boolean,
		 * char
		 * 
		 * 기본 변수와 사용법이 같은 클래스 wrapper class : 기본 변수를 감싸고 기능을 확장한다라는 뜻 Integer, Long,
		 * Double, Float, Boolean, Character
		 * 
		 */
		int num = 30;
		// num 뒤에 .찍으면 int형은 안나옴
		Integer num1 = 30; // 이 두개는 똑같은 정수형 변수
		// Integer 라고 선언하면 변수이면서 객체
		// num1. 하면 점연산자를 통해서 사용가능 한 method 나옴
		float f1 = num1.floatValue();// Integer 라는 클래스에 floatValue라는 메서드가 있음
		// 변수에 리턴값을 저장할 수 있음
		/*
		 * public float floatValue() { return (float)value; } > 정수값을 float값으로 바꾸는
		 */

		float numF = (float) num;
		Float numF1 = (float) num;

		long longF = 0L;
		Long longF1 = 0L;

		double douN = 0;
		Double douN1 = 0.0;

		boolean bYes = true;
		Boolean bYesB = true;

		char char1 = 'A';
		Character char2 = 'B';

		String str1 = "대한민국"; // String은 기본변수가 없음

		Integer numInt = 30;
		String str2 = numInt.toString(); // 문자형 변수에 정수형을 저장하는 법
		str2 = numInt + ""; // 문자형으로 변환하는 코드 > 자바스러운 코드 아님
		// 두개는 하는일은 비슷 똑같진느 않음
		// 숫자 >> 문자열

		str2 = "12345";
		str1 = "99999";

		System.out.println(str1 + str2);// 9999912345

		Integer n1 = Integer.valueOf(str1);// Integer.ValueOf() str1변수에 담겨 있는 문자열형 변수를
		// 정수로
		Integer n2 = Integer.valueOf(str2);// 클래스.method >클래스를 객체로 만들지 않고 점을 찍고 바로 호출
											// static이라는 메서드도 포함
		System.out.println(n1 + n2);// 112344

		Float fn1 = Float.valueOf(str1);// valueOf() 안에 들어있는 값을 자기 자신과 일치하는 형으로 바꿈
		Float fn2 = Float.valueOf(str2);
		System.out.println(fn1 + fn2);

		fn1 = Float.valueOf(n1);
		n1 = Integer.valueOf(str2);

		str1 = "대한민국";
		System.out.println(str1.length());

		// " "로 묶인 문자열은 그 자체로 문자열형 객체가 된다.
		System.out.println("우리나라만세".length());// 문자열이 작성되는 순간 객체로 만들어짐
		// 원래 원칙은 밑에 두줄
		String strNation = new String("우리나라만세");
		System.out.println(strNation.length());

		System.out.println(Arrays.toString("Republic of Korea".split("")));
		// 문자열이 배열로 나뉘어서 보여줌
		// 변수에 담지않고 매게변수에 직접 전달
		// method에 method가 계속 겹치는 상태

		/*
		 * method를 호출하여 return한 결과를 
		 * 또다른 method에 매개변수로 전달하는 코드의 예 
		 */
		System.out.println(Integer.valueOf("30") + Integer.valueOf("40"));//문자열 삼십을
		//변수를 사용하지 않고 method에 method를 겹쳐서 사용가능 > 거의 사용하지않음 
		//한번만 사용할때, test용으로 

	}
}
