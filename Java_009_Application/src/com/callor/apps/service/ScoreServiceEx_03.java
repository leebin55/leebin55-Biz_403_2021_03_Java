package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceEx_03 {
	String[] strSub;
	int[] intKor;
	int[] intMath;
	int[] intEng;

	Scanner scan;

	public ScoreServiceEx_03(int members) {
		scan = new Scanner(System.in);
		strSub = new String[] { "국어", "영어", "수학" };
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}

	public void makeScores() {
		for(int i = 0; i < strSub.length; i++) {
			Integer score = this.inputScore(strSub[i]);
		}
	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + "과목의 점수를 입력하세요 ");
			System.out.print(">>");
			score = scan.nextInt();
			if(score<0 || score>100) {
				System.out.println("오류 : 점수범위를 벗어났습니다.(0 ~ 100)");
				continue;
			}break;
			
		}
		return score;
	}

}
