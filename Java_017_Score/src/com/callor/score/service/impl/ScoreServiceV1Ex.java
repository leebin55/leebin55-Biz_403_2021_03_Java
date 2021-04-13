package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.ScoreServiceImplV1;
import com.yublee.standard.InputService;
import com.yublee.standard.MenuService;
import com.yublee.standard.impl.InputServiceImplV1;
import com.yublee.standard.impl.MenuServiceImplV1;

public class ScoreServiceV1Ex extends ScoreServiceImplV1{
	
	protected MenuService menuSer;
	protected InputService inSer;
	
	public ScoreServiceV1Ex() {
		inSer = new InputServiceImplV1();
		/*
		 * MenuServiceImplV1 클래스의 생성자는 두개의 매개변수(argument,parameter)
		 * 를 전달하면서 호출해야함
		 * 
		 * >> 1st parameter : 프로젝트의 title
		 *    2nd parameter : menuList 업무리스트를 담을 List형 객체
		 *    
		 *  title은 단순 문자열이기 때문에 바로 전달할 수 있는데
		 *  List형 객체는 List객체를 생성하고
		 *  		데이터를 add한 후 전달
		 *  약간의 추가 연산 코드 필요
		 *  
		 *  이럴때 생성자 method에서 장성하지 않고 
		 *  		객체를 사용하는 method에서 작성하는 것이 bbb
		 */
		
	}

	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add(" 1. 학생정보 등록");
		menuList.add(" 2. 성적등록");
		menuList.add(" 3. 성적정보 열기");
		menuList.add("4. 성적정보 저장");
		menuList.add("5. 성적정보 출력");
		
		MenuServiceImplV1 menuService = new MenuServiceImplV1(title, menuList);
		while (true) {
			Integer menu = menuSer.selectMenu();
			if (menu == null) {
				return;
			}	//여기서는 else안씀 상황에 따라 판단하기 > 효율적으로 
			// 1번 코드
			if( menu == 1) {  }	//menu == 1임에도 불구하고 항상 그다음 if문을 또 물어봄
			if( menu == 2) {  }	// 앞에 if문을 통과하고 참이었으때 다른코드 도 실행
			if( menu == 3) {  }	
				
			//2번 코드
			else if (menu == 1) { // menu == 1 일때 이 코드만 실행하고
								// 나머지 코드(else if)는 실행 안함
			} else if (menu == 2) {
			} else if (menu == 3) {
			}
			//1 번코드에 비하면 2번코드가 더 효율적
		}
	}
}
