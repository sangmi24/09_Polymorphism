package com.kh.chap01_poly.part02.electronic.controller;

import com.kh.chap01_poly.part02.electronic.model.vo.Electronic;

//다형성을 적용시켰을 때
public class ElectronicController2 {

	//용산 전자상가에 새로 차린 가게
	//창고 
	//필드부
	private Electronic[] elec = new Electronic[3]; //필드를 초기화
	
	//생성자부
	
	//메소드부
	//물건이 납품 될때마다 창고에 물건 하나하나씩 차곡 채워넣기
	//Electronic any, int index 순서는 상관없음
	public void insert(Electronic any, int index) {
		elec[index] =any;  //부모 = 자식;
	}
	
	//고객이 원하는 물건을 꺼내주기(창고로부터) => 물건 하나꺼내주기
	public Electronic select(int index) {
		return elec[index];
	}
	
	//고객이 원하는 물건이 전부 다 일때 => 창고 째로 넘겨주자
	public Electronic[] select() {
		return elec;  //주소값 담김.. 실물 담기는게 아님 
	}
	
	/*
	 * *메소드의 구조
	 * 입력값 -> 수행할 내용-> 결과값 
	 * 
	 * 입력값 : int, String, double, char, boolean,byte,short,float,long,객체,배열,...
	 * 출력값 : void, int, String, double, char,boolean,short,float,long,객체,배열,...
	 * 
	 * => 메인메소드를 보면 이해가 갈것...
	 */
	
	
	
	
	
	
	
}
