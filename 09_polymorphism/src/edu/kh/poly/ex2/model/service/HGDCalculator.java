package edu.kh.poly.ex2.model.service;

public class HGDCalculator implements Calculator {

	@Override
	public int puls(int num1, int num2) {
		return num1 * num2 + MAX_NUM;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 + num2 * 10;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1++;
	}

}
