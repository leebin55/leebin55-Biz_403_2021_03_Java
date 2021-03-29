package com.callor.apps.service;

import com.callor.apps.model.AddressVO;

public class AddressServiceV1 {
//클래스를 디자인하고 만드는것 > 객체를 만든다
	/*
	 * name, email, phone 3개의 매개변수를 통해 문자열을 전달 받고
	 * 전달받은 문자열을 console에 출력
	 * 사용할때 반드시 문자열 3개를 받아야 함
	 * 
	 * => 객체지향이라는 개념이 나오기전에 사용되었던 방법 
	 * 경우에 따라서 많은 항목의 데이터를 받아 사용할때 매개변수가 많아지므로 무리...
	 * 수정할때도 불편
	 */
	public void printAddress(String name, String email, String phone) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		
	}
	//객체지향에서 가장 중요한 개념 VO   
	//AddressVO 클래스를 매개변수로 받은 method
	//이 방법은 항목이 많아도 
	//항목이 수정될때 VO에 들어있는 몇군데만 수정하면됨> 유지보수 용이
	public void printAddress(AddressVO adVO) {//AddressVO adVO를 매개변수로 받음
		
		System.out.println(adVO.name);
		System.out.println(adVO.email);
		System.out.println(adVO.chain);
		System.out.println(adVO.address);
		System.out.println(adVO.cellPhone);
	}
}
