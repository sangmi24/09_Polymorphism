package com.kh.chap01_poly.part02.electronic.controller;

import com.kh.chap01_poly.part02.electronic.model.vo.Electronic;

//�������� ��������� ��
public class ElectronicController2 {

	//��� ���ڻ󰡿� ���� ���� ����
	//â�� 
	//�ʵ��
	private Electronic[] elec = new Electronic[3]; //�ʵ带 �ʱ�ȭ
	
	//�����ں�
	
	//�޼ҵ��
	//������ ��ǰ �ɶ����� â�� ���� �ϳ��ϳ��� ���� ä���ֱ�
	//Electronic any, int index ������ �������
	public void insert(Electronic any, int index) {
		elec[index] =any;  //�θ� = �ڽ�;
	}
	
	//���� ���ϴ� ������ �����ֱ�(â��κ���) => ���� �ϳ������ֱ�
	public Electronic select(int index) {
		return elec[index];
	}
	
	//���� ���ϴ� ������ ���� �� �϶� => â�� °�� �Ѱ�����
	public Electronic[] select() {
		return elec;  //�ּҰ� ���.. �ǹ� ���°� �ƴ� 
	}
	
	/*
	 * *�޼ҵ��� ����
	 * �Է°� -> ������ ����-> ����� 
	 * 
	 * �Է°� : int, String, double, char, boolean,byte,short,float,long,��ü,�迭,...
	 * ��°� : void, int, String, double, char,boolean,short,float,long,��ü,�迭,...
	 * 
	 * => ���θ޼ҵ带 ���� ���ذ� ����...
	 */
	
	
	
	
	
	
	
}
