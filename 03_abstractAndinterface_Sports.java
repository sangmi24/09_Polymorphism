package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {

	
	//�ʵ��
	private int people; //�������� �����ϴ� ������ �� �� 
	
	
	//�����ں�
	public Sports() {
		
	}
	public Sports(int people) {
		this.people = people;
	}
	
	
	//�޼ҵ��
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people=people;
	}
	
	@Override
	public String toString() {
		return "people : "+people;
	}
	
	public abstract void rule();
	
	
	/*
	 * * ����ΰ� �������� �ʴ� �̿ϼ� �޼ҵ� == �߻�޼ҵ� 
	 * - ����ΰ� ���� �̿ϼ� �޼ҵ带 �����ϰ��� �Ѵٸ� abstract ��� ���� ��� �Ѵ�.
	 *  ��ó�� �������̵� �Ұǵ� �θ� �޼ҵ� ä�쳪..�ؼ� �߼��޼ҵ带 ���� ����
	 *  
	 * [ ǥ���� ]
	 * public abstract ��ȯ�� �޼ҵ��(�Ű�����=> ��������) ;
	 * 
	 * ���ǻ���
	 * ���࿡ ���� ���� �ۼ��ϰ� �ִ� Ŭ������ �޼ҵ�� �߿���
	 * abstract ��� Ű���尡 ���� �߻�޼ҵ尡 �ϳ��� ���ԵǴ� ����
	 * �� Ŭ������ �߻�Ŭ������ �Ǿ������. 
	 * => Ŭ������ �տ��� abstract�� �ٿ��� ��!
	 */
	
	
	
	
}
