package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		//총점 구할때 누적 사용
		int intSum =intKor;
		intSum += intEng;
		intSum += intMath;
		 intSum = intKor + intEng + intMath;
		int intAvg = intSum / 3; 
		
		
		System.out.println("====================");
		System.out.println( "국어 : " + intKor);
		System.out.println( "영어 : " + intEng);
		System.out.println( "수학 : " + intMath);
		System.out.println("--------------------");
		System.out.printf("총점 : %d\t평균 : %d\n",intSum,intAvg);
		System.out.println("====================");
		/* printf ()를 사용하여 출력할때
			%d : 정수(십진수)
				%3d : 자릿수를 3개로 맞추고 오른쪽 정렬
			%f : 실수 (float)
		        %3.2f : 소수점이하 2째자리까지 펴시
		    %s : 문자열
		    
		    \n : Enter를 누른것 처럼 사이띄기
		    \t : Tab키를 누른 것처럼 사이띄기를 일정하게 맞추어라
		    가	나
		    가나다
		    1	2
			*/
	}
}
