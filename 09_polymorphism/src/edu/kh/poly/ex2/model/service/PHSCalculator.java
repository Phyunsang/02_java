package edu.kh.poly.ex2.model.service;

public class PHSCalculator implements Calculator{
	// extends : 확장하다, implements : 구현하다
	// (부)클래스 - (자)클래스 : extends 사용(추상클래스 포함)
	// (부)인터페이스 - (자)클래스 : implements 사용

	@Override
	public int puls(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}

	public String plus(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
