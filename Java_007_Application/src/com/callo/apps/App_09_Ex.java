package com.callo.apps;

import com.callo.apps.service.ScoreServiceEx;

public class App_09_Ex {

	public static void main(String[] args) {
		
		ScoreServiceEx ssE1 = new ScoreServiceEx();
		ssE1.makeScore();
		ssE1.makeTotal();
		ssE1.makeArray();
		ssE1.printScore();
		
	}
}
