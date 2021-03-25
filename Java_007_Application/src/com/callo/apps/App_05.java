package com.callo.apps;

import com.callo.apps.service.EvenServiceV1;

public class App_05 {

	public static void main(String[] args) {
		
		EvenServiceV1 eV1 = new EvenServiceV1();
		eV1.makeNum();
		eV1.makeSum();
		eV1.printSum();
		
	}
}
