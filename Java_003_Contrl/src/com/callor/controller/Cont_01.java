package com.callor.controller;

public class Cont_01 {

	public static void main(String[] args) {
		
		int intNum = 0;
		System.out.println("===============================");
		for ( ; intNum <10 ;) { //범위지정할때 주의하기
			//for(;:) 안에 가급적이면 ++intNum 같이 ++쓰지 않기
			System.out.printf("%d. 우리나라 대한민국\n", ++intNum);
			/* 같은 코드를 복사붙이기 하지 않고 
			 * 명령문을 이용하여 반복하도록 수행 
			 * main() 메서드의 코드는
			 * Topdown 방식으로 진행되는데
			 * 코드가 정상 진행된느 과정에서
			 * for() 명령문을 만나면
			 * 조건을 검사하고 조건에 따라
			 * 반복하는 코드가 실행됨
			 * 이처럼 Topdown으로 진행되는
			 * 코드의 흐름을 바꾸는 명령 == "제어명령", "Control 명령"
			 */
		}
		System.out.println("===============================");
		//++ 가 다른 명령문과 함께 사용될때는 
		//변수앞 , 뒤에 따라 결과가 달라진다.
		//intNum++ 단독으로 사용할때는 ++위치 상관없음
		//println(++intNum + ". 우리나라 대한민국")
		
		intNum = 0;
		for( ; intNum<10 ; intNum++) { //intNum++ 쓰고싶다면 ;;뒤쪽에
			System.out.println(intNum + ". 우리나라 만세");
			
		}
		for( intNum = 0; intNum < 10 ; intNum++) { //3개의 명령문 for()안에
			/* for()명령을 만나면 
			 * intNum = 0 을 실행한다
			 * 		이 명령은 반복횟수와 관계없이 
			 * 		최초에!!! 딱 한번만!!! 실행된다
			 * 
			 * intNum <10 을 실행하여 조건을 검사
			 * 		True => {} 안의 명령 실행
			 * 
			 * 실행 끝나면 다시 for()명령문 시작으로 돌아옴
			 * 
			 * intNum++ 명령을 실행
			 * 
			 * intNum <10 조건검사
			 * 		True => 위 과정 반복
			 * 		False => 반복끝
			 * 
			 * 증가, 조건검사를 반복하면서
			 *   조건검사 결과가 false 가 될때까지
			 *   반복하여 {} 안의 명령을 실행
			 */
			
			System.out.println(intNum);
		}
	}
}

