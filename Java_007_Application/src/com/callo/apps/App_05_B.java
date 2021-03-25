package com.callo.apps;

import com.callo.apps.service.EvenServiceV1_B;

public class App_05_B {
	
	public static void main(String[] args) {
		
		EvenServiceV1_B esV1 = new EvenServiceV1_B();
		esV1.makeNums();
		esV1.printEven();
		esV1.sumEven();
	}

}
