package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceImplV1;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	InputService inSer;
	Scanner scan;
	List<ScoreVO> scoreList;
	String[] subs;

	public ScoreServiceImplV2() {
		inSer = new InputServiceImplV1();
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subs = new String[] { "국어", "영어", "수학" };

	}

	@Override
	public void inputScore() {
		//
		Integer intNum = inSer.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("2021%03d",intNum);
		String strName = null;
		while (true) {
			System.out.println(intNum + " 학생의 학번을 입력하세요");
			System.out.print(" >>  ");
			strName = scan.nextLine();
			if (strName.trim().equals("QUIT")) {
				return;
			}
			if (strName.trim().equals("")) {
				System.out.println("이름은 꼭 입력해야 합니다.");
				continue;
			}
			break;
		}
		Integer[] scores = new Integer[subs.length];

		System.out.println(strName + " 학생의 성적입력");
		for (int i = 0; i < subs.length; i++) {
			scores[i] = inSer.inputValue(subs[i], 0, 100);
			if (scores[i] == null) {
				return;
			}
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setKor(scores[1]);
		scoreVO.setEng(scores[2]);
		scoreVO.setMath(scores[3]);
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		
		scoreList.add(scoreVO);
	}

}
