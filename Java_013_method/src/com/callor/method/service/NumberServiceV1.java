package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	/*
	 * Random 수를 생성하여 3의 배수이면 그수를 return 아니면 null 을 return ==> 반드시 어떤 값을 return!!
	 * 
	 * 대표값으로 어떤 type 의 값을 return 할 것인가 생성한 수가 1 ~ 100 까지 정수형 난수 3의 배수이면서 정수인 값
	 * return 정수형 3의 배수 return
	 * 
	 * return type을 void 가 아닌 정수형 type으로!! int / Integer >> null 값을 return 해야하기 때문에
	 * Integer int 형은 null 값 사용할 수 없음(정수값만 return)
	 * 
	 * 
	 * void method에서 return 할 값이 없어도 되는 경우
	 * 
	 * void 대신 Integer 사용 하면 반드시 return 값(대상); 이 있어야!!!
	 */
	Random rnd;

	public NumberServiceV1() {
		rnd = new Random();
	}

	/*
	 * 처음 method만들고 나면 return 할 값이 없기 때문에 오류 반드시 return 값; 이필요 우선 return null;로 해줌
	 * 
	 * primitive type중에 숫자형 인 경우는 0을 wrapper클래스 type을 사용하는 경우는 null 보통 사용
	 */
	public Integer inputNum() {// 정수형 3의 배수 or null 값 return
		Random rnd = new Random();

		Integer num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;

		if (num1 % 3 == 0) {
			return num1;
			// }else {
			// return null; 이코드는 있으나 없으나 똑같음
		
	}
		
		if (num2 % 3 == 0) {
			/*
			 * 현재 return type : Integer
			 * num2 : int형
			 * 별다른 문제를 일으키지는 않지만 실제 코드가 작동 될때는
			 * int형을 Integer wrapper 클래스 형으로 변환하는 과정이 일어남
			 */
			return num2; 
		}
		return null;
	}
}
