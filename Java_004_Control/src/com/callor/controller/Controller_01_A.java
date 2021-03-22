package com.callor.controller;

public class Controller_01_A {

	public static void main(String[] args) {
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0; // 1 ~ 100
		for (int index = 0; index < 100; index++) {
			int num = index + 1;
			
			if (num % 3 == 0) {
				intSum3+=num;
			}
			if (num % 4 == 0) {
				intSum4 += num;
			}
		}

		// 3의 배수의 합, 4의 배수의 합
		// 합을 구하기 위해
		// 변수를 선언한다.

		for (int index = 0; index < 100; index++) {
			int num = index + 1;
			// num값이 3의 배수이면
			// num값을 intSum3변수에 누적하라
			// 누적하라 : 이전 변수에 담긴 값과 새로운 값을 덧셈하여
			// 다시 그 변수에 저장하라
			if (num % 4 == 0) {
				intSum3 += num;

				/*
				 * else if 여기에서 else if를 사용하면 3의 배수미녀서 4의 배수인경우 3의 배수에는 합산(누적) but 4의
				 * 배수(intSum4)에서 공통배수는 계산 되지 않음
				 */

			}
			if (num % 4 == 0) {
				intSum4 += num;
			}
			/*
			 * 3의 배수이면서 5의 배수 num 3 3 ==0 And num % 5 == 0
			 */

		}
	}

}
