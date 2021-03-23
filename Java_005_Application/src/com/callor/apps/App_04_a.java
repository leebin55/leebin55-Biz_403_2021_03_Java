package com.callor.apps;

import java.util.Random;

public class App_04_a {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intClass =  new int[5];
		int intTotal = 0;
		float floatAvg = 0;
		int pizzaPcs = 6;
		int pizzaBox = 0;
		
		for(int i = 0; i <5 ; i++) {
			intClass[i] = rnd.nextInt(10)+ 50;
			pizzaBox= intClass[i] /6;
			boolean bYes = intClass[i] % pizzaPcs == 0 ;
			if(!bYes) {
				pizzaBox++;
				System.out.println(intClass[i] +"          " +  pizzaBox);
				
			}
		}
		
	}
}
