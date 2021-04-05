package com.callor.method;

import java.util.Scanner;

public class method_04 {

	public static void main(String[] args) {
		/*
		 * 숫자와 문자를 동시에 입력받음 (0 ~ 100 or QUIT)
		 * 
		 * 다른 type 의 데이터를 동시취급 >> 기본type을 String 형으로 설정하는 것이 편함 문자로 입력받아 숫자로 변환
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" 0 ~ 100 까지 중 정수 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(" >>  ");
		String strNum = scan.nextLine();// 모든 입력을 문자열 type
		// 입력받은 문자열을 strNum에 저장
		// int num = scan.nextInt();
		if (strNum.equals("QUIT")) {
			System.out.println("종료");
		} else {
			// QUIT가 아닌 다른 값이 입력
			// >> 입력된 값을 정수형으로 변환
			// >> 변환된 정수 값을 변수에 저장
			int intNum1 = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			System.out.println("입력된 정수 : " + intNum2);
		}

	}
}
