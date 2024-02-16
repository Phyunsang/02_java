package com.hw2.model.dto;

public class Prisoner extends Person{
	
	private String crime; // 죄목
	
	public Prisoner() {}
	
	
	
	

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}





	@Override
	public String getInfo() {
		System.out.printf("수감자가 추가되었습니다 - ID : %s, 이름 : %s, 죄목 : %s",
				getId(),getName(),crime);
		return null;
	}
	
	

}
