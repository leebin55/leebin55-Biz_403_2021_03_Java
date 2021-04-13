package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoerServiceV2Ex extends ScoreServiceImplV2 {

	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected String[] subjectList;
	protected Integer[] subScoreList;

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoerServiceV2Ex() {

		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] { "국어", "영어", "수학" };
		subScoreList = new Integer[subjectList.length];
	}

	@Override
	public void inputScore() {
		Integer intNum = inSer.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("%03d", intNum);
		String strName = null;
		while (true) {
			System.out.println();
			strName = scan.nextLine();
			if (strName == "QUIT") {
				return;

			}

			if (strNum == "") {
				System.out.println("학생이름은 필수항목!!");
				continue;
			}
			break;
		}
		for (int i = 0; i < subjectList.length; i++) {
			String subject = subjectList[i] + "점수";
			Integer intScore = inSer.inputValue(subject, 0, 100);
			if (intScore == null) {
				return;
			}
			subScoreList[i] = intScore;
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		scoreList.add(scoreVO);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}
}
