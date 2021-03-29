package com.callor.apps;

import com.callor.apps.model.AddressVO;
import com.callor.apps.service.AddressServiceV1;

public class AddrEx_01 {

	/* 
	 * Java에서는 변수명, 클래스명, method명, 객체명 등을 모두 한글로 작성 가능
	 * 팀프로젝트를 할 때는 혼자 만드는 프로젝트가 아니므로
	 * 규칙을 따라서 이름 짓기
	 * 
	 * 일부에서 한글로 변수명 등을 지으면 코드가 문제가 발생한다라고 하지만 근거 없음
	 * 
	 * 다만 한글로 이름을 짓게되면 CamelCase방식의 명명이 힘들어 코드작서이 다소 어려워짐
	 * 
	 */
	public static void main(String[] args) {
		
		// 설게된 VO 클래스를 사용하여 홍길동 객체 생성
		AddressVO 홍길동 = new AddressVO();
		
		
		/*
		 * 객체의 멤버변수에 값을 저장
		 */
		홍길동.name = "홍길동";
		홍길동.cellPhone = "010-0000-0000";
		홍길동.email = "aaa@aaa.com";
		홍길동.chain = "friend";
		홍길동.address= "서울";
		
		AddressServiceV1 ssV1 = new AddressServiceV1();
		/* 
		 * 똑같은 printAddress라는 메소드를 이용
		 * 1.문자열 매개변수 3개를 > 3개의 값을 다 보내야 함. 만약 실수로 바꿔서 넣으면 
		 * 데이터가 바뀔수 있는 가능성이 있음
		 * 2.클래스 매개변수를 한개가지고 있는
		 *   >객체를 만들고 
		 */
		ssV1.printAddress("홍길동", "aaa@aaa.com","010 -0000- 0000"	);
		System.out.println("==========================================");
		ssV1.printAddress(홍길동);//홍길동 객체를 통째로 전달
		
		
	}
}
