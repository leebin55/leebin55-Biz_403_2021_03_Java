package com.callor.controller;

public class Controller_04 {

	public static void main(String[] args) {
		
		/*
		 * 1 - 100 까지 숫자중
		 * 1. 3의 배수의 합
		 * 2. 4의 배수의 합
		 * 5. 3과 5의 공통배수
		 * 
		 */
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		
		for (int i = 0; i < 100 ; i++) {
			int num = i + 1;
			if (num % 3 ==0) {
				intSum3 += num;
			}
			if (num % 4 == 0) {
				intSum4 += num;
			}
			if(num %3 == 0 && num % 5 == 0) {
				intSum5 += num;
			}
		}
	
		System.out.println("3의 배수의 합 : " + intSum3);
		System.out.println("4의 배수의 합 : " + intSum4);
		System.out.println("3과 5의 배수의 합 : " + intSum5);
	
	
	}
}
