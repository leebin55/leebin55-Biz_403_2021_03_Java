package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceEx05 {

	Scanner scan;
	String[] strSub;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	public ScoreServiceEx05(int members) {
		scan = new Scanner(System.in);
		strSub = new String[] { "국어", "영어", "수학" };
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}

	public void makeScores() {

	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + "과목의 점수를 입력하세요(Quit : -1)");
			System.out.print(">>");
			score = scan.nextInt();
			if (score == -1) {
				return -1;
			}
			if (score < 0 || score > 100) {
				System.out.println("입력범위 오류 0~100");
				continue;
			}
			break;

		}
		return score;
	}
}
