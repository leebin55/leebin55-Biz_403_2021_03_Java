package com.callo.apps.service;

import java.util.Random;

public class ScoreServiceEx {

	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	int temp;
	public ScoreServiceEx() {
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		temp = 0;
	}

	public void makeScore(){
		Random rnd = new Random();
		for(int i = 0; i <intKor.length ; i++) {
			intKor[i] = rnd.nextInt(100)+ 1;
			intEng[i] = rnd.nextInt(100)+ 1;
			intMath[i] = rnd.nextInt(100)+ 1;
			
	}
	}
	
	public void makeTotal() {
		for(int i = 0; i <intKor.length ; i++) {

		intTotal[i] = intKor[i];
		intTotal[i] += intEng[i];
		intTotal[i] += intMath[i];
		
		floatAvg[i] = (float)intTotal[i] / 3;
		}
	}	
	
	public void makeArray() {
		for(int i = 0 ;i <intKor.length ; i++) {
			for(int j = i; j < intKor.length ; i++ ) {
				if(intTotal[j]< intTotal[j+1]) {
				
					temp = intTotal[j];
					intTotal[j]= intTotal[j+1];
					intTotal[j+1] =temp;
				}
					
			}
		}
	}
	
	public void printScore() {
		
		System.out.println("======================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------");
		for(int i = 0; i < intKor.length;i++) {
		System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n",i+1,intKor[i],intEng[i],
				intMath[i],intTotal[i],floatAvg[i]);
		}
		System.out.println("======================================");
	}
}
