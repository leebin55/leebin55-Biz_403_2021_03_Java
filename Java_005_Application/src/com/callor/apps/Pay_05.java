package com.callor.apps;

public class Pay_05 {
/*
 * 스위치변수를 사용한 조건 연산
 * 			연산이 "2가지" 경우에 서로 달리 수행해야 될 경우
 * 
 * 			변수를 1로 시작하고
 * 			코드내에서 변수에 -1을 곱하는 코드를 추가하고
 * 			변수값이 '>0' 또는 '<0' 경우를 비교연산을 수행하여
 * 			코드를 간소화 하는 방법
 * 
 * 
 * for() {} : 반복 횟수가 처음에 정해진 경운
 * while() {} : 반복 횟수가 조건에 맞추어서 정해지지 않고 반복될때
 * 
 * 
 */
	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;

		int sw = 1;

		// for (;;) { // for(;;) 무한반복>>잘 사용안함
		// for 문은 몇번 반복할때(정해져있을때)
		/*
		 * 조건 내에서 무한반복할때>>while while (조건) {} 
		 * 조건 = 비교연산문 이 true인 동안!! 
		 * 무한 반복 실행하는 반복문
		 */
		while (nPay > 0) { //
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권  %5d매\n", nPaper, nCount);
//두가지를 반복하여서 나타낼때 쓰이는 방법
			nPay %= nPaper;
		}
		if (sw > 0) {
			nPaper /= 5;

		} else {
			nPaper /= 2;
		}
		sw *= (-1);
	}

	// nPaper 를 2 또는 5로 나누기
}
