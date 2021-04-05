package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class Method_03 {

	public static void main(String[] args) {
		/*
		 * NumberServiceV1 클래스에 작성한 inputNum() 호출
		 * 
		 * C 언어는 단순히 method이름만 호출하여 명령 수행 가능   intputNum(); 
		 * 			>>함수호출(function call)
		 * But
		 * Java 에서는 함수호출방식 불가
		 * 			>> 1. 클래스를 사용하여 객체 생성
		 * 			>> 2. 객체와 연결 연산자(.)을 사용하여 호출    nsV1.inputNum();
		 * 				여기서 nsV1은 미래 객체로 생성되어 있어야 가능 
		 */
		NumberServiceV1 nsV1 = new NumberServiceV1();
		/*
		 * inputNum() method는 값을 return 해주도록 되어있음
		 *  >> 단순히 method호출만 하는 것은 아무런 의미없음
		 *  
		 *  이 method는 return 명령문이 강제되어 있기때문에 
		 *  method가 return 하는 값을 받아 변수에 저장 가능
		 *   > 	Integer retNum = nsV1.inputNum(); 
		 */
		nsV1.inputNum();
		
		Integer retNum = nsV1.inputNum();
		/*
		 * method가 return 해준값을 저장한 변수 : retNum
		 * 이 retNum값 참조하여 이후코드 작성 가능
		 */
		if(retNum == null) {
			System.out.println("3의 배수가 아닌 값");
		}else {
			System.out.println(retNum + " 은 3의 배수");
		}
		//위의 코드보다 더 권장하는 코드
		if(retNum != null) {
			System.out.println(retNum + " 는 3의 배수");
			
		}else {
			System.out.println("3의 배수가 아닌 값");
			//혹은 다른처리 수행하는 코드 작성
		}
	}
}
