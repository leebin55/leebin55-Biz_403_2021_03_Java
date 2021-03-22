package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor = rnd.nextInt(100) + 1;
		int intEng = rnd.nextInt(100) + 1;
		int intMath = rnd.nextInt(100) + 1;
		 
		int intSum = 0;
		float floatAvg = 0;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		floatAvg = (float)intSum /3 ;
		
		System.out.println("==================================");
		System.out.println("국어: " + intKor);
		System.out.println("영어: " + intEng);
		System.out.println("수학: " + intMath);
		System.out.println("-----------------------------------");
		System.out.printf("총점 : %d\t, 평균: %3.2f\n",intSum, floatAvg);
		System.out.println("===================================");
		
		
	}
}
