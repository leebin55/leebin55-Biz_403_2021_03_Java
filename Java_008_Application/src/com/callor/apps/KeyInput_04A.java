package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		//배열을 이용하면 for를 이용해 반복문을 써
		//쉽게 할수있다
			System.out.println("정수 5개를 입력합니다.");
		for(int i = 0; i < nums.length; i++) {
		int num = i + 1;
		System.out.printf("정수 %d 번 >> ", num);
		nums[i] = scan.nextInt();
		}
		System.out.println(LinesService.dLines(30));
		System.out.print("입력한 숫자들 : ");
		System.out.println(Arrays.toString(nums));  //Arrays.toString() 리스트
		System.out.println(LinesService.sLines(30));
		
		int intSum = 0;
		for(int i = 0; i < nums.length ; i++) {
			intSum += nums[i];
		}
		System.out.printf("리스트 합계 : %d\n",intSum);
		System.out.println(LinesService.dLines(30));
		
	}
}
