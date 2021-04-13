package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.yublee.standard.impl.MenuServiceImplV1;

//인터페이스에서 객체를 생성할 수 없음
// >> 생성자가 없다
public class ScoreServiceImplV1 implements ScoreService {

	public ScoreServiceImplV1() {

	}

	@Override
	public void selectMenu() {
		// TODO 메뉴를 1~5 와 QUIT입력받음

		List<String> menuList = new ArrayList<String>();
		menuList.add("1 . 학생정보 등록");
		menuList.add("2 . 성적 등록");
		menuList.add("3 . 성적정보 열기");
		menuList.add("4 . 성적정보 저장");
		menuList.add("5. 성적정보 출력");
		MenuServiceImplV1 menuSer = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menuList);
		while (true) {
			Integer menu = menuSer.selectMenu();
			if (menu == null) {
				System.out.println("업무종료");
				break; // return; return 으로 쓰면 어떻게???
				/*
				 * break : while{} 이후의 코드진행
				 * return : 더이상 진행 하지않고 거기서 끝남
				 * 지금은 break 난 return 이나 같음
				 */
			} else if (menu == 1) {
				
			} else if (menu == 2) {
				this.inputScore();
			} else if (menu == 3) {
				this.readScore();
			} else if (menu == 4) {
				this.saveScore();
			} else if (menu == 5) {
				this.printScore();
			}
		}
	}

	

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
