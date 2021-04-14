package com.callor.score.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogServiceEx_01 {

	public static void log(String msg){
		
		String fileName = "C:/Temp/score1.log";
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			Date date = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			// format 함수를 이용해 원하는 형식을 만들수 있음
			 
			String today = sd.format(date);
			
			out.println(today);
			out.print("Exception : " + msg);
			
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
