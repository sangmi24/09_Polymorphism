package com.kh.chap01_poly.part02.electronic.model.vo;

public class Desktop extends Electronic {

	//필드부
	public static final String CPU = "intel";  //상수필드라서 변하지 않을거라 생성자부에 없음
	private String graphic;
	
	//생성자부
	public Desktop() {
		super();
	}

	public Desktop(String brand, String name, int price, String graphic) {
		
	    super(brand,name,price);
		this.graphic = graphic;
	}
	
	//메소드부
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
