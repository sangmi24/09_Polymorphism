package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	//필드부
	private Member mem= null; //null 로 명시초기화
	private Book[] bList= new Book [5]; //크기 5할당
	{
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvn",true);
	bList[1] = new AniBook("한번 더 해요","미티","원모어", 19);
	bList[2] = new AniBook("루피의 원피스","루피","japan", 12);
	bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
	bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}
	//전달받은 mem 주소값을 통해 LibraryController의 mem에 대입
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	//회원 레퍼런스(mem) 주소값 리턴
	public Member myInfo() {
		return this.mem;
	}
	//도서 전체 목록(bList)주소값 리턴
	public Book[] selectAll() {
		return this.bList;
	}
	//전달받은 키워드가 포함된 도서가 여러개가 존재할 수 있으니 
	//검색된 도서를 담아줄 Book객체 배열을 새로이 생성하고
	//for문을 통해 bList안의 도서들과 전달받은 키워드를 비교하여
	//포함하고 있는 경우 새로운 배열에 차곡차곡 담기
	//=> 그 배열 주소 값 리턴
	public Book[] searchBook(String keyword) {
		Book[] sBooks = new Book[5];
		
		int count =0;
		for(int i=0; i<sBooks.length; i++) {
			if(bList[i].getTitle().contains(keyword) ==true) {
				sBooks[count] =bList[i];
				count++;
			}
		}return sBooks;	
	}
	//result를 0으로 초기화 한 후 전달받은 인덱스의 도서가 만화책인경우
	//회원의 나이와 해당 만화책의 제한 나이를 비교하여 회원 나이가 더 적은 경우
	//result를 1로 초기화 
	//아니면 전달받은 인덱스의 도서가 요리책인 경우 요리책의 쿠폰 유무가
	//유 일 경우 회원의 couponCount를 1증가 시킨후 result 2로 초기화
	//=> result 리턴
	public int rentBook(int index) {
		int result=0;
		
		if(bList[index] instanceof AniBook) {
		  if(((AniBook) bList[index]).getAccessAge() > mem.getAge()){
				result=1;
			}
		}
		if(bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).isCoupon()  == true) {
				result=2;
			}
		}
		return result;
	}
	
	
	
	
}
