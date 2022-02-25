package com.kh.chap01_poly.part02.electronic.run;


import com.kh.chap01_poly.part02.electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02.electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02.electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02.electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02.electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02.electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
	
		//1. �������� �����ϱ� �� (ElectronicController1)
		// ��ǰ��ü
		ElectronicController1 ec = new ElectronicController1();
		
		//Desktop d=new Desktop("�Ｚ","����ũž",1200000,"Geforce 1070");
	    //ec.insert(d);
		ec.insert(new Desktop("�Ｚ","����ũž",1200000,"Geforce 1070"));
        ec.insert(new NoteBook("����","�׷�",2000000,3));
        ec.insert(new Tablet("����","�����е�",500000,false));
        //=> ���� ����ũž, ��Ʈ��, �º� �Ѵ뾿�� ��ǰ�� ����
     
        //�մ�
        //���Կ� �ִ� ��ǰ���� ��ȸ�� ����
        Desktop d = ec.selectDesktop();
        NoteBook n = ec.selectNoteBook();
        Tablet t= ec.selTablet();
        
        System.out.println(d /*.toString*/);
        System.out.println(n);
        System.out.println(t);
        
        
        // => �Ź� Ÿ���� �ٸ��� ������ �ѹ��� ����� �������� ���� (�κй��)
        
        //System.out.println(ec.selectDesktop()); //�̷��� �ص� �ȴ�. 
        
        
        //2. �������� �������� ���(ElectronicController2)
        ElectronicController2 ec2 = new ElectronicController2();
        
        //��ǰ��ü
        //������ ģ���ϰ� â�� ����ֱ���� �Ѱ�
        ec2.insert(/*(Electronic)*/new Desktop("�Ｚ","����ũž",1000000,"Geforce 1070"),0);
        ec2.insert(/*(Electronic)*/new NoteBook("����","�׷�",2000000,4), 1);
        ec2.insert(/*(Electronic)*/new Tablet("����","�����е�",600000,true), 2);
        //â�� ���� ��
               
        //��
        System.out.println("============������ ���� �� =============");
        System.out.println(ec2.select(0)/*  .toString() */); 
        // �� ���ϰ��� Electronic �׷��� �θ����� ����� �Ǿ�� �ϴµ�  
        // �迭(0)��°�� �ڽİ����� ��µ�(�����ε�.. )
        
        //â��°�� �� ���� ��
        Electronic[] elec = ec2.select();
        
        System.out.println("elec : "+elec ); //�ּҰ�
        
        for(int i=0; i<elec.length ;i++) {
        	System.out.println(elec[i]/*  .toString() */);
        }
        
        /*
         * * �������� ����ϴ� ����
         * 1. �θ�Ÿ���� ��ü�迭�� �پ��� �ڽĵ��� ��� �ѹ��� �޾��� �� ����
         * => ��, �θ�Ÿ�� �ϳ������� �پ��� �ڽ� ��ü���� �ٷ� �� ����
         * 2. �޼ҵ��� �Ű������� ��ȯ���� �������� �����ϰ� �Ǹ�
         *    �޼ҵ��� ������ Ȯ �پ���. (�ڵ尡 ����������.)  
         */
        
        
        
        
        
        
        
        
        
        
	}

}
