package com.callo.apps;

import com.callo.apps.service.EvenServiceV3;
//EVen~V3에 아무코드도 없지만 실행이 된다 
//>>Even V1_B에 내용을 그대로 변경없이 사용
public class App_07 {

	public static void main(String[] args) {
		
		EvenServiceV3 esV3 = new EvenServiceV3();
		esV3.makeNums();
		esV3.printEven();
		esV3.sumEven();
	}
}
