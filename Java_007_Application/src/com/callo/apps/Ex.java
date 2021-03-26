package com.callo.apps;

import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		
		int[] intKor= new int[20];
		int[] intEng = new int[intKor.length];
		int[] intMath= new int[intKor.length];
		int[] intTotal= new int[intKor.length];
		float[] floatAvg= new float[intKor.length];
		int temp=0;

			Random rnd = new Random();
			for(int i = 0; i <intKor.length ; i++) {
				intKor[i] = rnd.nextInt(100)+ 1;
				intEng[i] = rnd.nextInt(100)+ 1;
				intMath[i] = rnd.nextInt(100)+ 1;
				
		}
		
			for(int i = 0; i <intKor.length ; i++) {

			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			
			floatAvg[i] = (float)intTotal[i] / 3;
			}
		
			for(int i = 0 ;i <intKor.length ; i++) {
				for(int j = i; j < intKor.length ; i++ ) {
					if(intTotal[j]< intTotal[j+1]) {
						
						temp = intTotal[j];
						intTotal[j]= intTotal[j+1];
						intTotal[j+1] =temp;
					}
						
			}
		}
		System.out.println("");
		for(int i = 0; i < intKor.length;i++) {
		System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\t%3.2f\n",i+1,intKor[i],intEng[i],
				intMath[i],intTotal[i],floatAvg[i]);
		}
	}
}
