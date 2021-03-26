package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;
import com.callor.apps.service.NumberServiceV1;

public class KeyInput_06 {
	
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		Scanner scan = new Scanner(System.in);
		
		while(true) { //scanner 라는 것은 한개만 사용하기 때문에 오류 일으킬수 있음
			//오류날때 NumberServiceV1에서 생성자 생성해서
			//Scanner초기화 하고
			//밑에Scanner선언한거랑 close지움 
			System.out.println(LinesService.dLines(50));
			System.out.println("넘버체크!!!");
			System.out.println(LinesService.sLines(50));
		nsV1.inputNum();
		nsV1.checkEven();
		nsV1.checkPrime();
		
		System.out.println(LinesService.dLines(50));
		System.out.print("계속할까요?? (Yes : 1 , No : 0 ");
		
		int yesNo = scan.nextInt();
		if(yesNo == 0) {
			break;
		}
		}
		System.out.println("");
		System.out.println("Game Over!!");
	}
}
