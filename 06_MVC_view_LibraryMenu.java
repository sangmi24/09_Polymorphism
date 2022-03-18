package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	//초기화 생성
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
	
		//이름, 나이, 성별을 키보드로 입력 받은 후 Member객체 생성
		//LibraryController 의 insertMember()메소드에 전달
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F): ");
		char gender=sc.nextLine().toUpperCase().charAt(0);
        
		Member mem = new Member(name,age,gender); 
		lc.insertMember(mem);

		while(true) {  //무한 반복 실행
			System.out.println("==== 메뉴  ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호: ");
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
			   System.out.println("프로그램을 종료합니다.");
			   return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}			
		}	
	}
	public void selectAll() {
		//LibraryController의 selectAll()메소드 호출하여
		//결과 값 Book[] 자료형 bList에 담기
		//for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력-> 대여할때 도서번호를 알기 위해	
	    Book[] bList= new Book[5];
	    
	    for(int i=0; i<bList.length; i++) {
	    	bList[i] =lc.selectAll()[i];
	    	System.out.println( i+ "번 도서 : "+  bList[i]);
	    }
	}
	public void searchBook() {
		System.out.print("검색할 제목 키워드: ");
		String keyword=sc.nextLine();
		//lc.searchBook(keyword);
		
		//그 결과 값을 Book[]자료형 searchList에 담아 검색 결과인 도서 목록 출력
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
		//도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();
		
		System.out.print("대여할 도서 번호 선택: ");
		int rentNum = sc.nextInt();
		int result=lc.rentBook(rentNum);
		
		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다.");
			System.out.println("요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
		
		
		
	}
	
	
	
	
	
	
}
