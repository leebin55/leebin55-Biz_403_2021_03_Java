package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceV1Ex;

public class Const_01 {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스가 있는 클래스의 객체 생성
		 *   = 클래스를 선언(작성) 할 때 인터페이스 impl했다
		 *   
		 * 인터페이스를 사용하여 객체를 선언하고
		 * 		구현체 클래스의 성성자를 호출하여 객체를 생성, 초기화해야
		 * 
		 * 인터페이스는 생성자 메서드가 없음!!!!
		 */
		ScoreService sService = new ScoreServiceV1Ex();
		//ScoreService 는 인터페이스
		
		// <    다형성    >
		//List 인터페이스로 3개의 객체를 선언하고
		// 각각을 Array Linked Vector클래스를 사용하여 생성
		//
		//strList1, strList2, strList3 는
		// 각 ArrayList, LinkedList, Vector type 으로 
		//데이터 형이다름
		
		// but List interface type으로 선언되었기 때문에 method등의 연산을 
		//공용으로 상용할 수 잇음 
		
		//array 데이터 추가 삭제하는 경우 array 가 더 빠름 
		//Linked 순서대로 정렬되어있을때 더 빠름 하지만 순서대로 되었지 않을때 array 보다 느림
		//vetor 게임같은대에서 
		
		List<String> strList1 = new ArrayList<String>();
		List<String> strList2 = new LinkedList<>();
		List<String> strList3 = new Vector<>();
		
		strList1.add("대한민국");
		strList1.add("우리나라");
		

		strList2.add("3*4");
		strList2.add("3/4");
		

		strList1.add("홍길");
		strList1.add("우리");
		//리스트에 저장된 내용을 출력하는 method 호출하기
		list(strList1);
		list(strList2);
		list(strList3);
			 
	}
	
	//List 내용전체를 console에 출력
	
	/*
	 * 매개변수 type 을  List interface type 으로 선언한 method
	 * 
	 * 이 method는 List interface 의 자손이 ㄴ
	 * ArrayList LinkedList Vector클래스로 생성된
	 * 객체를 매개변수로 받아 연산수행 가능
	 * 
	 * >> 한개의 method로 다수 type의 값들을 연산수행 가능
	 */
	public static void list(List<String> strList) {
		//strList를 쭉 보여줌
		
		int nSize = strList.size();
		for(int i = 0; i <nSize ; i++) {
			System.out.println(strList.get(i));
			
		}
	}
}
