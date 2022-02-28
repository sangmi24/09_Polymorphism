package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {

	//�ʵ��
	private String name; //�̸�
	private double weight; //������
	private int health; //�ǰ���
	
	//�����ں�
	public Person() {
		
	}
	public Person(String name, double weight, int health) {
		this.name=name;
		this.weight=weight;
		this.health=health;
	}
	//�޼ҵ��
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
     
	//�޼ҵ�� ����� ������ ���� : �Դ� ����, ���� �ڴ� ���� =>�߻�޼ҵ�
	//public abstract void eat();
	//public abstract void sleep();
	//�������̽����� �߻�޼ҵ忡�� ���Ǹ� �߱� ������ ���� ����
	//Basic �� ������ eat, sleep �޼ҵ带 Ȱ���غ���
	
	
	
	
	
}
