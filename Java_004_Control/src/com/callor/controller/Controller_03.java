package com.callor.controller;

public class Controller_03 {

	public static void main(String[] args) {
		
		int intNum1 = 30; 
		int intNum2 = 40;
		
		
		//intNum1이 20 보다 크고 50보다 작나??
		//50> intNum1>20 (이렇게 사용불가)
		//true AND true
		boolean bYes = intNum1 > 20 && intNum1 < 50; //true
		//true OR false
		bYes = intNum1 > 20 || intNum1 > 50; //true
		
		//true AND false
		bYes = 50 > 20 && 20 > 50;
		
		
		
	}
}
