package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2A {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(" 0 ~ 100 까지 정수 입력   (입력취소 : QUIT)");
			System.out.print(" >>  ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			Integer intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println();
				System.out.println("정수만 입력하세요");
				System.out.println();
				continue;
			}
			if (intNum < 0 || 100 < intNum) {
				System.out.println();
				System.out.println("범위 입력오류 : 0 에서 100 까지만");
				System.out.println();
				continue;
			}

			return intNum;
		}

	}
}
