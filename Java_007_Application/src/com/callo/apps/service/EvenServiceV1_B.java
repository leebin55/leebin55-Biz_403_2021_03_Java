package com.callo.apps.service;

import java.util.Random;

//클래스 선언문(시작하는곳)
public class EvenServiceV1_B {

	int[] intNums;
	//int[] intNums; 이렇게 하지 않고 선언은 생성자에서 

	/*
	 * 생성자method
	 * 클래스를 선언하면(public class EvenServiceV1_b)
	 * 자동으로 만들어지는 method
	 * 별도의 코드가 필요없으면 만들지 않아도 됨
	 * new EvenServiceV1_B()코드에서 호출되는 method
	 * 생성자 method에는 클래스영역의 변수들을
	 * 초기화 생성하기 위한 코드들이 작성됨
	 * 
	 */
	public EvenServiceV1_B() { //이 생성자는 자동으로 만들어짐 안보일뿐
							  //절대 절대 void넣지 않기!!!!
					        //(void를 넣으면 더이상 생성자가 아니라 메소드)
		
		intNums = new int[100];//생성은 생성자에서!!!
	}
	
	/* 
	 * 1시간에 90km를 갈 수 있는 속도로 달려라 >>
	 * 			90km/h로 달려라 
	 */
	public void makeNums() {
		//Random rnd를 사용할 수 있게 초기화
		Random rnd = new Random();//다른 메서드에서 쓰지 않으니깐 
		//							이 메서드 안에서 선언
		//intNums 배열 개수만큼 코드를 반복실행
		for(int i = 0 ; i <intNums.length ; i++) {
			
			intNums [i] = rnd.nextInt(100) + 1;
			
			
		}
	}
	/* 
	 * 짝수 (even) 홀수(odd)
	 */
	public void printEven() {
		int nCount = 0;
		System.out.println("=======================================");
		System.out.println("짝수 리스트 " );
		System.out.println("-----------------------------------");
		//intNums 배열 전체를 뒤져서
		//짝수가 있으면 찾아서 출력
		for(int i = 0; i <intNums.length ; i++) {
			
			if(intNums[i] % 2 == 0) {
				System.out.println(intNums[i]);
				nCount++;
			}
		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("=====================================");
	}
	
	public void sumEven() {
		
		int intSum = 0;
		for(int i = 0; i< intNums.length ; i++) {
			if (intNums[i] % 2 == 0) {
				intSum+= intNums[i];
			}
		}
		System.out.println("==============================");
		System.out.println("총합 : " + intSum);
		System.out.println("==============================");
	
	}

}
