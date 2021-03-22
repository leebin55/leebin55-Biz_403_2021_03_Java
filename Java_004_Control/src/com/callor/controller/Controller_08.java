package com.callor.controller;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] args) {

		Random rnd = new Random();
		// 어떤 명령을 5번 반복하여 수행하겠다.
		for (int i = 0; i < 5; i++) {
			
			//난수 (임의의 정수)를 만들어서 num변수에 저장하고
			int num =rnd.nextInt(); //-2^31 ~ (2^31 -1)
			//그 값을 출력 
			System.out.println(num);
		}
		
		System.out.println("===========================");
		
		for(int i = 0; i < 5; i++) {
			int num = rnd.nextInt(100);//0 ~ 99의 정수
								 	   // 0 ~ (100 -1)
									   //0 ~ (< 100)
			System.out.println(num);//값이 두자리 이하인 값 출력
		}
		System.out.println("==========================");
		for(int i = 0 ; i < 5 ; i++) {
			int num = rnd.nextInt(10);// 0 ~(10 -1) 중에서 임의의 수를 생성ㅋ
			System.out.println(num);
		}
	}
}
