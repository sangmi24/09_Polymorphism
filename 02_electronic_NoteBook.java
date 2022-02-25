package com.kh.chap01_poly.part02.electronic.model.vo;

public class NoteBook extends Electronic  {

	    //鞘靛何
		private int usbPort;
		
		//积己磊何
		public NoteBook() {
			super();
		}

		public NoteBook(String brand, String name, int price,int usbPort) {
			super(brand,name,price);
			this.usbPort = usbPort;
		}
		 //皋家靛何
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
