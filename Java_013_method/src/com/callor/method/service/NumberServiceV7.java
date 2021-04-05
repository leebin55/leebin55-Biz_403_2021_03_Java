/*
 * protected InputService inSer; String[] strSubject;
 * 
 * public NumberServiceV7() { inSer = new InputService(); strSubject = new
 * String[] { "국어", "영어", "수학", "과학", "국사" }; }
 * 
 * public Integer inputScore(String[] strSubject) {
 * 
 * Integer retNum = 0;;
 * 
 * for (int i = 0; i < strSubject.length; i++) { while (true) { retNum =
 * inSer.inputValue(strSubject[i]); if (retNum == null) { return null; } else if
 * (retNum < 0 || retNum > 100) { System.out.println("입력범위 오류 0~ 100"); } else {
 * return retNum;
 * 
 * } } } }
 */
package com.callor.method.service;

public class NumberServiceV7 {
	protected InputService inSer;
	String[] strSubject;

	public NumberServiceV7() {
		inSer = new InputService();
		strSubject = new String[] { "국어", "영어", "수학", "과학", "국사" };
	}

	public Integer inputScore(String strSub) {
		Integer retNum = 0;

		for (int i = 0; i < strSubject.length; i++) {
			while (true) {
				retNum = inSer.inputValue(strSubject[i]);
				if (retNum == null) {
					return null;
				} else if (retNum < 0 || retNum > 100) {
					System.out.println("입력범위 오류 0~ 100");
					continue;
				} else {
					return retNum;
				}

			}
		}
	}
}
