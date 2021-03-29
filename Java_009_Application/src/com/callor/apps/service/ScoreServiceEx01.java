package com.callor.apps.service;

import java.util.Scanner;
/* 
 * 연습
 * 
 */
public class ScoreServiceEx01 {

	Scanner scan;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	public ScoreServiceEx01(int members) {
		scan = new Scanner(System.in);
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}

	public void makeScore() {
		System.out.println("각 학생의 과목점수를 입력");
		while (true) {
			for (int i = 0; i < intKor.length; i++) {
				System.out.print("국어점수를 입력 : ");
				intKor[i] = scan.nextInt();
				if (intKor[i] < 0 || intKor[i] > 100) {
					System.out.println("0 ~ 100 사이의 점수를 입력하세요");
					continue;
				}

			}
			break;

		}

	}

	private Integer inputScore() {
		return null;
	}
}
