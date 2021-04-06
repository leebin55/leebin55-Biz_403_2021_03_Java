package com.callor.method.service;

import java.util.Scanner;

public class InputServiceV1A {

	Scanner scan;
	public InputServiceV1A() {

		scan =new Scanner(System.in);
	}
	public Integer inputValue(String title) {
	
		
	
		System.out.println("============================================");
		System.out.println(title + "값을 입력하세요");
		System.out.print(">>  ");
		String strNum = scan.nextLine();
		Integer intNum = null;
		if(strNum.trim().equals("QUIT")) {
			return null;
		}
		try {
			intNum = Integer.valueOf(strNum);
		} catch (NumberFormatException e) {

		System.out.println("정수 입력");
		}
		return intNum;
	}
	
	public Integer inputNum(String title) {
		
		System.out.println("============================================");
		System.out.println(title + "값을 입력하세요");
		System.out.print(">>  ");
		String strNum = scan.nextLine();
		Integer intNum = null;
		if(!strNum.trim().equals("QUIT")) {
			try {
				intNum = Integer.valueOf(strNum);
				
			} catch (NumberFormatException e) {
				System.out.println("정수와 QUIT만 입력");
			
			}
		
		}
		return intNum;
	}
	
}
