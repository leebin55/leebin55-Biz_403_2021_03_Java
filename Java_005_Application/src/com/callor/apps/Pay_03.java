package com.callor.apps;

public class Pay_03 {

	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;

		int sw = 1;
		for (int i = 0; nPay > 0; i++) { // for(;;) 무한반복

			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권  %5d매\n", nPaper, nCount);
//두가지를 반복하여서 나타낼때 쓰이는 방법
			nPay %= nPaper;
			if (sw > 0) {
				nPaper /= 5;

			} else {
				nPaper /= 2;
			}
			sw *= (-1);
		}

		// nPaper 를 2 또는 5로 나누기
	}
}
