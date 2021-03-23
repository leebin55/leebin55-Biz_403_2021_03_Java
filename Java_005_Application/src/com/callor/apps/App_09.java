package com.callor.apps;

import java.text.DecimalFormat;

public class App_09 {

	/*DecimalFormat
	 * 
	 * format(숫자) 명령을 수행하면 
	 * 숫자를 3자리 구분기호를 부착하여
	 * 문자열로 만들어줌
	 */
	public static void main(String[] args) {

		int intNum = 3294092;
		DecimalFormat strForm = new DecimalFormat("###,###");

		String str = strForm.format(intNum);
		System.out.println(str);
		
		System.out.println(strForm.format(374892374));
	}

}
