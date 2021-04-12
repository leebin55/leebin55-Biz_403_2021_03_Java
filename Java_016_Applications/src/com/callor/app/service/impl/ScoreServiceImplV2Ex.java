package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.Values;
import com.callor.app.model.ScoreVO;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

/*
 * selectMenu 는 그대로 사용
 * inputScore() 만 다시 작성
 */
public class ScoreServiceImplV2Ex extends ScoreServiceImplV2 {

	protected Scanner scan;
	protected InputService inService;
	protected List<ScoreVO> scoereList;
	protected String[] subjectList;
	protected Integer[] subScoreList;
	/*
	 * 과목명, 과목점수가 담긴 배열에 
	 */
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	//단 , vO클래스는 클래스 영역에 선언XXX : 똑같은 값 저장될 수도
	public ScoreServiceImplV2Ex() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		subjectList = new String[] {"국어","영어","수학"};
		subScoreList = new Integer[subjectList.length];//두배열 순서 바뀌면 안됨
	}
		
	@Override
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		// %03d 3칸을 만들고 공백을 0으로
	
		String strName = null;
		String strNum = null;
		while (true) {
			strNum = String.format("%03d", intNum);

			System.out.println(strNum + "학생의 이름 입력 (QUIT : 입력중단)");
			strName = scan.nextLine();
			if (strName.equals("")) {
				System.out.println("학생이름은 반드시 입력");
				continue;
			}
			break;
		}
		/*
		 * 각 과목의 점수를 입력받아 변수에 저장하기 귀찮으니 배열에
		 * 입력받을 과목명을 String배열에 선언하고 과목수 만큼 점수를 저장할
		 * 또다른 배열 선언
		 */
		//String[] subjects = {"국어","영어","수학"};
		//subjects 배열을 맴버변수 영역으로 이동 subgectList로
		//점수를 입력하는 곳에서 사용하시 위하여 과목명을 담을 배열을 선언했느느데
		//다른 메서드에서 사용할 거 같아서 클래스 영역으로 (멤버변수로 ) 이동
		//Integer[] intScore = new Integer[subjects.length];
		
		for(int i = 0; i < subjectList.length ; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if(subScoreList[i] == null){
				return;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(subScoreList[국어]);
		scoreVO.setEng(subScoreList[영어]);
		scoreVO.setMath(subScoreList[수학]);
		
		scoreVO.setKor(subScoreList[Values.국어]);
		scoreVO.setEng(subScoreList[Values.영어]);
		scoreVO.setMath(subScoreList[Values.수학]);
		
		//디버깅 코드 , VO에 담긴 데이터 확인
		System.out.println("=".repeat(50));
		System.out.println(scoreVO.toString());
		System.out.println("=".repeat(50));
		scoreList.add(scoreVO);
		
	}
	@Override
	public void printScore() {
		System.out.println("빛나라 고교 성적 리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t이름\t");
		for(int i = 0; i <subjectList.length;i++) {
			System.out.print(subjectList[i] + "\t");
		}
		System.out.println("총점\t평균\n");
		System.out.println("-".repeat(80));
		int nSize = scoreList.size();
		for(int j = 0 ;j <nSize ; j++) {
			ScoreVO vo = scoreList.get(j);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(80));
	}


}
