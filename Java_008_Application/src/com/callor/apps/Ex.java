package com.callor.apps;

public class Ex {

	public static void main(String[] args) {
		
		for( int i =0 ;i <0 ; i++) {
			System.out.println("출력"); //출력안됨
			
		}
		for(int i = 0; i <2 ; i++) {
			System.out.println("출력");//두번
			System.out.println(i);//0 과 1 출력
			//출력할때 i에서 +1되지 않음
			//다시 반복하기전에 i에서 +1
		}
	}
}
