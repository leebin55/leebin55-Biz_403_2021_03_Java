package com.callor.apps.model;

/*
 * ScoreVO 클래스 성언
 * ScoreVO 클래스에는 5개의 변수가 포함되어 있고 
 * 이 5개의 변수는 반드시 ScoreVO 클래스를 객체로 선언한 후 사용할 수 있음
 */
public class ScoreVO {
	
	/* 
	 * 현재 ScoreVO클래스에는 7개의 변수와 2개의 method가 설계되어 있는 상태
	 * 이 클래스를 사용하여 만들어진 객체에는
	 * 
	 * 7개의 변수와 2개의 method가 포함된 상태로 완성됨
	 * 
	 * !! 한 번 객체로 생성이 되면, 내부의 변수들은 절대 다른 데이터와 
	 * 혼동 되거나 하지 않음.!! =>한번 홍길동이란 객체로 생성이 되면 홍길동.kor = 값;처럼
	 * 
	 */

	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	/*
	 * kor,eng, math변수는 main() 메서드에서 사용자에 의해 값을 저장하기 위한 변수
	 * => 어디에서든지 저장 읽기가 가능한 상태이여야 하므로 
	 * "public"
	 * 
	 * total, avg 는 3과목의 점수를 사용하여 연산한 후 연산 결과를 저장하기 위한 변수
	 * => public 으로 선언을 해두면 실제 계산된 결과와 상관없이 임의의 값을 저장할 수 있음 
	 * =>평균 값이 잘못계산되는 결과 발생
	 * =>total,avg변수를 임의로 수정(저장)하지 못하도록 막는 장치 필요함
	 * => "private"
	 * 
	 * VO클래스의 맴버변수를 private 선언하면 다른곳에서 객체를 통해 (점연결 연산자를 통래) 직접
	 * 접근 불가능
	 * 
	 * total , avg변수에 담긴 값을 객체를 통해 읽기 하기 위해 getTotal(), getAvg() 메서드를 만들어둠
	 * 
	 * total 과 avg변수는 저장은 되지않고 getTotal() ,getAvg() 메서드를 통해서만 읽기만 가능!!!
	 * 
	 */
	public int total;//접근제어자 써야만!!!
	public float avg; //7개의 변수만 선언된 클래스
	//접근제어자가 public으로 되어있어 누구가 접근가능 => 위험함 
	//ScoreEx파일에서 홍길동.total = 900; 을 입력하면 평균이 변함
	
	
	public int getTotal() {
		this.total =  this.kor + this.eng + this.math;
		return this.total;
	}
	public float getAvg() {
		//int intTotal = this.getTotal();//메소드가 리턴해준 값을 담고
		int intTotal = this.total;
		float floatAvg =(float)intTotal /3;
		
		return floatAvg;//getTotal을 호출해서 
	}
}
