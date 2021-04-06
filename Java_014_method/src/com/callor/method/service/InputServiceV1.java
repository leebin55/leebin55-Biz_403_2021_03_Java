package com.callor.method.service;

import java.util.Scanner;

/*
 * Scanner 클래스는 입력 자원을 연동하여 입력장치로부터 값을 입력받기 위한 클래스
 *  이 클래스는 컴퓨터 자원을 사용하는 관리가 매우 엄격하게 필요한 클래스
 *  사용하는 방법에 따라, 오류발생 또는 시스템 멈춤 현상까지 발생할 수 있음
 *  이러한 클래스는 사용할 때 주의 필요
 *  
 *   > Scanner 클래스는 main() method가 아닌 Service 등의 클래스에서 사용할 때는 
 *   클래스 영역에 선언
 *   클래스의 생성자에서 생성(초기화)하는 것이 좋음
 *   
 *   유효성검사와 값을 입력받는 method분리
 * 
 */
public class InputServiceV1 {

	protected Scanner scan;
	/*
	 * String title 매개변수를 받고
	 */

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	/*
	 * 문자열, 정수, 정수 매개변수를 갖는 method
	 * 
	 * 문자열 과 범위 값을 전달받아 prompt문자열 생성
	 * inputVAlue(String title) method 호출하여 값을 입력 받고
	 * return 된 값에 따라 
	 * 				null : 그냥 return
	 * 				정수값 : 유효성 검사 (범위 안의 값인지) 
	 * 			범위 벗어나면 다시 입력 반복
	 */
	public Integer inputValue(String title, int start, int end) {
		// TODO 유효성 검사까지

		// title 변수값을 "새우깡( 0 ~ 100)" 로 다시 생성
		title = String.format("%s (%d ~ %d)", title, start, end);
		while (true) {

			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			} else if (retNum < start || retNum > end) {
				System.out.printf("입력값은 범위 : %d ~ %d 이여야 합니다.\n", start, end);
				continue;
			}
			return retNum;
		}

	}

	/* 
	 * String title 매개변수를 받고
	 * 정수값이나 QUIT가 입력됫는지 확인받고
	 * 잘못입력됬으면 확인만  하는 method
	 */
	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요 (QUIT : 입력중단)");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			Integer num = null;
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				try {
					num = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("정수와 QUIT 만 !!!!!");
					continue;
				}
				return num;
			}
			// return null;
		}
	}
}
