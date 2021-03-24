package com.callor.apps.service;

import java.util.Random;
//메서드가 짧게 짧게
public class ScoreServiceV2 {

	Random rnd ;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	//배열을 만드는 부분
	//배열과 인스턴스 변수를 생성하는 method
	public void intValue() {
		
		//Random 클래스를 사용하여 rnd 인스턴스(변수) 생성
		rnd = new Random();
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
	}
	//Random클래스를 사용하여 점수 생성후 배열에 저장하는 method
	//점수를 만드는 부분
	
	//Random 클래스를 사용하여 생성된 rnd인스턴스 변수의 
	//nextInt() method를 호출하여 1 ~ 100까지 난수를 만들고
	//각각 점수 배열에 저장
	public void makeScore() {
		for( int i = 0; i < intKor.length; i++) {
			intKor[i] =rnd.nextInt(100)+ 1;
			intEng[i] =rnd.nextInt(100)+ 1;
			intMath[i] =rnd.nextInt(100)+ 1;
		}
	}
	//점수배열에 담긴 값들을 사용하여
	//성적리스트 출력
	public void printScore() {
		
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학");
		System.out.println("---------------------------------------------");
		for(int i = 0 ; i < intKor.length; i++) {
			System.out.printf("%3d\t%3d\t%3d\n", intKor[i],intEng[i],intMath[i]);
		}
	}
}
