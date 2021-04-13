package com.callor.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceV1Ex;

public class Const_2 {

	public static void main(String[] args) {
		
		
		ScoreService sService = new ScoreServiceV1Ex();
		
		ArrayList<String> strList1 = new ArrayList<String>();
		LinkedList<String> strList2 = new LinkedList<>();
		Vector<String> strList3 = new Vector<>();
		//이제 완전 타입이 다름
		
		//만든 객체 타입에 따라서 똑같은 메서드를 매개변수타입만 다르게하고
		//여러개 만듬
		//List가 부모 (Array,Linked,Vetor는 자식)
		//매개변수를 List로 하게되면 이렇게 여러개를 만들지 않아도
		strList1.add("대한민국");
		strList1.add("우리나라");
		

		strList2.add("3*4");
		strList2.add("3/4");
		

		strList1.add("홍길");
		strList1.add("우리");
		
		list(strList1);
		list(strList2);//매게변수타입이 달라서 오류
		//public static void list에 매개변수를 다르게 해주니 오류 안생김
		list(strList3);
			 
	}
	
	//ArrayList 내용전체를 console출력
	/*
	 * 여기에 있는 세개의 method 는 각각의 타입의 매개변수를 전달받아 연산수행
	 * 
	 * 세개의 method는 하는일이 똑같은코드
	 * 하지만 매개변수 type이 달라서 중복되는 코드를 작성
	 */
	public static void list(ArrayList<String> strList) {
		
		int nSize = strList.size();
		for(int i = 0; i <nSize ; i++) {
			System.out.println(strList.get(i));
			
		}
	}
public static void list(LinkedList<String> strList) {
		
		int nSize = strList.size();
		for(int i = 0; i <nSize ; i++) {
			System.out.println(strList.get(i));
			
		}
	}
public static void list(Vector<String> strList) {
	
	int nSize = strList.size();
	for(int i = 0; i <nSize ; i++) {
		System.out.println(strList.get(i));
		
	}
}
}
