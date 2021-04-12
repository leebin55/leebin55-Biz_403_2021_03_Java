package com.callor.app;

import java.util.List;
import java.util.Scanner;

public class Ex_01 {

	String title;
	List<String> menuList;
	Scanner scan;
	public Ex_01(String title,List<String> menuList) {// 매개변수에서 선언
		scan = new Scanner(System.in);
		this.title = title;
		this.menuList = menuList;
		//menuList 에 보기 를 담음
		//1 부터 시작
	}
	public Integer selectMenu() {
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size(); //메뉴의 개수 1 ~ n
			for (int i = 0; i < nSize ; i++) {
				System.out.println(menuList.get(i));//menuList에 담겨있는 값을 size만큼 반복
			}
			System.out.print("메뉴 입력 >> ");
			String strM = scan.nextLine(); // 메뉴 입력 받음
			if(strM.trim().equals("QUIT")) { // QUIT 을 입력하면 null을 return
				return null;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				
			}
			
		}
		
	}
}
