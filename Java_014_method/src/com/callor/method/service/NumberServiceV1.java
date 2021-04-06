package com.callor.method.service;

/*
 * 함수형 프로그래밍 언어(또는 구조적 프로그래밍 언어)에서는
 * 한개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 선언할 수 없다
 * 
 *  객체지향 프로그램언어(java) 에서는 한 개의 클래스(파일) 내에서
 *  같은 이름의 함수 (method) 를 중복선언 가능
 *  		단, 매개변수가 달라야 가능
 *  		> 매개변수의 type,개수, 순서가 다르면 같은 이름의 method중복선언 가능
 */
public class NumberServiceV1 {

	/*
	 * addNum() method 만들기
	 * 두개의 정수를 매개변수로 받음 
	 * 			> addNum()호출 : 객체.addNum(); 
	 * 			객체.addNum(100,200);호출할때 2개의 정수를 전달하겟다라는 선언
	 * 
	 *  두개의 정수를 전달받기위해서는 method준비해야만
	 *  		method의 () 괄호안에 변수를 선언 >> 두개의 변수를 ()괄호 안에 선언
	 *  
	 *  그 두수의 합이 짝수 : 합을 return;
	 *  			합이 짝수가 아니면 : null return;
	 *  
	 *  return 값; > void(return할 값 없음) 대신 return type을 지정해 주어야 함
	 *  
	 *  정수값 return - int : 단순한 정수값 return
	 *  			  - Integer : 정수값과 null 값 return
	 */
	
	public Integer addNum(int num1, int num2) {//우선 public void addNum() 로 시작 기본으로
		//TODO 두 정수의 합이 짝수 인가 판별하는 method
		/*
		 * 1번째 방법
		 * 연산을 먼저 수행하고 연산 결과에 따라 return 등을 수행하는 경우
		 * 
		 * 연산된 결과를 담은 변수를 만들고 이후 코드 진행
		 */
		int sum = num1 + num2;
     		if(sum % 2 == 0) {
			return sum;
	    	}
		   return null;

		
		// 2 번째방법 (하나의 method에서 return 값 1개만 사용)
		// C 언어와 같은 함수형언어에서 함수를 끝내는 return문은 한번만 쓰자라는 패턴이 있음
		// Integer sum = null;
		// if((num1 + num2) % 2 == 0) {
		// 	sum = num1 + num2;
		// }
		// return sum;
		 
		
		//  3번째 방법
		// if((num1 + num2) % 2 == 0) {     의미없는 계산을 2번 : 비용을 더 많이 듬 >> 변수를 만들어 사용 
		//		return num1 + num2 ;
		//	}
		//	return null;
		
	}// addNum() end
	/* 
	 * java의 method는 매개변수에 따라 호출방식이 다름
	 * 
	 * addNum(정수,정수) : addNum(int num1, int num2) / addNum (long num1 , long num2)
	 * addNum(실수,실수) : addNum(float num1, float num2) / addNum(double num1, double num2)
	 * 
	 * =>> method 호출할때 전달하는 데이터의 type에 맞도록 method가 미리 만들어져 있어야 함
	 */
	public Float addNum(float num1, float num2) {
		//TODO 두 실수를 전달받아 짝수인가 판별하는 코드
		
		float sum = num1 + num2 ;
		if(sum % 2 ==0) {
			return sum;
		}
		//method 코드 미완성일대 문법오류 방지하는 임시코드 return null;
		return null; 
	}//addNum(float , float) end
	public Float addNum(float num1, int num2) {
		return null;
	}
	public Float addNum(int num1, float num2) {
		return null;
	}
}
