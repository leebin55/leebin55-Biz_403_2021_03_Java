package com.callor.method.service;

public class NumberServiceV6 {

	protected InputService inService;

	public NumberServiceV6() {// 생성자
		inService = new InputService();
	}

	public Integer inputNum() {
		while (true) {
			/* 
			 * InputService.inputValue("정수")를 호출하고
			 * 		return 값이 null 이면 그냥 null을 main() 으로 보냄
			 * 		return된 값이 정수이면 범위유효성 검사 수행
			 * 			맞지않으면 : 다시 입력하도록 inputValue()호출;
			 * 				0아니면 : 정수를 다시 return 해서 main() 으로
			 * 			
			 */		
			Integer retNum = inService.inputValue("정수 ( 0 ~ 100)");
			if (retNum == null) {
				return null;
			} else if (retNum < 0 || retNum > 100) {
				System.out.println("정수 0 ~ 100까지 입력");
				continue;
			} else {
				return retNum;
			}
		}
	}
}
