package com.callor.controller;

public class Score_ex {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng =77;
		int intMath =60;
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
	}
}
