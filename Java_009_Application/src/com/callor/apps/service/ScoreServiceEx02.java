package com.callor.apps.service;
//private 메서드 연습
import java.util.Scanner;

public class ScoreServiceEx02 {

	Scanner scan;
	public ScoreServiceEx02() {
		scan = new Scanner(System.in);
	}
	
	
	public void makeScore() {
		System.out.println("국어점수를 입력하세요");
		System.out.print(">>");
		Integer kor = this.inputScore();//this 여기에 라는비슷하....
		System.out.println("영어점수를 입력하세요");
		System.out.print(">>");
		Integer eng = this.inputScore();
		System.out.println("수학점수를 입력하세요");
		System.out.print(">>");
		Integer math = this.inputScore();
	}
	private Integer inputScore() {
		Integer score = 0;
		
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			score= scan.nextInt();
			if(score<0 || score>100) {
				System.out.println("오류 : 입력범위가 아닙니다.(0 ~ 100)");
				 continue;//while문으로 다시 돌아감 
			}break;//break 쓰는 순간 inputScore()에 오류 표시
			//return 값; 필요
		
		}return score;	//score에 저장된값을 호출한 곳으로  return!!
	}
}
