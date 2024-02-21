package com.poppyPlaytime.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.poppyPlaytime.model.dto.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);
	
	List<Toy> toyList = new ArrayList<Toy>();
	

	
	public ToyFactory() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.put(1, "면직물"));
		System.out.println(map.put(2, "플라스틱"));
		System.out.println(map.put(3, "유리"));
		System.out.println(map.put(4, "고무"));		
		
		
		toyList.add(new Toy("마이롱레그", 8, 36000, "분홍색", 19950805, "면직물,고무"));
		toyList.add(new Toy("허기워기", 5, 12000, "파란색", 19940312, "면직물,플라스틱"));
		toyList.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, "면직물,플라스틱"));
		toyList.add(new Toy("캣냅", 8, 27000, "보라색", 19960128, "면직물,플라스틱"));
		toyList.add(new Toy("파피", 12, 57000, "빨간색", 19931225, "면직물,플라스틱,고무"));
		
		
		
	}
	public void displayMenu() {
		
		int MenuNum = 0;
		
			
		System.out.println("<<플레이타임 공장>>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		
		System.out.println("삭제할 장난감의 이름을 입력하세요");
		System.out.println("장난감이 삭제되었습니다");
		
		
	
	
	
	
	
	
	
	}
	
}
