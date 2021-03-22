package com.callor.controller;

import java.util.Random;

public class Controller_07 {

	public static void main(String[] args) {
		
		//Random rnd : 선언부
		//				Random 클래스를 사용하여 어떤명령을 수행하기 위한 예약
		//= new Random() : 초기화, 생성부
		// 					Random 클래스를 사용하여 선언된 rnd변수를
		//  				사용하기 위한 생성
		Random rnd = new Random(); 
		
		//Random 클래스에서 제공하는 nextInt()명령을 수행하고 
		// 							명령을 수행한 결과를 num 변수에 저장하라
		//==>어떤 임의의 정수를 만들어 num변수에 저장
		int num = rnd.nextInt(); //연산된 결과를 num변수에 저장
		
		//대입 연산자(=) 오른쪽 에 값, 연산식, 변수가 올수 있음
		// 				  왼쪽의 변수에 값, 연산식의 결과를 ,변수에 담긴 값을 저장
		int num1 = 3;
		num1= 3 + 3;
		num1 = num;
		
		//-2^31 ~ (2^31-1)범위에 포함되는
		//임의의 난수를 만들어 num변수에 저장해 달라
		//		난수 : 예측할 수 없는 임의의 숫자들(임의의 값)
		num = rnd.nextInt();
		System.out.println(num);
		
	}
}
