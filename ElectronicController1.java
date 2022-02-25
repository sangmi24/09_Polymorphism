package com.kh.chap01_poly.part02.electronic.controller;

import com.kh.chap01_poly.part02.electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02.electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02.electronic.model.vo.Tablet;

//다형성을 적용시키기 전
public class ElectronicController1 {

	//  용산 전자상가에 새로 차린 가게
	//  필드부
	//상자만 만들어놓은것
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 생성자부
	
	// 메소드부
	// 데스크탑 재고가 들어올 경우 데스크탑을 생성해주는 메소드
	//insert는 삽입하다 뜻
	//Desktop d  내가 만든 형태 객체 ,이름은 내가 짓기 마련 
	public void insert(Desktop d) {
		
		//Desktop d= new Desktop("삼성", "데스크탑",1200000,"Geforce 1070");
		//desk = new Desktop("삼성","데스크탑",1200000,"Geforce 1070");
		desk = d;		
	}
	// 노트북 재고가 들어올 경우 노트북을 생성해주는 메소드
	public void insert(NoteBook n) {  //오버로딩 : 아무리 메소드명이 같아도 매개변수가 달라서 공존 가능
		note = n;
	}
	
	// 테블릿 재고가 들어올 경우 태블릿을 생성해주는 메소드
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 반환형이 애초에 달라서 오버로디잉 불가!! (메소드명을 따로 지어줘야 함)
	// 각각의 물건을 실제로 보여주려고 리턴시켜주는 메소드들
	//Desktop와 desk가 같음을 봐야 한다. 그 자리에 들어가도 되나를 생각을 하는게 아니라 
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selTablet() {
		return tab;
	}
	
	
	
	
	
}







