package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {

	//필드부 - 새로운걸 추가 안하기 때문에 생략 가능
	//생성자부
	public Baby() {
		
	}
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
	//메소드부
	@Override
	public String toString() {
		return super.toString();
	}
	//eat, sleep 메소드 오버라이딩
	@Override
	public void eat() {  //아기가 밥을 먹는다면?
		
		//몸무게 3 증가
		//super.setWeight(기존몸무게+3);
		super.setWeight(super.getWeight()+3);
		
		//건강도 1 증가
		//super.setHealth(기존건강도+1);
		super.setHealth(super.getHealth()+1);
		
	}
	@Override
	public void sleep() {
		
		//건강도 3 증가
		//super.setHealth(건강도+3);
		super.setHealth(super.getHealth()+3);
		  
		
		
		
		
	}
	
	
	
	
}




