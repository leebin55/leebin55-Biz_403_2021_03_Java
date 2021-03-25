package com.callo.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNum;
	int intSum;
	Random rnd;

	public void makeNum() {
		intNum = new int[100];
	}

	public void makeSum() {
		rnd = new Random();
		intSum = 0;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}

	}

	public void printSum() {
		System.out.println(intSum);
	}
}
