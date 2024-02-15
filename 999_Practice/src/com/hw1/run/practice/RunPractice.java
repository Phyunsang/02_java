package com.hw1.run.practice;

import com.hw1.model.vo.practice.EmployeePractice;

public class RunPractice {
	
	public static void main(String[] args) {
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		
		EmployeePractice emp[] =  new EmployeePractice[3];
		
		emp[0] = new EmployeePractice();
		emp[1] = new EmployeePractice(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new EmployeePractice(2, "강말순", "교육부", "강사", 20, 'F', 10000000, 0.01, "01011112222", "서울 마곡");
		
		
		
		
		
		
		
		
		
		
		
	}

}
