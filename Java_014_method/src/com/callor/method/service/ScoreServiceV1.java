package com.callor.method.service;

public class ScoreServiceV1 {

	InputServiceV1 inSer;
	
	public ScoreServiceV1() {
		
		inSer = new InputServiceV1();
		
	
	}
	public void inputScore() {
		Integer retNum = inSer.inputValue("국어", 0, 100);
		if(retNum == null) {
			System.out.println("종료");
		}else {	
			System.out.println("점수 : " + retNum);
		}
	}
}
