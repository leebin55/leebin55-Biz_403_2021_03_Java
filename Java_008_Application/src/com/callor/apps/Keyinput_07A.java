package com.callor.apps;

import java.util.Random;
import java.util.Scanner;

public class Keyinput_07A {
	
	public static void main(String[] args) {
		Random rnd= new Random();
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		int intNum=0;
		System.out.println("1부터 20까지 정수를 입력하세요");
		num=rnd.nextInt(20)+1;
		while(true) {
			System.out.print("입력 >> ");
			intNum = scan.nextInt();
		}
		
	}

}
