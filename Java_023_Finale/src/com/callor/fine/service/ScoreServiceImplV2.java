package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.model.ScoreVo;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVo>();
		scan = new Scanner(System.in);
	}
}
