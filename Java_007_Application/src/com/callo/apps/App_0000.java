package com.callo.apps;

import java.util.Random;

public class App_0000 {

public static void main(String[] args) {
		
		Random rnd = new Random() ;
		int[] intNums = new int[20];
		for(int i = 0; i < intNums.length;i++) {
			intNums[i] = rnd.nextInt(51)+ 50;
			
		}
		for(int arr = 0; arr < intNums.length; arr++) {
			
			int num = 0;//num을 별도로 선언해서 사용
			int numP = intNums[arr];
			for(num = 2 ; num < numP ; num++) {//소수찾을때 for(num =2;;)처럼 2부터 시작
				System.out.println("num" + num);
				System.out.println("numP : " +numP);
				if (numP % num == 0) {
					break;
				}
			}
			if(num >= numP) {
				System.out.println(num + "는 소수");
			}
				
			}
		}
	
}


