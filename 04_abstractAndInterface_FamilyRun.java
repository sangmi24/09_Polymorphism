package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {
		
		//인터페이스 적용 전 그냥 일반 추상클래스만으로 활용 예시
//      // 객체 생성 테스트
//	  //Person p = new Person(); // 추상클래스는 미완성된 상태라서 객체 생성이 안됨
//		
//	  // 다형성 활용 => 선언은 가능, 자식객체를 담겠다.
//		Person p1 = new Mother("김엄마",50, 70,"출산");  //초기화까지 해준거
//		Person p2 = new Baby("김응애", 3.5 , 70);
//		
//		 System.out.println(p1 /* .toString() */);
//		 System.out.println(p2);
//		
//		p1.eat(); // 엄마: 몸무게+10 , 건강도 -10
//		p1.sleep(); // 엄마 : 건강도 +10
//		
//		p2.eat(); // 애기 : 몸무게+3 , 건강도 +1
//		p2.sleep(); // 애기 : 건강도+3
//        //=> 아무리 Person 클래스의 eat, sleep 메소드가 미완성된 상태라도
//		//    동적 바인딩에 의해서 각각 오버라이딩 되어서 완성된 형태의 메소드가 호출되는 것을 볼 수 있음!
//		
//		System.out.println("=== 다음날 ===");
//		System.out.println(p1);
//		System.out.println(p2);
		
		// 인터페이스 적용 후
		// 객체 생성 테스트
		//Basic b= new Basic(); //객체 생성 불가능
		Basic b1 = new Mother("김엄마",50,70,"출산" ); //선언 동시에 초기화
		Basic b2 = new Baby("김응애",3.5,70); 
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b1.sleep();
		b2.eat();
		b2.sleep();
		
		System.out.println("==== 다음 날 ====");
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 * 굳이 인터페이스로 메소드 정의부분을 빼놓을 필요는 없다.
		 * 단, 사람이라면 반드시 해야하는 행위에 대한 구현을 강제적으로 하게끔
		 * 인터페이스로 구현해본 것일뿐!
		 */
		
		
	}

}








