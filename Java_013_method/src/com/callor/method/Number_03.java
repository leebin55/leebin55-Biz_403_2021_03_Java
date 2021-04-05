package com.callor.method;

import java.util.Scanner;

public class Number_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력");
		System.out.println("QUIT 는 종료");
		System.out.print(" >>  ");
		String strInput = scan.nextLine();
		
		//trim() : 문자열의 앞 , 뒤 white space를 제거 하는 method
		// 단, 중간의 빈칸은 제외
		/*
		 * strInput = strInput.trim(); >> trim() 붙여서 strInput에 withe spacd제거한 다음에
		 * strInput.equals("QUIT") >> "QUIT"와 비교
		 * 
		 * 입력된 문자열에 혹시 있을지 모를 white space를 제거하여 
		 * 입력문자열이 QUIT인가 검사
		 * 
		 * 객체의 chaining
		 */
		if(strInput.trim().equals("QUIT")){//strInput.equals("QUIT ")는 빈칸이 있으면 다른 문자 
			 
		}else {
		/*
		 * 예외처리
		 * 
		 * Integer.valueOf(문자열) 코드가 실행되는 동안
		 * NumberFormatException이 발생 >> 코드중단
		 * But , 
		 * 코드를 중단하지 않고, 사용자에게 메시지등을 전달하고 적절할 연산코드 추가하고
		 * 코드를 계속 진행하도록 하는 조치
		 * 
		 * 예외처리 코드는 개발자에게는 불필요한 코드를 추가하여 부담은 주는 것일 수 있지만
		 * 			적절한 예외처리를 해준 코드는 End User(실제 사용자)에게 불편함을 최소화하는 
		 * 			방법임
		 * End User에게 좋은 코드를 작성하는 개발자는 결국 좋은 개발자가된다.
		 */
			try {
				int intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {//catch 하나의 method /e라는 매개변수

				System.out.println("숫자가 아닌 갑을 입력");
				System.out.println("숫자 변환하는 동안 오류");
				//e.printStackTrace(); >> Exception이 발생하면 자동으로
				//						>>이 method실행되면 더이상 진행되지 않고 중단 
			}
		}
	}
}
