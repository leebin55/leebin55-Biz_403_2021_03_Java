package com.callor.method.service;

//작동은 하지만 아직 부족.. V4로
import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(" 0 ~ 100 까지 정수 입력");
			System.out.println("QUIT 입력중단");
			System.out.print(" >>  ");
			String strInput = scan.nextLine();

			if (strInput.trim().equals("QUIT")) {
				return null;

			} else {

				/*
				 * 1. 입력된 값이 QUIT 가 아니면 일단 정수로 바꿈
				 */
				try {
					Integer intNum = Integer.valueOf(strInput);
					if (intNum < 0 || intNum > 100) {
						System.out.println("Out of range");
						System.out.println("0 ~ 100");
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					System.out.println("Number Only");
					// 입력하는 곳으로 다시 돌아가라
					continue;
				}
			}
		}
	}
}
