package com.kh.chap01_poly.part02.electronic.controller;

import com.kh.chap01_poly.part02.electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02.electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02.electronic.model.vo.Tablet;

//�������� �����Ű�� ��
public class ElectronicController1 {

	//  ��� ���ڻ󰡿� ���� ���� ����
	//  �ʵ��
	//���ڸ� ����������
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// �����ں�
	
	// �޼ҵ��
	// ����ũž ��� ���� ��� ����ũž�� �������ִ� �޼ҵ�
	//insert�� �����ϴ� ��
	//Desktop d  ���� ���� ���� ��ü ,�̸��� ���� ���� ���� 
	public void insert(Desktop d) {
		
		//Desktop d= new Desktop("�Ｚ", "����ũž",1200000,"Geforce 1070");
		//desk = new Desktop("�Ｚ","����ũž",1200000,"Geforce 1070");
		desk = d;		
	}
	// ��Ʈ�� ��� ���� ��� ��Ʈ���� �������ִ� �޼ҵ�
	public void insert(NoteBook n) {  //�����ε� : �ƹ��� �޼ҵ���� ���Ƶ� �Ű������� �޶� ���� ����
		note = n;
	}
	
	// �׺� ��� ���� ��� �º��� �������ִ� �޼ҵ�
	public void insert(Tablet t) {
		tab = t;
	}
	
	// ��ȯ���� ���ʿ� �޶� �����ε��� �Ұ�!! (�޼ҵ���� ���� ������� ��)
	// ������ ������ ������ �����ַ��� ���Ͻ����ִ� �޼ҵ��
	//Desktop�� desk�� ������ ���� �Ѵ�. �� �ڸ��� ���� �ǳ��� ������ �ϴ°� �ƴ϶� 
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selTablet() {
		return tab;
	}
	
	
	
	
	
}







