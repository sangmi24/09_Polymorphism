package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	//�ʱ�ȭ ����
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
	
		//�̸�, ����, ������ Ű����� �Է� ���� �� Member��ü ����
		//LibraryController �� insertMember()�޼ҵ忡 ����
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("����: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F): ");
		char gender=sc.nextLine().toUpperCase().charAt(0);
        
		Member mem = new Member(name,age,gender); 
		lc.insertMember(mem);

		while(true) {  //���� �ݺ� ����
			System.out.println("==== �޴�  ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook(); 
				break;
			case 4:
				rentBook();
				break;
			case 9:
			   System.out.println("���α׷��� �����մϴ�.");
			   return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}			
		}	
	}
	public void selectAll() {
		//LibraryController�� selectAll()�޼ҵ� ȣ���Ͽ�
		//��� �� Book[] �ڷ��� bList�� ���
		//for�� �̿��Ͽ� bList�� ��� ���� ��� ���
		// ��, i�� �̿��Ͽ� �ε����� ���� ���-> �뿩�Ҷ� ������ȣ�� �˱� ����	
	    Book[] bList= new Book[5];
	    
	    for(int i=0; i<bList.length; i++) {
	    	bList[i] =lc.selectAll()[i];
	    	System.out.println( i+ "�� ���� : "+  bList[i]);
	    }
	}
	public void searchBook() {
		System.out.print("�˻��� ���� Ű����: ");
		String keyword=sc.nextLine();
		//lc.searchBook(keyword);
		
		//�� ��� ���� Book[]�ڷ��� searchList�� ��� �˻� ����� ���� ��� ���
		Book[] searchList=new Book[5];
		
		for(int i=0; i< searchList.length; i++) {
			searchList[i] =lc.searchBook(keyword)[i];
			if(searchList[i] == null) {
				continue;
			}
			System.out.println(searchList[i]);
		}
	
	}
	public void rentBook() {
		//�����뿩�� ���� ������ȣ�� �˾ƾ� �ϱ� ������ selectAll() �޼ҵ� ȣ��
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ����: ");
		int rentNum = sc.nextInt();
		int result=lc.rentBook(rentNum);
		
		switch (result) {
		case 0:
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
			break;
		case 1:
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
			break;
		case 2:
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
			System.out.println("�丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
			break;
		}
		
		
		
	}
	
	
	
	
	
	
}
