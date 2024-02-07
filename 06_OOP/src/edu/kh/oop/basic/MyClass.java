package edu.kh.oop.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass { // 기능 정의용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
	String[] getInfo = new String[2];

	getInfo[0] = "김나나";
	getInfo[1] = "홍길동";

	System.out.println(Arrays.toString(getInfo));


}
}