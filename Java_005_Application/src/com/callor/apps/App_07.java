package com.callor.apps;

public class App_07 {

	public static void main(String[] args) {
		
		int intNum = 3_385_859;
		/* 
		 * intNum의 자릿수가 얼마인가?
		 * 
		 * 
		 */
		System.out.println(intNum);
		int nCount = 0;
		while(intNum>0) {//while(true) 무한반복
			//while(true) {} 반복문을 끝내기 위한
			//비교 연산명령문
			//intNum 0이하이면 반복문을 끝내라
			//이명령 대신 조건문을 "반대로" 설정
			//if(intNum <=0){
			//break;
			
			nCount++;
			// intNum = intNum % 10
			//intNum 값과 10을 나머지 연산을 수행
			//int Num /10; => 385859 / 10 = 339585.9
			intNum /= 10 ; 
			System.out.println(intNum);
		}
		System.out.println( "3385859 는 " + nCount + "자릿수");
	}
}
