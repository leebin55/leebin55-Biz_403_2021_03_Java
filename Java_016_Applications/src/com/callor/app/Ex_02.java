package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_02 {
	protected String title;
	protected List<String> menuList;
	Scanner scan;

	public Ex_02() {
		menuList = new ArrayList<String>();
		title = null;
		scan = new Scanner(System.in);

	}
	public void selectMenu(String title, List<String> menuList) { // 생성자에서 만듬  >> 실수
		this.title = title;
		this.menuList = menuList;
		System.out.println("=".repeat(50));
		System.out.println(title);
		System.out.println("-".repeat(50)); // title 입력
		int nSize = menuList.size();//menuList에 들어있는 크기값을 저장
		//즉 보기의 갯수만큼 생성
		for(int i = 0 ; i < nSize ;i++) {
			System.out.printf("%d . %s\n",i+1,menuList.get(i));
			//1 . munuList에 담겨있는 값
			//i+1 (i 는 0 부터 시작 1씩 증가하므로)
			//menuList의 저장되어있는 값 읽어옴
			// selectMenu를 다른 클래스에서 호출할때 메뉴를 설정하려면 menuList.add(""); 
		}
		System.out.println("QUIT . 입력종료");//입력종료는 항상 메뉴보기 끝에 입력되도록
		System.out.println("=".repeat(50));
		System.out.print("입력 >> ");
		String strMenu = scan.nextLine();
	}
}
