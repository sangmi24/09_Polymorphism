package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {

	//�ʵ�� - ���ο�� �߰� ���ϱ� ������ ���� ����
	//�����ں�
	public Baby() {
		
	}
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
	//�޼ҵ��
	@Override
	public String toString() {
		return super.toString();
	}
	//eat, sleep �޼ҵ� �������̵�
	@Override
	public void eat() {  //�ƱⰡ ���� �Դ´ٸ�?
		
		//������ 3 ����
		//super.setWeight(����������+3);
		super.setWeight(super.getWeight()+3);
		
		//�ǰ��� 1 ����
		//super.setHealth(�����ǰ���+1);
		super.setHealth(super.getHealth()+1);
		
	}
	@Override
	public void sleep() {
		
		//�ǰ��� 3 ����
		//super.setHealth(�ǰ���+3);
		super.setHealth(super.getHealth()+3);
		  
		
		
		
		
	}
	
	
	
	
}




