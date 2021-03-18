package com.callor.var;

public class Variable_03 {

	public static void main(String[] args) {
		
		
		/*
		 * 변수의 성질 1
		 * 
		 * 코드가 TopDown(위에서 아래로) 으로 진행되는 동안
		 * 이전에 변수에 어떤 값이 저장 되었던 상관없이
		 * 읽는 시점 바로 전에 저장된 값만 유효함.
		 * 
		 */
		int intNum1 = 0;
		intNum1 = 30;
		intNum1 = 40;
		intNum1 = 50;
		intNum1 = 0; //가장 마지막 값만 유지 (출력명령문 실행되기 전 선언한 값)
		
		/* 
		 * 변수의 성질 2
		 * 
		 * 변수에서 값을 읽는 명령들...
		 * 		intNum1 에 저장된 값을 읽어서
		 * 		Console에 축력하다
		 * 변수에서 값을 읽는 명령이
		 *   몇번 수행되던 상관없이
		 *   한 번 변수에 저장된 값은 그대로 유지된다
		 * 
		 */
		System.out.println(intNum1); 
		System.out.println(intNum1); 
		System.out.println(intNum1); 
		System.out.println(intNum1); 
		System.out.println(intNum1); 
		System.out.println(intNum1); 
		
		/*
		 * 변수의 성질3
		 * 
		 * 변수에 값 저장. 할당, 대입
		 * 이때 대입연산자(=)를 사용한다.
		 * 
		 * 변수 = 값
		 * 변수 = 식
		 * 변수 = 변수
		 * 
		 * 대입연산자가 명령문 중에 나타나면
		 * 대입연산자 오른쪽이 먼저 실행
		 * 
		 */
		 
		intNum1 = 30;
		intNum1 = 30 + 40; // 30 + 40을 먼저 실행
		intNum1 = intNum1; // intNum1에 저장된 값 (70)을 다시 intNum1에 저장
		
		/* 
		 * intNum1 에 저장된 값(70)울 CPU로 복사해서 보내기
		 * 어딘가에 저장된 100을 CPU 로 복사해서 보내기
		 * 두 수 (70,100)을 덧셈하여 
		 * 		다시 intNum1에 저장
		 * 원래 intNum1 에 저장된 값은 사라지고 
		 * 		170이 intNum1에 저장
		 */
		intNum1 = intNum1 + 100; 
		intNum1 = intNum1 * 2;
		intNum1 = intNum1 -100;
		intNum1 = intNum1 /2;
		
		intNum1 += 100; //위에 식과 똑같음 >>메모리 줄이기위해
		intNum1 *= 2;
		intNum1 /= 100;
		intNum1 -= 2;
		
		intNum1 += 1; //intNum1에서 값을 읽어와서 +1 을 해라
		intNum1 += 1;
		intNum1 += 1;
		intNum1 += 1;//+=1이 계속 반복
		intNum1 += 1;
		intNum1 += 1;//원래 변수 자신의 값에서 1씩 증가
		
		intNum1 ++; //1씩 증가하는 코드 (intNum1 += 1;)(intNum1 = intNum1 +1)와 같음
		intNum1 --; //-1 씩
		++ intNum1;
		-- intNum1; //위에와 같지만 약간 차이점이 있다.
		
	
	}

}
