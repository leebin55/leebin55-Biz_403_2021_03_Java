package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] intNum = new int[5];
		int intSum = 0;
		
		System.out.println("정수 다섯개를 입력하세요");
		
		for (int i = 0;i < intNum.length ;i++) {
			System.out.print("정수"+ (i+1) + "  :   ");
			intNum[i] = scan.nextInt();
			intSum += intNum[i];
		}
		System.out.println(LinesService.dLines(50));
		System.out.println("정수들의 리스트");
		System.out.println(LinesService.sLines(50));
		System.out.println("");
		for(int i = 0; i < intNum.length ; i++) {
			
			System.out.println(intNum[i]);
		
		}
		System.out.println("");
		System.out.println(LinesService.dLines(50));
		System.out.println("정수들의 합 : " + intSum);
		
	}
}
