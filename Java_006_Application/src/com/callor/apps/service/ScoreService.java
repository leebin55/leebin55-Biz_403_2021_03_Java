package com.callor.apps.service;

import java.util.Random;

public class ScoreService {

	/*
	 * main()메서드가 없는 클래스 >> 혼자서는 아무것도 실행할수 없다
	 * 사용하려면 어딘가에 있는 메인메서드내에서 사용
	 * 
	 */

	// 클래스 영역에 선언마!!된 배열과 변수
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intTotal;
	float[] floatAvg;
	Random rnd = null;

	// 임의로 makeScore라는 이름으로 선언한 메서드
	// makeScore() method(메서드)
	// 클래스 영역에 선언된 배열과 변수를 초기화
	public void makeScore() {

		rnd = new Random();
		intKor = new int[10];
		intMath = new int[intKor.length];
		intEng = new int[intKor.length];
		intKor = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];

		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}
	}// makeScosr()영역, end makeScore()
	
	public void printScore() {
		System.out.println("빛나리 고교 성적 리스트");
		System.out.println("==========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		for(int i = 0; i <intKor.length; i++) {
			System.out.printf("%3d\t",intKor[i]);
			System.out.printf("%3d\t",intEng[i]);
			System.out.printf("%3d\t",intMath[i]);
			
			System.out.printf("%3d\t",intTotal[i]);
			System.out.printf("%3.2f\n",floatAvg[i]);
		}
		System.out.println("===============================================");
		
	}
}
