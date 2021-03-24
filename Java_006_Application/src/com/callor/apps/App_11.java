package com.callor.apps;

import java.util.Arrays;
import java.util.Random;

public class App_11 {

	public static void main(String[] args) {
		
		//main() method의 멤버변수
		//method변수
		//정수 배열 45개 선언
		int[] intNums = new int[45];
		
		//1부터 45까지를 배열에 저장 나온결과값은 중복되지 않음
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 1;//intNums[i]에 순서대로 1부터 45까지
		}
		//Random 클래스를 사용하여
		// 0부터 44까지 임의 숫자 2개를 만들고
		//그 숫자를 index 로 하여 무조건 배열의 값을 
		//서로 교환했다.
		Random rnd = new Random();
		for(int i = 0 ; i <1000 ; i++) {
			
			int index1 = rnd.nextInt(intNums.length);
			int index2 = rnd.nextInt(intNums.length);
			
			int temp = intNums[index1];
			intNums[index1] = intNums[index2];
			intNums[index2] =temp;
			
		}
		System.out.println(Arrays.toString(intNums));
		System.out.println("===================================");
		
		//앞에서 6개만 보여주기
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(intNums[i] + "\t");
		}
	}
}
