package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
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
		String strNum = null;
		while (true) {
			Integer intNum = inSer.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			strNum = String.format("2021%03d", intNum);
			int i = 0;
			for (i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				if (strNum.equals(vo.getNum())) {// 같지 않을때는 계속 for문을 못빠져 나오고
					// i++ 로 i 값이 1씩 증가
					break;
				}
				// i 는 scoreList.size() 보다 1이 작음
			}
			// 만약 strNum 가 scoreList에 존재하는 값이 없다면 for문을
			// scoreList.size()만큼 반복
			// for 문이 끝난 i 의 값은 scoreList.size()
			if (i < scoreList.size()) {
				System.out.println("이미 존재하는 학번입니다.");
				continue;
			}
			break;
		}

		String strName = null;
		while (true) {
			System.out.println(strNum + " 번 학생의 이름을 입력하세요");
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
		scoreVO.setKor(scores[0]);
		scoreVO.setEng(scores[1]);
		scoreVO.setMath(scores[2]);
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);

		scoreList.add(scoreVO);
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n",vo.getAvg());
		}
		System.out.println("=".repeat(80));
	}// end printScore()

	@Override
	public void saveScore() {

		String fileName = null;
		while (true) {
			System.out.println("저장할 파일 이름을 입력");
			System.out.print(" >>  ");
			fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println(" 파일 이름은 반드시 입력!!");
				continue;
			}
			break;
		}
		String strFileName = "src/com/callor/score/"+fileName ;
		FileWriter fileWriter= null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0; i < nSize ; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			
		}
	}

}
