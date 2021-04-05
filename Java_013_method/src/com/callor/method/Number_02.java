package com.callor.method;

public class Number_02 {

	public static void main(String[] args) {
		
		String strNum1 = "100";
		String strNum2 = "100.0";
		
		// valueOf 는 클래스 방식으로 변환
		int intNum1 = Integer.parseInt(strNum1); //primitive 방식
		float floatNum2 =Float.parseFloat(strNum2);
		/*
		 * 데이터를 단독으로 처리할때는 큰 문제가 없지만
		 * 파일에 저장, 파일에서 읽기, 네트워크(인터넷)등을 통하여 전송(공유) 등으로
		 * 데이터가 컴퓨터와 컴퓨터간에 이동할때 데이터를 효율적이고, 오류가 나지않도록 
		 * 이동하는 다양한 방법 존재
		 * 
		 *  - 여러가지 방법이 취하는 많은 공통된 부분에 모든 데이터를 문자열화 하여 전송
		 * 		숫자, 문자, 특수기호 등을 모두 문자열 (ASCII 코드) 로 전송
		 * 		받는 곳에서 사용전 적절한 type으로 변경하여 사용
		 * 
		 * Java에서는 WrapperClass.parse*() method나
		 * 			  WrapperClass.valueOf() method사용하여 문자열형 숫자를 숫자 값으로 변환
		 * 
		 * 이 과정에서 숫자값으로 변환할 수 없는 문자열이 섞여 있는 경우
		 * 				> NumberFormatException발생
		 */
		intNum1 = Integer.valueOf("100");
		intNum1 = Integer.valueOf(30 + "");// "30" 과 같음>>오류발생 하지 않음
		intNum1 = Integer.valueOf("" + 30);//오류발생하지 않음
		intNum1 = Integer.valueOf("");//오류

		//숫자를 제외한 나머지는 exception 이 발생
		intNum1 = Integer.valueOf("100" + " ");//"" 안에 빈칸포함 > 오류
		intNum1 = Integer.valueOf(" 100");//특히 빈칸이 포함되는 경우
		intNum1 = Integer.valueOf("100 ");
		intNum1 = Integer.valueOf("100 00");
		intNum1 = Integer.valueOf("A100");
		intNum1 = Integer.valueOf("100A");
		intNum1 = Integer.valueOf("100*");
		intNum1 = Integer.valueOf("100*100");
		
		//"" 은 null 과 유사
		//but, 
		//Java에서는 "" 과 null 을 같은 값으로 취급하지않음!!
		//밑에 둘다 exception 일으킴
		intNum1 = Integer.valueOf("");
		intNum1 = Integer.valueOf(null);
		
	}
}
