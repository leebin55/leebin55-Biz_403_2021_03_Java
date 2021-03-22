package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		/*int intSum = 0;
		float floatAvg = 0;
		
		System.out.println("======================================");
		for (int i =0 ; i <10 ; i++) {
			int num = rnd.nextInt(100)+1;
			intSum += num;
			floatAvg = (float)intSum/10;
			System.out.printf("학생 %d:    %d\n",i+1,num);
		}
		System.out.println("----------------------------------");
		System.out.printf("총점 : %d\t , 평균: %3.2f\n",intSum,floatAvg);
		System.out.println("==================================");*/
		
		int num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		int num3 = rnd.nextInt(100)+1;
		int num4 = rnd.nextInt(100)+1;
		int num5 = rnd.nextInt(100)+1;
		int num6 = rnd.nextInt(100)+1;
		int num7 = rnd.nextInt(100)+1;
		int num8 = rnd.nextInt(100)+1;
		int num9 = rnd.nextInt(100)+1;
		int num10 = rnd.nextInt(100)+1;
		int intSum = 0;
		float floatAvg;
		/* 
		 * num변수하고 intKor이름하고 합하여 intKor1 ~ intKor5처럼 
		 * 만들 수 있을거 같은데 안된다
		 * ==>>intKornum 이라고 작성하면 java는 
		 * 		intKornum라는 변수를 찾으려고 시도한다.
		 * 
		 * intKornum = rnd.nextInt(100)+1;
		 * 
		 */
		
		intSum= num1;
		intSum += num2;
		intSum += num3;
		intSum += num4;
		intSum += num5;
		intSum += num6;
		intSum += num7;
		intSum += num8;
		intSum += num9;
		intSum += num10;
		
		floatAvg = (float)intSum / 10;
		
		System.out.println("================================");
		System.out.println("학생1: "+ num1);
		System.out.println("학생2: "+ num2);
		System.out.println("학생3: "+ num3);
		System.out.println("학생4: "+ num4);
		System.out.println("학생5: "+ num5);
		System.out.println("학생6: "+ num6);
		System.out.println("학생7: "+ num7);
		System.out.println("학생8: "+ num8);
		System.out.println("학생9: "+ num9);
		System.out.println("학생10: "+ num10);
		System.out.println("--------------------------------");
		System.out.printf("총점 : %d\t, 평균: %3.2f\n",intSum, floatAvg);
		System.out.println("================================");
	}
}
