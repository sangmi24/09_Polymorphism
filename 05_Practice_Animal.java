package practice1.model.vo;

public abstract class Animal {
   
	//�ʵ��
	private String name;
	private String kinds;
	
	//�����ں�
	protected Animal() {		
	};
	
	protected Animal(String name, String kinds) {
		this.name=name;
		this.kinds=kinds;
	}
	//�޼ҵ��
	public String toString() {
		return "���� �̸��� "+name+"�̰�, ������ "+kinds+"�Դϴ�. ";
	}
	public abstract void speak();
	
	
	
	
	
}
