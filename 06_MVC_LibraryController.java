package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	//�ʵ��
	private Member mem= null; //null �� ����ʱ�ȭ
	private Book[] bList= new Book [5]; //ũ�� 5�Ҵ�
	{
	bList[0] = new CookBook("�������� ����", "������", "tvn",true);
	bList[1] = new AniBook("�ѹ� �� �ؿ�","��Ƽ","�����", 19);
	bList[2] = new AniBook("������ ���ǽ�","����","japan", 12);
	bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
	bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);

	}
	//���޹��� mem �ּҰ��� ���� LibraryController�� mem�� ����
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	//ȸ�� ���۷���(mem) �ּҰ� ����
	public Member myInfo() {
		return this.mem;
	}
	//���� ��ü ���(bList)�ּҰ� ����
	public Book[] selectAll() {
		return this.bList;
	}
	//���޹��� Ű���尡 ���Ե� ������ �������� ������ �� ������ 
	//�˻��� ������ ����� Book��ü �迭�� ������ �����ϰ�
	//for���� ���� bList���� ������� ���޹��� Ű���带 ���Ͽ�
	//�����ϰ� �ִ� ��� ���ο� �迭�� �������� ���
	//=> �� �迭 �ּ� �� ����
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
	//result�� 0���� �ʱ�ȭ �� �� ���޹��� �ε����� ������ ��ȭå�ΰ��
	//ȸ���� ���̿� �ش� ��ȭå�� ���� ���̸� ���Ͽ� ȸ�� ���̰� �� ���� ���
	//result�� 1�� �ʱ�ȭ 
	//�ƴϸ� ���޹��� �ε����� ������ �丮å�� ��� �丮å�� ���� ������
	//�� �� ��� ȸ���� couponCount�� 1���� ��Ų�� result 2�� �ʱ�ȭ
	//=> result ����
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
