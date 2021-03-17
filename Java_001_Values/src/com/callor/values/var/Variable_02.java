package com.callor.values.var;

public class Variable_02 {

	public static void main(String[] args) {
		
		// int = integer ==정수
		
		/* 
		 * 변수의 선언
		 * 변수는 사용(저장, 읽기)하기 전에
		 * 반드시 선언을 해야 한다.
		 * 
		 * 
		 * 선언키워드 변수명;
		 * 어떤 기억장소에 값을 저장할 수 있도록
		 * 예약하는 절차
		 */
		
		int numbers; //선언키워드 변수명;
		
		/* 
		 * 이미 선언된 변수이름은 같은 이름으로 또 다시 선언 할 수 없다.
		 * 한번 사용된 변수 이름은 다시 사용XXX 비슷한 이름으로 
		 */
		
		int num1 = 100; //100이라는 값을 저장하고 num1 이라고 이름을 선언
		int num2 = 200; //200이라는 값을 저장하고 num2 라고 이름을 선언
		//코드에서 변수의 값을 지정하려면 !!! 최초에 한번만 !!!!! 지정해야됨 (int....)
		
		num1 = 300 ;
		num2 = 400 ;// 위에 지정된 100과 200의 값이 없어지고 300과 400으로 바귐
		
		//지정된 장소에서 꺼내온다(X) =>>읽어온다(복사해온다)
		System.out.println( num1 + num2);//이미 저장되어 있는 num1, num2에서 값을 읽어온다
		System.out.println( num1 - num2);
		System.out.println( num1 * num2);
		System.out.println( num1 / num2);
		System.out.println( num1 % num2);
	
		//기억장소 2개
		//코드를 수정하기 용이
	
	
	}
}
