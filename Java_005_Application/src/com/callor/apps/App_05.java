package com.callor.apps;

import java.util.Random;

public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intSum = new int[5];
		int totalSum = 0;
		float floatAvg = 0;
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];//for문밖에 
		//for문안이면 선언도 5번
		
		
		System.out.println("===============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < 5; i++) {
			

			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;

			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

			floatAvg = (float) intSum[i] / 3;

			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", (i + 1), intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg);

		}
		for (int i = 0; i < 5; i++) {

			totalSum += intSum[i];
			floatAvg = (float) totalSum / 3;
		}
		System.out.println("================================================");
		System.out.println("총점 : " + totalSum);

	}
}
