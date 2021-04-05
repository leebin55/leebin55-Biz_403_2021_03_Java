package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5A {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(title + " 값을 입력하세요(0 ~ 100)");
			System.out.print(">>  ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수만 입력");
					System.out.println(" 다시 ");
					continue;
					// e.printStackTrace();
				}
				if (intNum < 0 || 100 < intNum) {
					System.out.println(" 범위입력 오류 : 0 ~ 100");
					continue;
				}
				return intNum;
			}
		}
	}
}
