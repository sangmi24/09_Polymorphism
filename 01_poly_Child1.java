package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {

	
	//�ʵ��
	private int z;

	//�����ں�
	public Child1() {
		super();
	}
		
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	//�޼ҵ��
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Child1 [ x=" +super.getX()+ ", y="+super.getY()+", z=" + z + "]";
	}
	
	public void printChild1() {
	 System.out.println("�� ù��° �ڽ��̾�");
	}
	
	@Override
	public void print() {
		System.out.println("�� ù��° �ڽ��̾�");
	}
	

	
	
	
	
	

}
