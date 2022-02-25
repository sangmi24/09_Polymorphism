package com.kh.chap01_poly.part02.electronic.model.vo;

public class Desktop extends Electronic {

	//�ʵ��
	public static final String CPU = "intel";  //����ʵ�� ������ �����Ŷ� �����ںο� ����
	private String graphic;
	
	//�����ں�
	public Desktop() {
		super();
	}

	public Desktop(String brand, String name, int price, String graphic) {
		
	    super(brand,name,price);
		this.graphic = graphic;
	}
	
	//�޼ҵ��
	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	public String getCPU() {
		return CPU;
	}

	@Override
	public String toString() {//brand=" + brand + ", name=" + name + ", price=" + price + "
		
		return "Desktop [ brand ="+ super.getBrand()+",name ="+super.getName()
		 +",price ="+super.getPrice()+ ",CPU =" + CPU + ", graphic=" + graphic + "]";
		
	}
    
	
	
	
}
