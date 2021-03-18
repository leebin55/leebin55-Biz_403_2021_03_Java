package com.callor.var;

public class Variable_05 {

	public static void main(String[] args) {
		
		int intNum = 1;
		int intSum = 0;
		
		intSum += intNum; //intSum =1
		System.out.println(intSum); 
		
		intNum ++; 
		intSum += intNum; //1 (intSum) +2 (intNum) =3
		System.out.println(intSum);
		
		intNum ++; 
		intSum += intNum; //3+3 =6
		System.out.println(intSum);
		
		intNum ++; 
		intSum += intNum; //6+4 = 10
		System.out.println(intSum);
		
		intNum ++; 
		intSum += intNum; //10 + 5 = 15
		System.out.println(intSum);
		
	}
}
