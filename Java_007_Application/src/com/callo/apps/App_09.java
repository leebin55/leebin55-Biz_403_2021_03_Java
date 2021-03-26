package com.callo.apps;

import com.callo.apps.service.ScoreServiceV2;

public class App_09 {
	
	public static void main(String[] args) {
		
		//public ScoreSeviceV1()
		//Public ScoreServiceV2( int members)
		// 5 는 ssV2객체를 만들때 생성자에게 전달(보내는) 값
		
		
		ScoreServiceV2 ssV2 = new ScoreServiceV2(5);
		ssV2.makeScore();
		ssV2.makeSA();
		ssV2.printScore();
	}

	
}
