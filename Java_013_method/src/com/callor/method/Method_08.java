package com.callor.method;

import com.callor.method.service.NumberServiceV6;
/*
 * Method_08.main() 에서
 * 		NumberServiceV6 .intNum() 호출
 * 			InputService.intValue(String title) 호출
 *  				QUIT : return null;
 *  				아니면 : return 정수값
 *  	retNum 에 되돌려 받기
 *  		null이면 : return null
 *  		아니면 : 0 ~ 100 까지 인지 검사
 *  			아니면 : 다시 InputService.intValue(String title)
 *  					아니면 : return retNum
 *  retNum 에 되돌려 받아 화면에 출력
 */
public class Method_08 {

	public static void main(String[] args) {
		
		NumberServiceV6 nsV6 = new NumberServiceV6();
		
		Integer retNum = nsV6.inputNum();
		if(retNum == null ) {
			System.out.println("입력오류");
			
		}else {
		System.out.println("입력한 값 : " + retNum);
		}
	}
}
