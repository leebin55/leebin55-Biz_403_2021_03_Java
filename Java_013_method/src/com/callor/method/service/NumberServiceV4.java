package com.callor.method.service;

//코드의 흐름!!

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(" 0 ~ 100 까지 정수 입력");
			System.out.println("QUIT 입력중단");
			System.out.print(" >>  ");
			String strInput = scan.nextLine();
			Integer intNum = null; // while 안쪽에 intNum 선언
			if (strInput.trim().equals("QUIT")) {
				return null; //return null 로 중단

			} else { 

				try {
					intNum = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("Number Only");
					// 입력하는 곳으로 다시 돌아가라
					continue; // while 문으로 jump
				}
			}//end if "QUIT" 숫자만 정상입력
			if (intNum < 0 || intNum > 100) {
				System.out.println("Out of range");
				System.out.println("0 ~ 100");
				continue;
			}
			return intNum;

		}
	}
}
