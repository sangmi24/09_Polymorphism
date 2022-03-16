package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public abstract class AnimalManager {

	public static void main(String[] args) {
		
    // Animal Ÿ���� ��ü�迭 ũ�� 5�� ����
	// �� �ε����� �������� Dog��ü �Ǵ� Cat��ü�� ����
 	// (�̶�, �Ű����� �����ڸ� �̿��Ͽ� ����)
	Animal[] arr = new Animal[5];
	
	arr[0] = new Dog("����","������",7);
	arr[1] = new Dog("�յ�","��Ʈ����",15);
	arr[2] = new Cat("����","�����","������","���");
	arr[3] = new Dog("����","�����ڱ�",5);
	arr[4] = new Cat("����","��������","��������","������");
				
	// �ݺ����� ���ؼ� �ش� �迭�� 0�� �ε������� ������ �ε���������
	// ��ü�� speak() �޼ҵ� ȣ��	
//	for(int i=0; i<arr.length;i++ ) {
//		arr[i].speak();
//	}
	for(Animal ani : arr) { //����  for��
		ani.speak();
	}
	
	}

}
