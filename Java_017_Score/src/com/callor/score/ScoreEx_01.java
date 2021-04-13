package com.callor.score;

import com.callor.score.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.println(scoreVO.toString()); 
		//NullPointerException
		//ScoreVO 클래스에 kor, eng, math 타입은 Integer >> 클래서
		//클래스 선언만 하고 생성하지 않음 
	}
}
