package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {	// 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);;
	
	public void ex1() {
		
		// if문
		// 조건식이 true 일 때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일 때 수행할 코드
		 * }
		 * */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		}
		
		if (input <= 0) {
			System.out.println("양수가 아니다");
		}
		
		
		
	}

	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true 면 if 문
		// false 면 else 구문이 수행함
		
		/*
		 * [작성법]
		 * 
		 * if(조건식){
		 * 		조건식이 true 일 때 수행될 코드
		 * } else {
		 * 		조건식이 false 일 때 수행될 코드
		 * }
		 * 
		 * */
		
		// 홀짝검사
		// 입력받은 정수값이
		// 홀수이면 "홀수입니다"출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다" 출력
		// else if 사용 X , 중첩 if 문 사용하기
		
		System.out.println("정수 입력");
		int input = sc.nextInt();
		
		if(input % 2 != 0) {
			System.out.println("홀수 입니다");
		} else { // 짝수 또는 0 입력 시 수행
			
			// 중첩 if
			if(input == 0 ) {
				System.out.println("0 입니다");
			} else {
				System.out.println("짝수 입니다");
			}
			
		}
		
	}
	
	public void ex3() {
		// 양수, 음수, 0 판별
		// if(조건식) - else if(조건식) - else
		
		System.out.println("정수 입력");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다");
		} else if(input < 0) { // 바로 위에 있는 if 문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다");
		} else {
			System.out.println("0 입니다");
		}
		
	
		
	}
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일 때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		// 1,2,12 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		
		
		
		// 겨울 한파주의보
		// 여름 폭염경보
		// 봄
		// 가을
		
		
		System.out.println("달 입력");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.println("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature <= 15 ) {
				season += "한파 경보";
				// 겨울
				// season = season + "한파 경보";;
				// "겨울 한파 경보"
			} else if( temperature <= 12) {
				season += "한파 주의보";
			}
					
		} else if( month >= 3 && month <= 5) {
			season = "봄";
			
		} else if( month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.println("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature <= 35 ) {
				season += "폭염 경보";
				
			} else if( temperature >= 35) {
				season += "폭염 주의보";
			}
			
		} else if( month >= 6 && month <= 8) {
			season = "가을";
			
		} else {
			season = "해당하는 계절이 없습니다";
			
		}
		
		System.out.println(season);
		
	}
	
	public void ex5() {
		
		System.out.println("나이를 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다");
		}  else if(age > 19){
			System.out.println("성인 입니다");
		} else {
			System.out.println("청소년 입니다");
		}
		
	}
	
	public void ex6() {
		
		System.out.println("점수 입력(0~100) : ");
		int score = sc.nextInt();
		
		String result;
		
		if(score < 0 || score >100 ) {
			result = "잘못 입력했어요";
			
		} else if( score >= 90 ) {
			result = "A";
			
		} else if( score >= 80 ) {			
			result = "B";
			
		} else if( score >= 70 ) {
			result = "C";
			
		} else if( score >= 60 ) {
			result = "D";
			
		} else {
			result = "F";
		}
	}
	
	public void ex7() {
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = null;
		
		if(age < 0 || age > 100) {
			result = "잘못 입력하셨습니다";
		} else {
			
			System.out.println("키 입력 : ");
			double height = sc.nextDouble();
			
			if(age < 12) {
				System.out.println("적정 연령이 아닙니다");
				
			} else if(height < 140.0 ) {
				result = "적정 키가 아닙니다";
						
			} else {
				result = "탑승 가능";
			}
		} 
		System.out.println(result);
	}
	
		
	
	public void ex8() {
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if( age < 0 || age > 100) {
			result = "나이를 잘못 입력했어요";
			
		} else {
			
			System.out.println("키 입력  : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250 ) {
				result = "키를 잘못 입력했어요";
				
			} else {
				
				if( age < 12 && height >= 140.0 ) { // 나이 X, 키 O
					result = "나이는 적절치 않고, 키는 적절함";
					
				} else if( age >= 12 && height < 140.0 ) { // 나이 O, 키 X
					result = "나이는 적절하나, 키가 적절치 않음";
					
				} else if( age < 12 && height < 140.0 ) { // 나이 X, 키 X
					result = "나이와 키 모두 적절치 않음";
					
				} else {
					result = "탑승 가능";
				}
			}
			
		}
		
		System.out.println(result);
	}
		
}

