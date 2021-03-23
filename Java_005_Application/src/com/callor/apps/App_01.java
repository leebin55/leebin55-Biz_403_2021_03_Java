package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intMembers = rnd.nextInt(26) + 25;
		int intPan = 0;
		int intPrice = rnd.nextInt(10000) + 10000;
		int intTotal = 0;
		int intA = 0;
		
		
		if (intMembers % 6 == 0) {
			intPan = intMembers / 6;
		} else {
			intPan = (intMembers / 6) + 1;
		}
		
		intTotal = intPan * intPrice;
		intA = intTotal / intMembers;

		System.out.println("학생수 : " + intMembers + "명");
		System.out.println("판수 : " + intPan + "판");
		System.out.println("===========================");
		System.out.printf(" 피자 값 : %d 원\n ", intPrice);
		System.out.printf("총 금액 : %d 원\n", intTotal);
		System.out.println(" 1인당 낼 금액 :" + intA + "원");

	}
}
