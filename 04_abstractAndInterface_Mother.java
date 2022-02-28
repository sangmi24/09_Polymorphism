package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

                                  // 구현하겠다. 라는 뜻
public class Mother extends Person implements Basic {

	//필드부
	private String babyBirth;  // 아기의 탄생여부 : 출산, 입양, 없음
	
	//생성자부
	public Mother() {
		
	}
	public Mother(String name, double weight, int health, String babyBirth) {
		
	   super(name,weight,health);
	   this.babyBirth= babyBirth;
	}
	
	//메소드부
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	//오버라이딩이 강제? x (있어도 되고 없어도 됨)
	@Override
	public String toString() {
		return super.toString() + ", babyBirth : "+babyBirth;
	}
	//오버라이딩이 강제적 => 애초에 미완성된 상태로 상속받았으니까
	//상속 받은 메소드에서는 예약어는  생략 abstract
	@Override
	public void eat() { //엄마가 밥을 먹는다면?
		
		//몸무게를 기존의 몸무게에 10 증가
		//super.weight= super.weight+10;
		super.setWeight(super.getWeight()+10);
		//수정할 몸무게 == 기존 몸무게 +10;
		
		// 건강도를 기존의 건강도에 10 감소
	    //super.health = super.health -10;
		//super.setHealth(기존의 건강도값-10);
		super.setHealth(super.getHealth()-10);
		//수정할 건강도 == 기존의 건강도 -10;	
	}
	@Override
	public void sleep() {  //엄마가 잠을 잔다면?
		
		//건강도 10 증가
		//super.health = super.health + 10;
		//super.setHealth(기존건강도 +10);
		super.setHealth(super.getHealth() +10);
		
		
		
		
		
	}
	
	
	
	
}






