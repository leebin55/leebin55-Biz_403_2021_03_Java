package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3A {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		Integer intNum = 0; 
		while (true) {
			System.out.println("1 ~ 100 까지의 정수만 입력 (입력종료 : QUIT)");
			System.out.print(" >>  ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println();
					System.out.println("정수만 입력");
					continue;
					// e.printStackTrace();
				}
				if (intNum < 0 || 100 < intNum) {
					System.out.println(" 0에서 100까지만 입력");
					continue;
				}
				return intNum;

			}
		}
	}

}
