package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.service.NumberServiceV3A;

public class NumberTest_03 {

	public static void main(String[] args) {
		
		boolean keepRunning = true;
		NumberServiceV3A nbV3 = new NumberServiceV3A();
		while(keepRunning) {
		Integer retNum	= nbV3.inputNum();
		if(retNum == null) {
			System.out.println("종료");
			keepRunning = false;
			break;
			
		}
		System.out.println(retNum);
		}
	}
}
