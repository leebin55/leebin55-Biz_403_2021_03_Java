package com.callor.app;

public class ToString_01 {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		
		Integer num1 = 30;
		System.out.println(num1.toString());//30 그대로 나옴
		//Integer는 toString 을 재정의 함
		
		System.out.println(30 + "");// 30을 문자열로 바꾸는 코드
		//원래 이코드는 밑에처럼
		//자동으로 컴퓨터는 밑에 코드처럼 수행
		System.out.println(Integer.toString(30));
		
		/* 
		 * 정수형 배열 int / Integer 형으로
		 * toString 결과 다른 값으로 다옴
		 */
		int[] nums = new int[2];
		nums[0] = 100;
		nums[1] =200;
		System.out.println(nums.toString());
		
		Integer[] nums1 = new Integer[2];
		nums1[0] = 100;
		nums1[1] = 200;
		System.out.println(nums1.toString());
		
	}
}
