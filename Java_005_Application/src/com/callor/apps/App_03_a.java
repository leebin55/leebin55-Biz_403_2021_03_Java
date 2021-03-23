package com.callor.apps;

import java.util.Random;

public class App_03_a {
	/*
	 * 정수배열 intScores 10개 선언 Random 클래스로 50 부터 100까지 정수를 들어 intScores에 저장
	 * 
	 * intScores의 점수으 총점, 평균
	 * 
	 */
	public static void main(String[] args) {

		int[] intScores = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51) + 50;

		}
		int intTotal = 0;
		float floatAvg = 0;

		for (int i = 0; i < 10; i++) {
			intTotal += intScores[i];
			//floatAvg = (float) intTotal / 10;
			// 평균을 총점과 같이 for()반복문에서 계산을 
			//반복하면 효율을 떨어뜨린다.
		}
		floatAvg = (float) intTotal / 10;
		//for문 밖에서 계산하기
		
		System.out.printf("총점 : %d\t, 평균 : %.2f\n", intTotal, floatAvg);
		
	}

}
