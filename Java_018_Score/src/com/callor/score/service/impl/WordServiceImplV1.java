package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {

	protected List<WordVO> wordList;
	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	}
	@Override
	public void loadWord() {
		String fileName = "src/com/callor/score/Word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				if(reader == null)break;
				
				String words[] = reader.split(":");
				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[0]);
				wordVO.setKorea(words[1]);
				wordList.add(wordVO);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewWord() {
		// TODO Auto-generated method stub

	}

}
