package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

                                  // �����ϰڴ�. ��� ��
public class Mother extends Person implements Basic {

	//�ʵ��
	private String babyBirth;  // �Ʊ��� ź������ : ���, �Ծ�, ����
	
	//�����ں�
	public Mother() {
		
	}
	public Mother(String name, double weight, int health, String babyBirth) {
		
	   super(name,weight,health);
	   this.babyBirth= babyBirth;
	}
	
	//�޼ҵ��
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	//�������̵��� ����? x (�־ �ǰ� ��� ��)
	@Override
	public String toString() {
		return super.toString() + ", babyBirth : "+babyBirth;
	}
	//�������̵��� ������ => ���ʿ� �̿ϼ��� ���·� ��ӹ޾����ϱ�
	//��� ���� �޼ҵ忡���� ������  ���� abstract
	@Override
	public void eat() { //������ ���� �Դ´ٸ�?
		
		//�����Ը� ������ �����Կ� 10 ����
		//super.weight= super.weight+10;
		super.setWeight(super.getWeight()+10);
		//������ ������ == ���� ������ +10;
		
		// �ǰ����� ������ �ǰ����� 10 ����
	    //super.health = super.health -10;
		//super.setHealth(������ �ǰ�����-10);
		super.setHealth(super.getHealth()-10);
		//������ �ǰ��� == ������ �ǰ��� -10;	
	}
	@Override
	public void sleep() {  //������ ���� �ܴٸ�?
		
		//�ǰ��� 10 ����
		//super.health = super.health + 10;
		//super.setHealth(�����ǰ��� +10);
		super.setHealth(super.getHealth() +10);
		
		
		
		
		
	}
	
	
	
	
}






