package com.callo.apps;

import com.callo.apps.service.PrimeServiceV1;

public class App_03 {

	public static void main(String[] args) {
		
		PrimeServiceV1 psV1 = new PrimeServiceV1();//객체 : psV1, psVA,psVB
		PrimeServiceV1 psVA = new PrimeServiceV1();
		PrimeServiceV1 psVB = new PrimeServiceV1();
		
		psV1.makeNums();//객체를 만들면 변수자체가 객체를 따라다님
		psVA.makeNums();//객체가 다르면 똑같은 method를 실행하지만 값은 다름
		psVB.makeNums();//이 세 배열에 들어있는 값은 서로 다르다 == 독립적이다.
		
		System.out.println("==================================");
		System.out.println("psV1");
		System.out.println("====================================");
		psV1.printPrime();
		
		System.out.println("====================================");
		System.out.println("psVA");
		System.out.println("-----------------------------------");
		System.out.println();
		psVA.printPrime();
		System.out.println("====================================");
		System.out.println("psV1");
		System.out.println("-----------------------------------");
		System.out.println();
		psV1.printPrime();
	}
}
