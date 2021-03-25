package com.callo.apps;

import com.callo.apps.service.ScoreServiceV1;

public class App_08 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssKor = new ScoreServiceV1();
		ScoreServiceV1 ssEng = new ScoreServiceV1();
		ScoreServiceV1 ssMath = new ScoreServiceV1();
		
		ssKor.makeStd();
		ssEng.makeStd();
		ssMath.makeStd();
		
		ssKor.makeScore();
		ssEng.makeScore();
		ssMath.makeScore();
		
		ssKor.makeSA();
		ssEng.makeSA();
		ssMath.makeSA();
		
		System.out.print("국어 ");
		ssKor.printScore();
		System.out.println("");
		System.out.print("영어 ");
		ssEng.printScore();
		System.out.println("");
		System.out.print("수학 ");
		ssMath.printScore();
	}
}
