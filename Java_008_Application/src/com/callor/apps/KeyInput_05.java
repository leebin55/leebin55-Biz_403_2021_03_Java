package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println(LinesService.dLines(40));
		System.out.println("정수를 입력하세요");
		System.out.print(">>  ");
		num = scan.nextInt();
		System.out.println(num);
		System.out.println(LinesService.dLines(40));
		
		if(num % 2 == 0) {
			System.out.println("입력한 정수 " + num + "은 짝수 입니다.");
		}else {
			System.out.printf("입력한 정수 %d 는 짝수가 아닙니다.\n", num);
		}
		
		boolean bYes = false;
		
		for(int i =2 ; i <num ; i++) { //num =2 일때 연산이 어떻게 진행???
			/* num = 2 일때
			 * i < num 이므로 
			 * 조건이 성립되지 않음
			 * bYes가 if 문을 통해true로 바뀌지 않음
			 * else에서 진행
			 */
			if(num % i == 0) {
				bYes = true;
				break;
			}
		}
		
		if(bYes) {
			System.out.printf("입력한 정수 %d 는 소수가 아닙니다.", num);
		}else {
			System.out.printf("입력한 정수 %d 는 소수입니다.\n", num);
		}
		
		
		
		/*for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
				System.out.printf("입력한 정수 %d 는 소수가 아닙니다.", num);
				break;
			}
				System.out.printf("입력한 정수 %d 는 소수입니다.", num);
			
		}                 => 소수일때 "소수입니다." 2번씩 출력*/
	
		System.out.println(LinesService.dLines(40));
		
	}
}
