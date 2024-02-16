package com.hw2.model.dto;

public class Employee extends Person{
	
	private String position; // 직책
	
	public Employee() {}
	
	

	public Employee(String position, String id, String name) {
		super();
		this.position = position;
	}
	



	@Override
	public String getInfo() {
		System.out.printf("직원이 추가되었습니다 - ID : %s, 이름 : %s 직책 : %s", getId(),getName(),position);
		return null;
	}

	

}
