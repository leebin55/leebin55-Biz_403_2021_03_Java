package com.callor.apps;

import java.util.Random;

public class App_001_a {

	public static void main(String[] args) {
		
		/*
		 * rnd.nextInt() ==> 그냥 사용하면
		 * 					-2^31~2^31 -1 중의 수중 랜덤
		 * 
		 * 
		 * 25명에서 50명 인원이 있는 각 반에 
		 * pizza 간식을 지급하려고 한다.
		 * 각 반의 학생들이 최소 한 조각씩 지급하려고 한다.
		 * 학생수보다 부족하거나 6조각 이상 남지 않도록 
		 * 주문할때 몇판을 주문해야 하는가
		 */
		
		Random rnd = new Random();
		int intMembers = 0;
		int pizzaBox = 0;
		int pizzaPcs = 6;
		
		intMembers =rnd.nextInt(26)+25;
		//25부터 50의 수중에서 1개를 만들어라
		pizzaBox = intMembers / pizzaPcs; 
		//필요한 박스 수와 같거나 1작은 값이 만들어짐
		
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) ==0;
		if (bYes == false) //if (!bYes) 
		{
			pizzaBox++;
			
		}
		
		
		System.out.println("--------------------------");
		System.out.println("인원수 :" + intMembers);
		System.out.println("피자판수 : " + pizzaBox);
		System.out.println("전체조각 : "+ pizzaBox * pizzaPcs);
		System.out.println("-------------------------");
	}
}
