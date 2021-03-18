package com.callor.var;

/*
 *  1.정수형 변수 num1, num2 를 선언 >>int
 *  2. 각 33과 55를 저장하다
 *  
 *   3. 각 변수에 담긴 값을 사칙연산을 수행하고
 *   		sum, minus, times, div
 */
public class Variable_01 {
	public static void main(String[] args) {
		//integer
		//정수값을 저장할 기억장치를 예약하고 그 곳에 num1, num2 이름 (별명)을 불여라
		//정수형 변수 num1, num2를 선언하고 각각 변수에
		// 정수 33, 정수 55를 저장한다
		//num1, num2변수는 사용할 준비가 된다 >>num1, num2변수가 초기화 되었다
		//									  >> num1, num2 변수가 생성 되었다
		int num1; 
		int num2;
		
		
		num1 = 33;
		num2 = 55;
		int sum = num1 + num2;
		int minus = num2 - num1;
		int times = num1 * num2;
		int div = num2 / num1;
		
		
		System.out.println("===============================");
		System.out.printf("%d + %d = %d\n", num1, num2,sum);
		System.out.printf("%d - %d = %d\n", num2, num1, minus);
		System.out.printf("%d x %d = %d\n", num1, num2, times);
		System.out.printf("%d / %d = %d\n", num2, num1, div);
		System.out.println("===============================");
		
		
	}

}
