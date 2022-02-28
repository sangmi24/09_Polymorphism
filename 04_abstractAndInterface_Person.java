package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {

	//필드부
	private String name; //이름
	private double weight; //몸무게
	private int health; //건강도
	
	//생성자부
	public Person() {
		
	}
	public Person(String name, double weight, int health) {
		this.name=name;
		this.weight=weight;
		this.health=health;
	}
	//메소드부
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "Person name: " + name + ", weight: " + weight + ", health: " + health ;
	}
     
	//메소드로 사람의 행위를 정의 : 먹는 행위, 잠을 자는 행위 =>추상메소드
	//public abstract void eat();
	//public abstract void sleep();
	//인터페이스에서 추상메소드에서 정의를 했기 때문에 생략 가능
	//Basic 에 만들어둔 eat, sleep 메소드를 활용해볼것
	
	
	
	
	
}
