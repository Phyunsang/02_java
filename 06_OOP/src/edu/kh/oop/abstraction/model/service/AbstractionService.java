package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비지니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	// ctrl + shift + o : 해당 클레스에서 임포트 안된 거 전부 임포트하기
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 = People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다!! **
		
		/*
		p1.name = "홍길동";
		p1.gender ='남';
		p1.pNo = "201106-1011111";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1111-1111";
		p1.age = 4;
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("201106-1011111");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		p1.setPhone("010-1111-1111");
		p1.setAge(4);
		
		System.out.println("p1의 name : " + p1.getName() );
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 age : " + p1.getAge());
		p1.tax();
		p1.vote();
		
		System.out.println("=============================");
		
		// 본인 객체
		
		People hyunsang = new People();
		
		hyunsang.setName("박현상");
		hyunsang.setGender('남');
		hyunsang.setpNo("941106-1000000");
		hyunsang.setAddress("역촌동");
		hyunsang.setPhone("010-7594-2222");
		hyunsang.setAge(31);
		
		System.out.println("hyunsang의 name : " + hyunsang.getName() );
		System.out.println("hyunsang의 gender : " + hyunsang.getGender());
		System.out.println("hyunsang의 pNo : " + hyunsang.getpNo());
		System.out.println("hyunsang의 address : " + hyunsang.getAddress());
		System.out.println("hyunsang의 phone : " + hyunsang.getPhone());
		System.out.println("hyunsang의 age : " + hyunsang.getAge());
		p1.tax();
		p1.vote();
		
		
	}

}
