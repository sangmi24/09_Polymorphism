package com.kh.chap01_poly.part02.electronic.model.vo;

public class Tablet extends Electronic {
   
	//�ʵ��
	private boolean penFlag;
	
	//�����ں�
	public Tablet() {
		super();
	}

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand,name,price);
		this.penFlag = penFlag;
	}
	
	//�޼ҵ��
	public boolean isPenFlag() {  //���ʻ� boolean���� �������� getter�� isxxx�� ���´�.
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return "Tablet [brand ="+ super.getBrand()+",name ="+super.getName()+",price ="+super.getPrice() 
				+ "   penFlag=" + penFlag + "]";
	}
    
	
	
	
	
	
}
