package com.callor.apps;

public class App_08 {

	/*
	 * 어떤 정수의 단위 자릿수계산
	 */
	public static void main(String[] args) {
		
		int intNum = 94320589;
		int nCount = 0;
		System.out.printf("정수 %d는 ",intNum);
		
		while (intNum > 0) {
		nCount++;
		intNum/= 10;
		
		}
		System.out.printf("%d 자릿수의 숫자",nCount);
	}
}
