package com.kh.chap01_poly.part02.electronic.model.vo;

public class NoteBook extends Electronic  {

	    //�ʵ��
		private int usbPort;
		
		//�����ں�
		public NoteBook() {
			super();
		}

		public NoteBook(String brand, String name, int price,int usbPort) {
			super(brand,name,price);
			this.usbPort = usbPort;
		}
		 //�޼ҵ��
		public int getUsbPort() {
			return usbPort;
		}

		public void setUsbPort(int usbPort) {
			this.usbPort = usbPort;
		}

		@Override
		public String toString() {
			return "NoteBook [brand ="+ super.getBrand()+",name ="+super.getName()+",price ="+super.getPrice()
					+ ", usbPort=" + usbPort + "]";
		}
	    
	   
		
	
	
}
