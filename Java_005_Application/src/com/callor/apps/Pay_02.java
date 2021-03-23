package com.callor.apps;

public class Pay_02 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 50_000;
		
		for(int i = 0; i < 5 ; i++) { //for(;;) 무한반복
			
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권  %5d매\n",nPaper, nCount );
			
			nPay %= nPaper;
			nPaper /= 5;
			nCount = nPay / nPaper;
			
			System.out.printf("%6d 원권  %5d매\n",nPaper, nCount );
			
			nPay %= nPaper;
			nPaper /= 2;
			
			}
			
			//nPaper 를 2 또는 5로 나누기 
		}
	}

