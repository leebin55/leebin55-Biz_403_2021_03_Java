package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(90);
		scoreVO.setEng(80);
		
		System.out.println(scoreVO.toString());
		//이 메서드는 객체를 생성하면 자동으로 생성
		//com.callor.app.model.ScoreVO@26f0a63f
		//scoreVO라는 객체는 위의 com.~~model클래스를 통해만든 객체다
		// 뒤에 26~f heap메모리 여기에 저장되있다 : 주소
		//toString 다시 정의하지 않으면 저기 저com. ~~~ f 로 나옴
		//VO 클래스에 toString 정의하면 
		//ScoreVO [num=001, name=홍길동, kor=90, eng=80, math=80]
		
		
	}
}
