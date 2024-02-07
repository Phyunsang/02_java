package edu.kh.oop.basic;

import java.util.Arrays;

public class AccountRun {
	
	public static void main(String[] args) {
		
		// Account 객체 생성
		Account a1 = new Account();
		
		a1.setName("박현상");
		a1.setAccountNumber("1234-56-7890");
		a1.setBalance(100000);
		a1.setPassword("7890");
		
		System.out.println( a1.getName());
		System.out.println( a1.getAccountNumber());
		System.out.println( a1.getBalance());
		System.out.println( a1.getPassword());
		
		a1.deposit(50000);
		a1.withdraw("1234", 2000); // 비밀번호 불일치
		a1.withdraw("7890", 2000000000); // 잔액부족
		a1.withdraw("7890", 1000);
		
		Account a2 = new Account();
		
		a2.setAccountNumber("7777-777-77777");
		a2.setName("박소잉");
		a2.setBalance(100000000);
		a2.setPassword("1111");
		
		a2.deposit(10000);
		a2.withdraw("2222", 1000);
		a2.withdraw("1111", 1000000000);
		a2.withdraw("1111", 5000);
		
		
		
	}
	
}
	
	
