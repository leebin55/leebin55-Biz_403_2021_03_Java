package com.callor.method;

import com.callor.method.service.InputServiceV1A;

public class Test_02 {

	public static void main(String []args) {
		
		InputServiceV1A ipV1 = new InputServiceV1A();
		Integer retNum = ipV1.inputValue("aa");
		if(retNum == null) {
			System.out.println("입력종료");
			
		}else {
		System.out.println(retNum);
		}
		
		Integer retNum1 = ipV1.inputNum("aa");
		if(retNum1 == null) {
			System.out.println("입력종료");
			
		}else {
		System.out.println(retNum1);
		}
	}
}
