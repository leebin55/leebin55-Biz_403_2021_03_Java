package com.callor.method;

import com.callor.method.service.NumberServiceV1A;

public class Test_01 {

	public static void main(String[] args) {
		
		NumberServiceV1A nsV1 = new NumberServiceV1A();
		Integer retNum1 = nsV1.addNum(4,5);
		Integer retNum2 = nsV1.addNum(5, 5);
		System.out.println(retNum1);
		System.out.println(retNum2);
		
	}
}
