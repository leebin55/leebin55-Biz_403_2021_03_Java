package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceV1A {
	InputService isV1;
	List<ScoreVO> scoreList;

	public ScoreServiceV1A() {
		isV1 = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void createScore() {
		Integer intKor = 0;
		Integer intEng = 0;
		Integer intMath = 0;
		Integer sum = 0;

		while (true) {

			intKor = isV1.inputValue("국어", 0, 100);
			if (intKor == null) {
				this.printScore();
				break;
			}
			intEng = isV1.inputValue("영어", 0, 100);
			if (intEng == null) {
				this.printScore();
				break;
			}
			intMath = isV1.inputValue("수학", 0, 100);
			if (intMath == null) {
				this.printScore();
				break;
			}

			ScoreVO scVO = new ScoreVO();
			scVO.setKor(intKor);
			scVO.setEng(intEng);
			scVO.setMath(intMath);
			scoreList.add(scVO);

		}
		
	}

	public void printScore() {
		System.out.println();
		System.out.println("=".repeat(50));
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < scoreList.size(); i++) {
			ScoreVO scVO = scoreList.get(i);
			System.out.print(i + 1 + "\t");
			System.out.print(scVO.getKor() + "\t");
			System.out.print(scVO.getEng() + "\t");
			System.out.print(scVO.getMath() + "\t");
			System.out.print(scVO.getTotal() + "\t");
			System.out.print(scVO.getAvg() + "\n");

		}
		System.out.println("=".repeat(50));
	}
}
