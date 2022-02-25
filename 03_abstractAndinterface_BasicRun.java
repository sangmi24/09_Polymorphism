package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
	
		/*
		 * Sports
		 * Basketball
		 * Football
		 */
		
		//Sports s= new Sports(); //�ν��Ͻ�ȭ=��ü ���� 
		// �߻�Ŭ������ ��ü ������ ���� �Ұ���!
		// �̿ϼ��� Ŭ�����̱� ����
		
		Sports s;
		// ��, ��ü ������ �ȵ� ��, ������ �����ν� ������ �����ϴ�.
		
	    s = /*(Sports)*/new Basketball();
	    
	    Sports s2 = new Football();
		// �߻�Ŭ����: �������� �����ؼ� �ڽİ�ü�� �޾��ִ� �뵵�δ� ��� �����ϴ�. 
	    
	    Sports[] arr = new Sports[2];
	    arr[0] = /*(Sports)*/new Basketball();
	    arr[1] = /*(Sports)*/new Football();
	    
	    for(int i=0; i<arr.length; i++) {
	    	arr[i].rule();
	    }
	    /*  (�������)
	     *  * �߻�Ŭ����(�̿ϼ��� Ŭ���� ) abstract class
	     *  - �߻�޼ҵ尡 �����ϴ� ���� �ݵ�� �߻�Ŭ������ ���� (���ֵ�)
	     *    (�Ϲ��ʵ�+�Ϲݸ޼ҵ�+�߻�޼ҵ�)
	     *  - ��, �߻�޼ҵ尡 ��� Ŭ������ �տ� abstract �� �ٿ��� �߻�Ŭ������ ���� �� �ִ�.
	     *  - ��ü ������ �Ұ����ϴ�. (��, ������ �����ν� �ڽİ�ü�� �������� ��� ����)=> ������ ���� 
	     *  
	     *  �߻�Ŭ������ �ʿ��� ��
	     *  => �ڽ�Ŭ�����鿡�� ������ ��Ģ�� �ο��ϰ� ���� �� ���� ����
	     *  => Ŭ������ ���� ��ü������ ���� �� ������ �����ΰ� ���� �� (������)
	     *  => ���� �� Ŭ������ ���� ��ü ������ ���ʿ� ������� �� (�����)
	     *  
	     * *�߻�޼ҵ�
	     * - �̿ϼ��� �޼ҵ�� ����� { }�� �����Ǿ����� �ʴ� �޼ҵ�
	     * - �ڽ�Ŭ�������� �������̵��� ���� �ϼ��Ǵ� �޼ҵ�(������ �������̵��� �ؾ���)
	     * => �������̵� ������ ��� ���� �߻�
	     * => �޼ҵ� ����� ���ϼ�, �������� Ȯ��������
	     * => ǥ��ȭ�� Ʋ�� ������ �������ε� ����
	     *  
	     */
	    
	    
	    
	    
	    

	}

}
