package com.callor.app.service;

import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	InputService isV1;

	public ScoreServiceV1() {
		isV1 = new InputServiceImplV1();
	}

	public void printScore() {
		while(true) {
			
		Integer intKor = isV1.inputValue("국어", 0, 100);
		if(intKor== null) {
			break;
		}
		Integer intEng = isV1.inputValue("영어", 0, 100);
		if(intEng== null) {
			break;
		}
		Integer intMath = isV1.inputValue("수학", 0, 100);
		if(intMath == null) {
			break;
		}
		int sum = intKor + intEng + intMath;
		float avg = (float) sum / 3;
		
		System.out.println();
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		System.out.printf("%d\t%d\t%d\t%d\t%3.2f\n",intKor,intEng,intMath,sum,avg);
		System.out.println();
		}
	}
}
