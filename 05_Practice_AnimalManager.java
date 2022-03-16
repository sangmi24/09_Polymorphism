package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public abstract class AnimalManager {

	public static void main(String[] args) {
		
    // Animal 타입의 객체배열 크기 5로 생성
	// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
 	// (이때, 매개변수 생성자를 이용하여 생성)
	Animal[] arr = new Animal[5];
	
	arr[0] = new Dog("마루","진돗개",7);
	arr[1] = new Dog("둥둥","리트리버",15);
	arr[2] = new Cat("나비","흰냥이","봄나라","흰색");
	arr[3] = new Dog("초코","웰시코기",5);
	arr[4] = new Cat("레오","검은냥이","여름나라","검은색");
				
	// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
	// 객체의 speak() 메소드 호출	
//	for(int i=0; i<arr.length;i++ ) {
//		arr[i].speak();
//	}
	for(Animal ani : arr) { //향상된  for문
		ani.speak();
	}
	
	}

}
