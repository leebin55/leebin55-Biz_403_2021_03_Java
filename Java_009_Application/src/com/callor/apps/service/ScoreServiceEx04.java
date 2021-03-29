package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceEx04 {
	Scanner sc;
	String[] strSub;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	public ScoreServiceEx04(int members) {
		sc = new Scanner(System.in);
		strSub = new String[] { "국어", "영어", "수학" };
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];

	}
	public void makeScore() {
		for(int i = 0; i <intKor.length;i++) {
			intKor[i] = this.inputScore(strSub[0]);
			intEng[i] = this.inputScore(strSub[1]);
			intMath[i] = this.inputScore(strSub[2]);
			
		}
		
	}
	private Integer inputScore(String sub) {
		Integer score = 0;
		while(true) {
			System.out.println(sub + "과목의 점수를 입력하세요");
			System.out.print(">>");
			score = sc.nextInt();
			if(score<0|| score>100) {
				System.out.println("입력 범위를 벗어났습니다. ( 0 ~ 100)");
				continue;
				
			}break;
		}return score;
	}
		
}
