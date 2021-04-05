package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1A {

	Random rnd;
	Integer intNum;
	
	public NumberServiceV1A() {
		rnd = new Random();
		intNum = 0;
	}
	public void corTimes() {
		System.out.println("3의 배수 ");
		Integer num =inputNum();
		if(num == null) {
		System.out.println("3의 배수가 아님");
		
		}else {
			System.out.println(num);
		}
		
	}
	
	public Integer inputNum() {
		intNum= rnd.nextInt(100)+1;
		if(intNum % 3 == 0) {
			return intNum;
		}else {
			return null;
		}
		
	}
}
