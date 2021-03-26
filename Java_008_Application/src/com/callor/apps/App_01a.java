package com.callor.apps;
import com.callor.apps.service.TimesServiceV1_a;

public class App_01a {

	public static void main(String[] args) {
		
		TimesServiceV1_a tsV1 = new TimesServiceV1_a();
		
		tsV1.makeTimes();
		tsV1.printTimes();
	}
}
