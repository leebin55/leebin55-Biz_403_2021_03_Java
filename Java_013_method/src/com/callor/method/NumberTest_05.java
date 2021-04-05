package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.NumberServiceV5A;

public class NumberTest_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		NumberServiceV5A nsV5 = new NumberServiceV5A();
		String[] strPro = new String[] { "AA", "BB", "CC" };
		Integer retNum = 0;
		for (int i = 0; i < strPro.length; i++) {
			retNum = nsV5.inputNum(strPro[i]);
			if (retNum == null) {
				System.out.println("종료");
				break;
			}
			System.out.println(strPro[i] + " : " + retNum);
		}
		System.out.println("===============================================");
		String[] strName = new String[5];
		Integer intNum = 0;
		for (int i = 0; i < strName.length; i++) {
			System.out.println("이름을 입력하세요 ");
			System.out.print(" >> ");
			strName[i] = scan.nextLine();

			intNum = nsV5.inputNum(strName[i]);
			if (intNum == null) {
				System.out.println("종료");
				break;
			}
			System.out.println(strName[i] + " : " + intNum);

		}
	}
}
