package com.callor.score;

import java.util.List;
import java.util.Scanner;

public class menuEx_01 {

	protected String title;
	protected List<String> menuList;
	protected Scanner scan;

	/*
	 * new MenuServicImplV1() 형식으로 작성이 안됨 반드시 String, List형 두개의 값을 전달해 주어야 함 new
	 * MenuServiceImplV1(title, menuList)형식으로 작성
	 */
	public menuEx_01(String title, List<String> menuList) { // 생성자에 매개변수를 넣어서 만듬
		title = this.title;
		menuList = this.menuList;
		scan = new Scanner(System.in);
	}

	public Integer selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size();
			for (int i = 0; i < nSize; i++) {
				System.out.printf("%d .  %s", i + 1, menuList);
			}
			System.out.println("QUIT . 입력종료");
			System.out.println("-".repeat(50));
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.trim().equals("QUIT")) {
				return null;
			}
			Integer menu = null;
			try {
				menu = Integer.valueOf(menu);
			} catch (NumberFormatException e) {
				System.out.println("보기의 메뉴만 입력해주세요");
				continue;
			}
			if(menu>nSize) {
				System.out.println("1 ~ " + nSize + " 까지만 입력");
				continue;
			}
			return menu;
		}	
	}
}
