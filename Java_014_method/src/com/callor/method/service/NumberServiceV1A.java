package com.callor.method.service;

public class NumberServiceV1A {

	public Integer addNum(Integer intNum1, Integer intNum2) {
		Integer intAdd = intNum1 + intNum2;
		if(intAdd % 2 == 0) {
			return intAdd;
		}
		return null;
	}
}
