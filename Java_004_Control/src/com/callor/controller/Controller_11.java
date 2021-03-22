package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] args) {
			
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) { //5번 for 문 반복
			//int i = 0 모든 컴퓨터 시작하는 값은 0이다
			int num = rnd.nextInt(100) + 1;
			//(= int rndNum = rnd.nextInt(100);
			//						num = rndNum +1;)
			//rnd.nextInt(n)=>>무조건 0부터!!!!!~ (n-1)까지!!!!
			//나중에 ''이 값을 사용''하기 위해 
			// int num이라는 변수에 담음
			if (num % 3 == 0) {
				System.out.println(num + "는(은) 3의 배수");
			} else {
				System.out.println(num + "는(은) 3의 배수아님");
			}
		}
	}
}
