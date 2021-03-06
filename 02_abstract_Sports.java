package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {

	
	//필드부
	private int people; //스포츠에 참여하는 선수의 명 수 
	
	
	//생성자부
	public Sports() {
		
	}
	public Sports(int people) {
		this.people = people;
	}
	
	
	//메소드부
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people=people;
	}
	
	@Override
	public String toString() {
		return "people : "+people;
	}
	
	public abstract void rule();
	
	
	/*
	 * * 몸통부가 존재하지 않는 미완성 메소드 == 추상메소드 
	 * - 몸통부가 없는 미완성 메소드를 정의하고자 한다면 abstract 라는 예약어를 써야 한다.
	 *  어처피 오버라이딩 할건데 부모 메소드 채우나..해서 추성메소드를 만든 이유
	 *  
	 * [ 표현법 ]
	 * public abstract 반환형 메소드명(매개변수=> 생략가능) ;
	 * 
	 * 주의사항
	 * 만약에 내가 지금 작성하고 있는 클래스의 메소드들 중에서
	 * abstract 라는 키워드가 붙은 추상메소드가 하나라도 포함되는 순간
	 * 그 클래스도 추상클래스가 되어버린다. 
	 * => 클래스명 앞에도 abstract를 붙여야 함!
	 */
	
	
	
	
}
