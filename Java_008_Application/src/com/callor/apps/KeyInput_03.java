package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("사칙연산 수행");
		System.out.println("");
		System.out.println("아래 정수 두개를 입력하고 Enter");
		System.out.println(LinesService.dLines(30));
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		System.out.println(LinesService.dLines(30));
		
		System.out.printf(" %d + %d = %d\n ",num1, num2,(num1 + num2));
		System.out.printf("%d - %d = %d\n ",num1, num2,(num1 - num2));
		System.out.printf("%d x %d = %d\n ",num1, num2,(num1 * num2));
		System.out.printf("%d / %d = %3.2f\n ",num1, num2,(float)num1 / num2);
		//printf("")안에 "%"쓸수 없다.!!!
		System.out.println(num1 + " % " + num2 + " = " + (num1/num2));//% 기호 쓰고 싶으면
		
		System.out.println(LinesService.dLines(30));
	}
}
