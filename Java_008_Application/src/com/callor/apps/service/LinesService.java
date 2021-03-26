package com.callor.apps.service;

public class LinesService {

	
	/*
	 * 누군가 LinesService.dLines(10)
	 * 		형식으로 호출을 하면
	 * " = " 문자열을 10개 생성하여
	 * 		return 
	 *  LinesService.sLine(20)
	 *   "-" 문자열을 20개 생성하여 return
	 */
	public static String dLines(int length) { //public static으로 시작 
												//메서드 만들고 그 안에 매개변수 
												//int length를 만듬
		
		String dLine ="";
				for(int i = 0; i <length ; i++) { //변수가 아니라 method
					dLine +="="; //만약 length가 5라면 : ====== 
				}
		return dLine;// dLine변수에 들어있는 값을 되돌려 줘라
		//생성되고 만들어지 ㄴdline에 담겨진 문자열을 호출하는 곳으로 보내라
		
	}
	
	public static String sLines(int length) {
		String sLine ="";
				for(int i = 0; i <length ; i++) {
					sLine +="-";
				}
		return sLine;
	}
}
