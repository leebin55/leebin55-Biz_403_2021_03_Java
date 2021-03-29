package com.callor.apps.model;
/* 
 * 주소록 관리를 위한 프로젝트를 수행하기 위해 주소록 데이터를 저장할 클래스 설계
 * 
 * 이름, 전화번호, 주소 , email, 관계 , 나이, 카카오톡ID, 인스타그램....
 * 
 * 
 * 추상화 단계(필요한것만 추려서 )
 * 이름, 전화번호, email, 나와의 관계,주소  
 */
/* 
 * 추상화 단계
 * 지금 만들고자 하는 프로젝트에서 어떤 데이터가 반드시 필요한가,도는 없어도 되는
 * 데이터는 무엇인가를 판단하여 간추려내는 작업
 */

/*
 * 객체를 저장하기 위한 설계도 역할 
 * VO 클래스 (Value Object : 데이터를 저장하는용도의 객체)
 *  Dto(Data Transfer Object)
 */
public class AddressVO {
	/* 
	 * 추상화 과정을 거쳐 간추려진 데이터를 저장할 변수 선언
	 */
	
	public String name; //String name 변수선언하고 접근제어자 필요(public)
	public String cellPhone;
	public String email;
	public String chain; 
	// String address; 객체에 접근 못함 public 써주기
	public String address;
	

}
