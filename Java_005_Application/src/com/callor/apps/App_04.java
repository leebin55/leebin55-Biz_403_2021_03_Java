package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {
		Random rnd = new Random();

		int[] intClass = new int[5];
		int pizzaBox = 0;
		int intTotal = 0;

		System.out.println("==================================================");
		System.out.println("반       인원수       피자주문         전체조각수");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			intClass[i] = rnd.nextInt(10) + 50;
			if (intClass[i] % 6 == 0) {
				pizzaBox = intClass[i] / 6;
			} else {
				pizzaBox = (intClass[i] / 6) + 1;
			}
			intTotal += pizzaBox;
			System.out.printf("%d\t   %d\t\t %d\t\t %d\n", (i+1),intClass[i], pizzaBox, pizzaBox * 6);
		}
		
		System.out.println("=================================================");
		System.out.println("전체주문 Box 수량 : " + intTotal + "판");

	}
}
