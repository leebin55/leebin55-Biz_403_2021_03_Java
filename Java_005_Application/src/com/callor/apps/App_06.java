package com.callor.apps;

public class App_06 {
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		int int5Man = 50000;
		int int1Man = 10000;
		int[] intChange = new int[10];
		intChange[0] = 3723560;
		for(int i = 0; i< 10; i++) {
			intNum[i] = intChange[i] / int5Man;
			intChange[i] = 3723560 % int5Man;
			
			intNum[++i] = intChange[i] /int1Man;
			intChange[++i] = intChange[i] /int1Man;
			
			
			
			
		}
		
	}
	
}
