package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	//�ʵ��
	private int x;
	private int y;
	
		
	//�����ں�
	//�⺻	
	public Parent() {
		super();
	}
    //�ϼ�
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//�޼ҵ��
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + "]";
	}
	//������ �̿�� instanceof �����ڸ� �����
	public void printParent() {
		System.out.println("�� �θ��");
	}
	//������ �̿�� instanceof �����ڸ� �� �ʿ䰡 ����
	public void print() {
		System.out.println("�� �θ��");
	}
	
	
	
}
