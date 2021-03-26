package com.callor.apps.service;

public class TimesServiceV1_a2 {
	int[] intNums;
//	int intTimes;

	public TimesServiceV1_a2() { // 생성자
		intNums = new int[8];
		// intTimes = 0; 굳이 안만들어도
	}
	/* 
	 * 배열은총 8개
	 * 배열에 저장할 값은 2~~???
	 * 
	 */

	public void makeTimes() {
		for (int i = 0; i < intNums.length; i++) {
			int num = i + 2;
			
			intNums[i]= num;

		}

	}
	public void printTimes() {
		for(int i = 0; i <intNums.length ;i++) {
			
			//method 에 return ?? 명령문이 있으면 
			//변수 = method() 형식으로 코드를 작성하고
			//method 가 return 해준 결과값을
			//변수에 저장할수 있다.
			System.out.println(LinesService.dLines(50));
			System.out.printf("%d 단 구구단\n",intNums[i]);
			System.out.println(LinesService.sLines(50));
			
			for(int j = 2; j < 10 ; j++) {
				System.out.printf("%d x %d = %d", intNums[i],j,intNums[i]*j);
			}
		}
	}
	

}
