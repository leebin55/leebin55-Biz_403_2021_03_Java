package com.callor.method;

import java.util.Random;
import java.util.Scanner;

public class Method_01 {

	/*
	 * Random(난수)  수를 1개 생성하여 3의 배수인가?
	 * 
	 */
	public static void main(String[] args) {
		/*
		 *  Random 클래스를 사용하여 rnd 객체를 선언하고
		 *  Random()  생성자 method를 호출하여 
		 *  		객체를 생성(초기화)하는 코드
		 *  선언만!! 한 객체 에서 객첵.method() 호출 >> NullPointerException발생
		 *  	
		 *  NullPointerException
		 *  		객체가 아직 실체가 없다.
		 */
		Random rnd = null; //Random rnd = null; 이라고 해줘야 
		// null아무것도 아닌 준비가 안된 값 
		Integer intNum = rnd.nextInt(100)+ 1;
		
		Random rnd1 = new Random();
		/*
		 * Scanner 클래스를 사용하여 scan 객체를 선언하고
		 * Scanner() 생성자 method 를 호출하여 scan 객체를 생성
		 * Scanner() 생성자는 객체를 생성할 때 
		 * 			System.in(키보드 입력장치)를 연결할 수 있도록 매개변수에 
		 * 			 정보를 전달해주어야 함
		 * 
		 */
		Scanner scan = new Scanner(System.in);//매개변수 System.in 무조건 가지고 있어야
		/*
		 * String 클래스
		 * 	- 클래스 이면서 변수적인 성질을 갖는 특별한 클래스
		 *  - 사용법이 클래스 방식이면서 일반적인 변수 처럼 사용가능 (wrapper  클래스)
		 */
		String str1 = new String(); //저장되는 값 : ""
		String str2 = new String("대한민국");//매개변수 가져도 되고 없어도 되고
		String str3 = "우리나라"; //이방식도 가능
		
		/*
		 * int 형 변수와 Integer wrapper 를 사용하여 만든 변수
		 * 
		 * 사용하는 기본방법 동일
		 * Integer 는  new Integer() 엉뚱하게 작동되는 경우 있음
		 * 따라서 지금은 Integer() 생성자를 사용하여 변수를 만들지 못함
		 * 
		 * 숫자형 변수는 생성자를 사용하여 변수를 만들지 말자!!
		 * 
		 */
		Integer int1 = 0;
		
		/*
		 * int1에 저장된 정수가 3의 배수?
		 * 
		 * if 조건문을 사용하여 조건 검사
		 * >조건 일치 
		 * 			: ~하다. ~다 
		 * > 조건 불일치 else 사용하여 표현할때는(딱 맞아 떨어지는 어떤조건을 찾기 어렵기 때문) 
		 * 			: ~~ 가 아니다
		 */
		int1 = rnd.nextInt(100)+1;
		if(int1 % 3==0) {
			System.out.println(int1 + " 은 3의 배수");
			
		}else {
			System.out.println(int1 + " 은 3의 배수아님");
		}
		/*
		 * 어떤수가 짝수인가 조건검사
		 * 짝수 : 짝수이다
		 * else : 홀수이다 라고 표현하기 보다는 짝수가 아니다
		 * 		~~이 아니다
		 * 		코드를 작성할 때 조건으로 명시한 이외의 경우는 가급적 ~~이 아니다
		 * else if 는 다름 
		 */
		if(int1 % 2 == 0) {
			System.out.println(int1 + "은 짝수");
			
		}else {
			System.out.println(int1 + "은 짝수 아님");//홀수다 대신
		}
	
	}
	
}
