package com.callor.apps;

import java.util.Random;

public class App_02 {

	public static void main(String[] args) {
		
		Random rnd= new Random();
		
		int[] intMembers = new int[5];
		
		//랜덤수를 지정하지 않는다면
		//intMembers[0]=30;
		//intMembers[1] = 25;처럼 인원수 지정
		
		
		//intMembers에 0번째 배열에 ...
		// 난수를 만들어 저장
		intMembers[0] = rnd.nextInt(26) + 25;
		intMembers[1] = rnd.nextInt(26) + 25;
		intMembers[2] = rnd.nextInt(26) + 25;
		intMembers[3] = rnd.nextInt(26) + 25;
		intMembers[4] = rnd.nextInt(26) + 25;//배열의 개수 : 5개
	   //										5 -1 인 4까지
		//		첨자의 최대값 = 배열의 개수 - 1
		
		//위쪽에서 만든 코드 의미 없어짐
		//위의 5줄을 반복문 이용으로 만듬
		for(int i = 0; i < 5 ; i++) {
			intMembers[i] = rnd.nextInt(26)+25;
		}
		for(int i = 0; i < 5 ; i++) {
			//System.out.println("인원수 : " + intMembers[i]);
			System.out.println("=========================");
			System.out.printf(" %d 반 인원수 : %d\n", i+1,intMembers[i]);
		}
		for(int i = 0; i < 5 ; i ++) {
			
			int pizzaBox = intMembers[i] /6;
			if(intMembers[i] % (pizzaBox * 6)> 0) {
				pizzaBox++;
			}
			System.out.printf("%d 인원수 : %d, 피자주문 : %d\n",(i+1),intMembers[i],pizzaBox);
		}
	}
}
