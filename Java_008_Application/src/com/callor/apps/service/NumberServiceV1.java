package com.callor.apps.service;

import java.util.Scanner;

public class NumberServiceV1 {

	int intNum = 0;// =0; >>생성자 필요없어짐
	Scanner scan;
	public NumberServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public void inputNum() {
		System.out.println("정수 1개를 입력합니다.");
		System.out.print(" >>  ");
		intNum = scan.nextInt();
		
		
		//main() method가 아닌 곳에서 Scanner  사용하는 경우
		//
		//사용이 끝나면 close() 사용!!!!
		//이제는 Scanner 사용이 끝났으니 Resource(자원)을 반남
		// 만약 close() 하지 않으면 다른 충돌이 일어날수 있다.
		
	}
	public void checkEven() {
		
		System.out.println(LinesService.dLines(50));
		if(intNum % 2 == 0) {
			System.out.printf("입력한 정수 %d 는 짝수 \n",intNum);
		}else {
			System.out.printf("입력한 정수 %d 는 짝수가 아님 \n",intNum);
		}
	}
	
	public void checkPrime() {
		System.out.println(LinesService.dLines(50));
		int num = 0;
		for(num = 2 ; num <intNum ; num++ ) {
			if( intNum % 2 == 0) {
				break;
				
			}
		}
		if(num < intNum) {
			System.out.printf("입력한 정수 %d 는 소수가 아님 \n",intNum);
		}else {
			System.out.printf("입력한 정수 %d 는 소수 \n",intNum);
		}
	}
	
}
