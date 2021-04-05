package com.callor.method;

import com.callor.method.service.NumberServiceV2A;

public class NumberTest_02 {

	public static void main(String[] args) {
		
		NumberServiceV2A nbV2 = new  NumberServiceV2A();
		Integer retNum1 =nbV2.inputNum();
		
		if(retNum1 != null) {
			System.out.println("입력한 정수 : " + retNum1);
		}else {
			System.out.println();
			System.out.println("입력취소");
		}
	}
}
