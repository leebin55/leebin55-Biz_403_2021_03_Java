package com.callor.apps.service;

public class TimeServiceV1 {
	// int intNums[];
	int[] intNums;
//	int intTimes;

	public TimeServiceV1() { // 생성자
		intNums = new int[8];
		// intTimes = 0; 굳이 안만들어도
	}
	/* 
	 * 배열은총 8개
	 * 배열에 저장할 값은 2~~???
	 * 
	 */

	public void makeTimes() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
			

		}

	}

	public void printNums() {

		
		for (int i = 0; i < intNums.length; i++) {
		System.out.println("================================");
		System.out.printf("%d단\n", intNums[i]);
		System.out.println("--------------------------------");
			for (int j = 0; j < 8; j++) {
				System.out.printf("%d X %d = %d\n", intNums[i], j + 2, intNums[i] * (j + 2));
			}
		}
	}
}
