package com.yublee.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yublee.standard.MenuService;

/*
 * 사용자에게 업무 리스트를 보여주고
 * 업무 번호를 입력하면 해당 업무를 return
 * 
 * QUIT 입력하면 null 을 return
 * 
 * new MenuServicImplV1() 형식으로 작성이 안됨
 * 반드시 String, List형 두개의 값을 전달해 주어야 함
 * new MenuServiceImplV1(title, menuList)형식으로 작성
 */
public class MenuServiceImplV1 implements MenuService {

	//맴버변수 title
	protected String title;
	protected List<String> menuList;
	protected Scanner scan;

	public MenuServiceImplV1(String title, List<String> menuList) {
		/*
		 * 생성자에서 매개변수 선언
		 * 
		 * MenuServiceImplV1 클래스를 사용하여 객체를 생성할 때는 
		 * title 변수와 menuList 에 값을 담아서 파라메터로 전달하고
		 * 생성자를 호출 해야 함
		 */
		
		//객체를 생성할 때 전달한 매개변수 title을 
		//맴버변수 this.title (매개변수와 구분하기 위해 this. 을 붙여줌 이름같아서)
		this.title = title;
		//menuList = new ArrayList<String>(); 직접선언
		this.menuList = menuList; // 직접 생성하지 않고 누군가 대신 생성해서 보내줌
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size();
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {
				System.out.printf("%d. %s\n", menuIndex + 1, menuList.get(menuIndex));
			}
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택  >> ");
			String strM = scan.nextLine();
			if (strM.trim().equals("QUIT")) {
				return null;
			}
			Integer intM = null;

			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.printf("업무는 1 + %d, 또는 QUIT만 입력\n", nSize);
				continue;
			}
			if(intM < 1 || nSize<intM ) {
				System.out.printf("업무는 1 ~ %d 까지 입력\n", nSize);
				continue;
			}
			return intM;
		}
	}
}
