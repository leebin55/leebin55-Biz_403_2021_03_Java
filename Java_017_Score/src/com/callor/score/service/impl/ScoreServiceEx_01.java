package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.MenuServiceImplV1;

public class ScoreServiceEx_01 implements ScoreService{

	@Override
	public void selectMenu() {
		String title = "성적처리";
		List<String> menuList = new ArrayList<String>();
		menuList.add("1. 성적입력");
		menuList.add("2. 성적 저장");
		menuList.add("3. 성적 출력");
		menuList.add("4. 성적 열기");
		MenuServiceImplV1 inSer = new MenuServiceImplV1(title,menuList);
		
		Integer menu = inSer.selectMenu();
		
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
