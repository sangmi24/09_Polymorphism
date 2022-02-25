package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	//필드부
	private int x;
	private int y;
	
		
	//생성자부
	//기본	
	public Parent() {
		super();
	}
    //완성
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//메소드부
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
	//다형성 이용시 instanceof 연산자를 써야함
	public void printParent() {
		System.out.println("나 부모야");
	}
	//다형성 이용시 instanceof 연산자를 쓸 필요가 없음
	public void print() {
		System.out.println("나 부모야");
	}
	
	
	
}
