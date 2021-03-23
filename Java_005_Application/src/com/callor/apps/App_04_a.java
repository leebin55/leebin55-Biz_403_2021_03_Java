package com.callor.apps;

import java.util.Random;

public class App_04_a {

	/*
	 * 다섯학급의 학생들에게 피자 간식을 지급
	 * 학급의 인원은 50 에서 59사이
	 * 학급인원은 Random클래스 이용
	 * 피자는 1박스에 6조가
	 * 주문리스트 출력
	 */
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		
		//5학급의 인원수를 저장할 배열
		int[] intClass =  new int[5];
		
		
		int pizzaPcs = 6;
		
		for(int i = 0; i <5 ; i++) {
			
			//( 0~ (n-1) + @@
			//@@ : 시작값을 지정하는 형태
			int members = rnd.nextInt(10) + 50;
			intClass[i] = members;
			
			
		}
		
		//학급별 주문수량을 계산한느 부분과
		//리스트를 출력하는 부분을 분리
		//1. 계산된 주문수량을 담아둘 장소 생성
		// 2. 저장된 주문수량을 사용하여 출력
		
		//학급별 주문수량을 계산하여 저장할 배열
		int[] intOrders = new int[5];
		
		for(int i = 0; i < 5; i++) {
			int order = intClass[i] / pizzaPcs;
			//인우너수 대비 피자 조각수를 비교하여 부족할 경우 1박스 추가
			if(intClass[i] % (order * pizzaPcs)>0)
				order++;
		
		intOrders[i] = order;
		}
		System.out.println("피자 주문서");
		System.out.println("========================================");
		System.out.println("순번\t인원\tBox\t조각");
		
		int intTotalOrder = 0;
		for(int i = 0; i < 5 ; i++) {
			System.out.printf((i+1)+ "\t");
			System.out.printf(intClass[i]+ "\t");
			System.out.printf(intOrders[i]+ "\t");
			System.out.println(intOrders[i] * pizzaPcs);
			intTotalOrder += intOrders[i];
			
		}
		System.out.println("=========================================");
		System.out.printf("전체 주문 Box 수량 : %d\n",intTotalOrder);
		System.out.println("=========================================");
	}
}
