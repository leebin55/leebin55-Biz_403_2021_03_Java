package com.callo.apps.service;

import java.util.Random;

/* 상속
 * 자바프로그래밍에서 상속
 * V2클래서에서는 V1_b클래스를 상속했다.
 * 
 * V1_B에 작성한(선언한) 변수, method코드를 
 * 			그대로 이어받아서 사용하겟다
 * 
 * V1_B에 작성된 method들의 코드를 그대로 사용하면서
 * 			일부 method의 코드를 변경,확장,기능개선을
 * 			하여 내 프로젝트에 적용하겟다
 */
public class EvenServiceV2 extends EvenServiceV1_B {
	// 서비스v2클래스 만들텐데 이븐서비스 v1_b에 들어있는 것
	// 변수와 메서드등을 그대로 쓰면서 일부만 바꿔쓸때
	// 클래스의 상속

	public EvenServiceV2() {
		intNums = new int[100];
	}

	public void printEven() {
		int nCount = 0;

		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] % 2 == 0) {
				System.out.printf("%5d", intNums[i]);
				nCount++;
				if (nCount % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}

}
