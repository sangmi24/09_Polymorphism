package practice1.model.vo;

public class Dog extends Animal  {
    
	//�ʵ��
	public static final String PLACE="�ְ�ī��";
	//��� Ŭ������  Static final�̴�!!! 
    private int weight;
	
    //�����ں�
    public Dog() {
    	
    }
    public Dog(String name, String kinds,int weight) {
    	super(name,kinds);
    	this.weight=weight;	
    }
    //�޼ҵ��
   //���Ŭ������ �޼ҵ带 ������ �ʴ´�. 
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//�θ�Ŭ���� �������̵� �ؼ� �����θ��� toString()�޼ҵ� ȣ���Ͽ�
	//���� ���� ����� �ڿ� ~ ���ļ� ���. 
	@Override
	public void speak() {  // system.out.println���� ����ϴϱ� ���� �Ȼ���.. ����?
		System.out.println(super.toString()+"�����Դ� "+weight+"kg �Դϴ�. "  ); 
	} //������ =>  �̸� , ����, ������ 
	
	
	
	
}
