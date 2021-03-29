package com.callor.apps;

import com.callor.apps.service.ScoreServiceEx02;
import com.callor.apps.service.ScoreServiceEx04;
import com.callor.apps.service.ScoreServiceEx_03;

public class SS_Ex_001 {

	public static void main(String[] args) {
		
		//ScoreServiceEx02 ssE2 = new ScoreServiceEx02();
		
		//ssE2.makeScore();
		
		//ScoreServiceEx_03 ssE3 = new ScoreServiceEx_03(8);
		
		//ssE3.makeScores();
		
		ScoreServiceEx04 ssE4 = new ScoreServiceEx04(3);
		ssE4.makeScore();
	}
}
