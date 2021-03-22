package com.callor.controller;

public class Controller_01 {

	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		int intNum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				intNum1 += i;
			}

		}
		for (int i = 1; i <= 100; i++) {

			if (i % 4 == 0) {
				intNum2 += i;

			}
		}
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				if (i % 3 == 0) {
					intNum3 += i;

				}
			}
		}
			
		System.out.println("===========================");
		System.out.println("3의 배수의 합 : " + intNum1);
		System.out.println("4의 배수의 합 : " + intNum2);
		System.out.println("3과 5의 배수의 합 : " + intNum3);
		System.out.println("===========================");
	}
}
