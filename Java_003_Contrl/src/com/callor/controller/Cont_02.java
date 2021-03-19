
package com.callor.controller;
/*
 * 명령어
 * 		- 코딩을 할 때 반드시 정확한 스펠링으로 사용해야하는
 * 		  중요한 keyword 들
 * 명령문
 * 		- 명령어와 명령어가 조합되고 , 다른 어떤단어들이
 * 		  조합되어 문장을 이루는 형태 >> statement, 명령구문
 * 
 * 명령문은 보통 끝에 세미콜론(;) 
 * 명령문이 그룹으로 설정되는 경우 중괄호{} 사용
 * 		다른 명령문 들을 포함하는 명령문
 */
public class Cont_02 {

	public static void main(String[] args) {
		
		int num = 0;
		for( num = 0 ; num < 10 ; num ++) {}
		
		
		for( int index =0; index < 10 ; index ++) {
			//변수 선언 위같이 말고 for문안에서 변수선언
			
			System.out.println(index);
		}
		System.out.println("============================");
		
		
		
		
		for( int i = 0; i < 10 ; i++) {
			System.out.println(i);
		}// 모든 컴퓨터의 시작값은 0
		System.out.println("============================");
		
		
		
		for ( int i = 0 ;i < 10; i++) {
			System.out.println(i + 1);//코드내에서 println(i++) 와 다름
			// i 값 변경됨 (i + 1)은 i 값 변경없이 값만 +1 로 
		} //1- 10 까지 출력
		
		/*
		 * 반복비교하기 위하여 사용하는 변수를
		 * i 로 선언 및 초기화 하고
		 * 조건문을 설정하는 일반적인 반복(구) 문
		 * 
		 * for () 명령문에서는 {} 의 코드가 
		 * 실제로 몇번 반복 실행 되느냐? 가 중요함
		 * 
		 */
		int intNum = 0;
		for (int i = 0 ; i < 10 ; i++) { //변수 i는 for 명령문 끝나면 사라짐
			System.out.println(++intNum);
		}
	
		for(int i = 0 ; i <100 ; i++) { //위의 i 와 다른 변수
			System.out.println(i + 1);
		}
	}
}
