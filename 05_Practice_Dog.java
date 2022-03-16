package practice1.model.vo;

public class Dog extends Animal  {
    
	//필드부
	public static final String PLACE="애견카페";
	//상수 클래스는  Static final이다!!! 
    private int weight;
	
    //생성자부
    public Dog() {
    	
    }
    public Dog(String name, String kinds,int weight) {
    	super(name,kinds);
    	this.weight=weight;	
    }
    //메소드부
   //상수클래스는 메소드를 만들지 않는다. 
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//부모클래스 오버라이딩 해서 구현부모의 toString()메소드 호출하여
	//리턴 받은 결과값 뒤에 ~ 합쳐서 출력. 
	@Override
	public void speak() {  // system.out.println으로 출력하니까 오류 안생김.. 왜지?
		System.out.println(super.toString()+"몸무게는 "+weight+"kg 입니다. "  ); 
	} //강아지 =>  이름 , 종류, 몸무게 
	
	
	
	
}
