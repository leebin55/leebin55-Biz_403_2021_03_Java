package com.callo.apps.service;

import java.util.Random;
//생성자안에 괄호안에 변수선언 int members
public class ScoreServiceV2 {
	int[] intSum;
	float[]floatAvg;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	public void makeNum() {
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

	}

	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(101);
			intEng[i] = rnd.nextInt(101);
			intMath[i] = rnd.nextInt(101);
			
		}
	}
	
	public void makeSA() {
		for(int i = 0; i <intKor.length ;i++ ) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
			floatAvg[i] = (float)intSum[i] /3;
		}
	}
	public void printScore() {

		System.out.println("============================================");
		System.out.println("빛나라 고교 성적리스트");
		System.out.println("--------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------");
		for(int i = 0; i < intKor.length ; i++) {
			System.out.printf("%3d\t",intKor);
			System.out.printf("%3d\t",intEng);
			System.out.printf("%3d\t",intMath);
			System.out.printf("%3d\t",intSum);
			System.out.printf("%3d\t",intKor);
		}
	}

}
