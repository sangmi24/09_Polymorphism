package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {
		
		//�������̽� ���� �� �׳� �Ϲ� �߻�Ŭ���������� Ȱ�� ����
//      // ��ü ���� �׽�Ʈ
//	  //Person p = new Person(); // �߻�Ŭ������ �̿ϼ��� ���¶� ��ü ������ �ȵ�
//		
//	  // ������ Ȱ�� => ������ ����, �ڽİ�ü�� ��ڴ�.
//		Person p1 = new Mother("�����",50, 70,"���");  //�ʱ�ȭ���� ���ذ�
//		Person p2 = new Baby("������", 3.5 , 70);
//		
//		 System.out.println(p1 /* .toString() */);
//		 System.out.println(p2);
//		
//		p1.eat(); // ����: ������+10 , �ǰ��� -10
//		p1.sleep(); // ���� : �ǰ��� +10
//		
//		p2.eat(); // �ֱ� : ������+3 , �ǰ��� +1
//		p2.sleep(); // �ֱ� : �ǰ���+3
//        //=> �ƹ��� Person Ŭ������ eat, sleep �޼ҵ尡 �̿ϼ��� ���¶�
//		//    ���� ���ε��� ���ؼ� ���� �������̵� �Ǿ �ϼ��� ������ �޼ҵ尡 ȣ��Ǵ� ���� �� �� ����!
//		
//		System.out.println("=== ������ ===");
//		System.out.println(p1);
//		System.out.println(p2);
		
		// �������̽� ���� ��
		// ��ü ���� �׽�Ʈ
		//Basic b= new Basic(); //��ü ���� �Ұ���
		Basic b1 = new Mother("�����",50,70,"���" ); //���� ���ÿ� �ʱ�ȭ
		Basic b2 = new Baby("������",3.5,70); 
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b1.sleep();
		b2.eat();
		b2.sleep();
		
		System.out.println("==== ���� �� ====");
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 * ���� �������̽��� �޼ҵ� ���Ǻκ��� ������ �ʿ�� ����.
		 * ��, ����̶�� �ݵ�� �ؾ��ϴ� ������ ���� ������ ���������� �ϰԲ�
		 * �������̽��� �����غ� ���ϻ�!
		 */
		
		
	}

}








