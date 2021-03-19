package com.callor.controller;

public class Score_03 {

	public static void main(String[] args) {
		
		int intKor = 87;
		int intEng = 66;
		
		int intSum = intKor + intEng;
		System.out.println("총점 : " + intSum);
		
		//오차가 발생한 평균계산
		int intAvg = intSum / 2;
		System.out.println("평균 : " + intAvg); //실제 계산값은 76.5 인데 값이76나음
		
		//평균을 저장할 변수를 float형으로 
		float floatAvg = intSum /2; //'='기준으로 오른쪽 먼저계산 >>intSum/2먼저 계산됨 76
		//>>오른쪽에 있는 값이 계산되기전에 float형으로 강제변환 시켜야
		/*과목의 평균을 계산할때 
		 * 			소수점이하 오류(오차)발생
		 * 소수점이하 계산 살리기위해 평균을 저장할 변수를 float 으로 선언하였다
		 * but,,,
		 * 여전히 계산된 결과는 소수점이하 값이 0으로 나옴
		 * 
		 * 이 상황은 대입 연산자의 성질때문
		 * 			>>대입 연산자가 나오면 항상 오른쪽의 연산식이 먼저 실행
		 * 결과적으로 정수 / 정수는 결과가 정수이며
		 * 이미 계산 결과에서 소수점이하 값이 없는 상태
		 * 즉, 이값을 실수형 변수에 담는 것은 아무 의미 없다
		 * 
		 * 이 명령문을 실행하여 정확한 평균 계산하려면??
		 * 대입 연사자 오른쪽의 계산식의 값을
		 * ""실수형으로 강제 형변환""한 다음 연산을 수행
		 */
		floatAvg = intSum / 2;
	
		//intSum / 2 의 연산식에서
		//정수형 변수 intSum 을 float형으로 강제 형병환하면
		//나누는수 2도 2.0으로 변환된다
		//결국 실수 / 실수 연산이 됨
		//	 소수점이하 값을 포함하는 계산 결과가 만들어짐
		floatAvg = (float)intSum /2;//제일 많이 사용
		floatAvg = intSum / 2.0F;//제일 많이 사용
		floatAvg = intSum / (float)2;//실무에서 사용XX
		floatAvg = (float) intSum / 2.0F;
		floatAvg = (float) intSum / (float)2;
		
		System.out.println("평균 : " + floatAvg);//결과 76.0으로 실수로 나오지만 맞는 값XX
	}
}
