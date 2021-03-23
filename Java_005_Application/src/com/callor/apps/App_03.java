package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int intSum = 0;
		float floatAvg = 0;
		int[] intScores = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			intScores[i] = rnd.nextInt(51) + 50;
			intSum += intScores[i];
			
		}
		floatAvg = (float) intSum / 10;
		//for문 밖에서 이용
		//효율 생각하기!!
		System.out.println("===========================");
		System.out.printf("총점 : %d\t , 평균%3.2f\n", intSum, floatAvg);
		System.out.println("===========================");
		
	}
}
