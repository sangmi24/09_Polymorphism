package com.kh.chap01_poly.part02.electronic.run;


import com.kh.chap01_poly.part02.electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02.electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02.electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02.electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02.electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02.electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
	
		//1. 다형성을 적용하기 전 (ElectronicController1)
		// 납품업체
		ElectronicController1 ec = new ElectronicController1();
		
		//Desktop d=new Desktop("삼성","데스크탑",1200000,"Geforce 1070");
	    //ec.insert(d);
		ec.insert(new Desktop("삼성","데스크탑",1200000,"Geforce 1070"));
        ec.insert(new NoteBook("엘지","그램",2000000,3));
        ec.insert(new Tablet("애플","아이패드",500000,false));
        //=> 각각 데스크탑, 노트북, 태블릿 한대씩을 납품한 상태
     
        //손님
        //가게에 있는 제품들을 조회해 볼것
        Desktop d = ec.selectDesktop();
        NoteBook n = ec.selectNoteBook();
        Tablet t= ec.selTablet();
        
        System.out.println(d /*.toString*/);
        System.out.println(n);
        System.out.println(t);
        
        
        // => 매번 타입이 다르기 때문에 한번에 배송을 받을수가 없음 (부분배송)
        
        //System.out.println(ec.selectDesktop()); //이렇게 해도 된다. 
        
        
        //2. 다형성을 적용했을 경우(ElectronicController2)
        ElectronicController2 ec2 = new ElectronicController2();
        
        //납품업체
        //물건을 친절하게 창고에 담아주기까지 한것
        ec2.insert(/*(Electronic)*/new Desktop("삼성","데스크탑",1000000,"Geforce 1070"),0);
        ec2.insert(/*(Electronic)*/new NoteBook("엘지","그램",2000000,4), 1);
        ec2.insert(/*(Electronic)*/new Tablet("애플","아이패드",600000,true), 2);
        //창고가 가득 참
               
        //고객
        System.out.println("============다형성 적용 후 =============");
        System.out.println(ec2.select(0)/*  .toString() */); 
        // 얘 리턴값이 Electronic 그래서 부모값으로 출력이 되어야 하는데  
        // 배열(0)번째인 자식값으로 출력됨(동적로딩.. )
        
        //창고째로 다 샀을 때
        Electronic[] elec = ec2.select();
        
        System.out.println("elec : "+elec ); //주소값
        
        for(int i=0; i<elec.length ;i++) {
        	System.out.println(elec[i]/*  .toString() */);
        }
        
        /*
         * * 다형성을 사용하는 이유
         * 1. 부모타입의 객체배열로 다양한 자식들을 묶어서 한번에 받아줄 수 있음
         * => 즉, 부모타입 하나만으로 다양한 자식 객체들을 다룰 수 있음
         * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면
         *    메소드의 갯수가 확 줄어든다. (코드가 간결해진다.)  
         */
        
        
        
        
        
        
        
        
        
        
	}

}
