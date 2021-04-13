package com.callor.score.model;

/*
 * 데이터를 담아서 정보처리를 수행할때 
 * 편리하게 데이터를 묶어서 관리하기 위한 클래스
 * 
 * VO 를 만드는 작업 : 데이터 모델링(설계)
 * 1. 추상화
 * 2. 정보은닉
 * 3. 캡슐화
 * 4. 재정의(Override)
 * 
 * 모델링 된 ScoreVO를 실제로 사용 할때는 객체로 생성하여 사용
 * ScoreVO scoreVO - new ScoreVO() 이렇게 객체로
 * 필요할 때마다 객체로 생성하고, 데이터를 Setter 하고 연산을 수행한 후
 * 데이터를 Getter 하는 방식으로 활용 
 * 
 * DB항목에서는 Entity 모델링 이라고 함 : 실제로 데이터가 저장
 * 모델링 된 Entity 를 data Tabled 로 생성하여 사용
 * 한 번 TABLE 을 생성하고 영구적으로 사용
 * 
 */

/* 
 * VO클래스에 숫자형변수를 선언할 때 
 * primitive 형이 아닌 wrapper 클래스 형으로 선언할때는 0으로 clear
 * 
 * 이러한 불편을 방지하기 위해 primitive형으로 만들기도 하지만 
 * null값을 취급하기 어려움
 */
public class ScoreVO {
	private String num;
	private String name;
	private Integer kor = 0;
	private Integer eng = 0;
	private Integer math = 0;

	/*
	 * VO클래스를 모델링하고 : 추상화 변수를 은닉 은닉된 변수에 접근하기 위해 getter setter method생성
	 * 
	 * getter 와 seeter를 생성하고 봤더니 총점 (total)과 평균(avg) 는 점수가 입력되면 항상 계산되어야 하는 항목 즉,
	 * 외부에서 이 변수에 값을 저장할 일이 별로 없을 것 같음 >> 이변수(total 과 avg) 변수를 없애고 setter method만 제거
	 * 이 변수들의 getter method 를 변경!! 어떻게?? 총점과 평균을 계산하여 return 할수 있도록
	 */

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKor() {
		return kor;
	}

	public void setKor(Integer kor) {
		this.kor = kor;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	/*
	 * < 캡슐화 > 외부에서 객체.getTotal() method호출하면 과목의 총점을 return 받을 수있음
	 * 
	 * 이 코드는 3과목 총점을 계산하고 계산된 결과는 return
	 * 
	 * BUT 외부에서는 실제 코드 어떻게 작동되는 지 몰라도 상관없이 getTotal() method는 총점결과를 return 한다는것을
	 * 알고있음
	 * 
	 * 이렇게 내부코드를 감추고(외부에 노출하지 않음) 기능을 수행하는 것 : 캡슐화
	 *
	 */
	public Integer getTotal() {
		Integer total = this.kor;
		total += this.eng;
		total += this.math;
		return total; // getTotal 을 요청할때마다 연산이 되서 값을 돌려줌
	}

	public Float getAvg() {
		// java style
		Float avg = (float) this.getTotal() / 3;
		// c언어 style
		avg = Float.valueOf(this.getTotal() / 3);
		return avg;

	}

	/*
	 * 재정의 Override
	 * 
	 * < toString >
	 * 
	 * Object 크래스에 정의 되어 있음 모든 클래스는 자동적으로 Object클래스를 상속받음
	 * 
	 * 따라서 ScoreVO 클래스에는 자동으로 toString() method가 있는 것처럼 동작
	 * 
	 * BUT, Object클래스에 정의된 toString() method는 사용하는데 의미 없음 >> 그래서 VO 객체의 변수에 담긴 값들을
	 * 문자열로 만들어 return 하는 코드로 다시 작성
	 *
	 * 이제 VO객체.toString() method를 호출하면 VO객체의 변수들에 담긴 값들이 출력
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", "
				+ "" + "name=" + name + ""
						+ "," + " kor=" + kor + ""
								+ ", " + "eng=" + eng + ""
										+ ","
				+ " math=" + math + ""
						+ ", total=" + this.getTotal() + ""
								+ "," + " avg=" + this.getAvg() + "]";
	}

}
