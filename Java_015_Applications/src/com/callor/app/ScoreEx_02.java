package com.callor.app;
//중간에 놓침...
import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.yublee.standard.InputService;
import com.yublee.standard.impl.InputServiceImplV1;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
	
	InputService inService = new InputServiceImplV1();
	List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
	
	ScoreVO scoreVO = new ScoreVO();
	scoreVO.setNum("001");
	scoreVO.setName("홍길동");
	scoreVO.setKor(inService.inputValue("국어",0,100));
	scoreVO.setEng(inService.inputValue("영어",0,100));
	scoreVO.setMath(inService.inputValue("수학",0,100));
	scoreList.add(scoreVO);
	
	/*
	 * 
	 * *********************아주 중요*************************
	 * VO객체에 데이터를 저장하고 List 에 추가하려고 하면 먼저 
	 * VO 객체를 다시 생성해 주어야 한다.
	 */
	scoreVO = new ScoreVO(); // scoreVO 꼭 다시 만들어서!!!!!!!!!
	
	scoreVO.setNum("002");
	scoreVO.setName("성춘향");
	scoreVO.setKor(inService.inputValue("국어",0,100));
	scoreVO.setEng(inService.inputValue("영어",0,100));
	scoreVO.setMath(inService.inputValue("수학",0,100));
	scoreList.add(scoreVO);
	
	System.out.println(scoreVO.toString());
	/*
	 * List의 toString() 은 
	 * List 가 포함하고 있는 데이터 (여기서는 scoreVO)의 
	 * 전체 리스트의 데이터를 확인하는 용도로 재정의 되어 있음
	 * 이때 반드시 VO클래스의 toString() 도 재정의 되어 있어야 한다.
	 * 
	 * toString 재정의 안되있으면 주소로 출력됨
	 */
	}
}
