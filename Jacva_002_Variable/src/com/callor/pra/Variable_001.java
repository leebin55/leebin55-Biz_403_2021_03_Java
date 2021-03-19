package com.callor.pra;

public class Variable_001 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 7;
		
		intSum += (intNum += 2);
		intSum += (intNum += 5);
		intSum += (intNum += 2);
		
		System.out.printf("intSum : %d , intNum : %d", intSum, intNum);
		
	}
}
