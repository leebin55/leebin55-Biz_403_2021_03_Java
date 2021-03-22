package com.callor.controller;

import java.util.Random;

public class Controller_09 {

	public static void main(String[] args) {

		/*
		 * 0 ~ 100 까지 난수 (임의숫자)를 생성하고 그 수가 짝수인가 판별하라
		 * 
		 */
		Random rnd = new Random();
		
		//nextInt(n) 0~ (n - 1)의 숫자까지
		
		int num = rnd.nextInt(100);//nextInt()라는 명령어를 쓰기위해 Random
		if (num % 2 == 0) {
			System.out.println(num + "는 짝수");//실제로 println만 명령어
												//System 이라는 클래스 중에 out.
												//에서 println명령어
		} else {
			System.out.println(num + "는 짝수아님");
		}

	}
}
