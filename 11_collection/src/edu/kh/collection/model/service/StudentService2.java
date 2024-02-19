package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentService2 {
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Student> studentList = new ArrayList<Student>();
	
	public StudentService2() {
		
		studentList.add( new Student("박박박", 30, "서울", 'M', 100));
		studentList.add( new Student("정정정", 31, "수원", 'Y', 90));
		studentList.add( new Student("김김김", 32, "전주", 'M', 80));
		studentList.add( new Student("최최최", 33, "춘천", 'Y', 70));
		studentList.add( new Student("손손손", 34, "일산", 'M', 60));
		
	}
	
	public void ex1() {
		
		studentList.add( new Student()); // 0번 인덱스
		
		if(studentList.get(0) instanceof Student) {
			System.out.println(((Student)studentList.get(0)).getName());
		}
		
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		System.out.println(studentList.get(2));
		
		
		}
	
	public void displayMenu() {
		
		int menuNum1 = 0; // 메뉴 선택용 변수
		
		do {
			
			System.out.println("\\n=======학생관리 프로그램=======\\");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴 번호 선택 : ");
			
			try {
				
				menuNum1 = sc.nextInt();
				System.out.println();
				
				switch(menuNum1) {
				case 1 : System.out.println(addStudent());; break;
				case 2 : seletAll(); break;
				case 3 : System.out.println(updateStudent()); break;
				case 4 : System.out.println(removeStudent());; break;
				//case 5 : searchName; break;
				//case 6 : searchName2; break;
				case 0 : System.out.println("프로그램 종료..."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
				
				
				
				}
				
				
			} catch(InputMismatchException e) {
				System.out.println("\nerorr : 입력형식이 유효하지않습니다.");
				sc.nextLine();
			}
			
		} while(menuNum1 != 0);
		
		
	}
	
	/**
	 * 1. 학생 정보 추가 메서드
	 * - 추가 성공 시 "성공" 실패 시 "실패" 문자열 반환
	 */
	
	public String addStudent() throws InputMismatchException {
		
		System.out.println("=====학생 정보 추가=====");
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 개행 문자 제거용
		
		System.out.println("지역 : ");
		String region = sc.nextLine();
		
		System.out.println("성별 (M/F) : ");
		char gender = sc.next().charAt(0); // 'm' or 'F'
		
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		if(studentList.add(new Student(name, age, region, gender, score))) { 
			return "성공";
		} else {
			return "실패";
		}
		
	}
	
	/**
	 * 학생 전체 조회 메서드
	 *  - List가 비어있는 경우 "학생 정보가 없습니다" 출력
	 *  있는 경우 전체 학생 출력
	 */
		public void seletAll() {
		
			System.out.println("====전체 학생 조회====");
			
			if(studentList.isEmpty()) {
				System.out.println("학생 정보가 없습니다.");
				return;
			}
			
			int index = 0;
			for(Student std : studentList) {
				System.out.println((index++) + "번 + ");
				System.out.println(std);
				
			}
		
	}
	
		/**
		 * 학생 정보 수정 메서드
		 * - 학생정보가 studentList에 있는지 검사, 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
		 * - 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환
		 * - studentList 범위 내 인덱스번호인지 검사, 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
		 * - 수정이 완료되었다면, "000의 정보가 변경되었습니다" 문자열 반환
		 */
		public String updateStudent() throws InputMismatchException{
			System.out.println("====학생 정보 수정====");
			
			System.out.println("인덱스 번호 입력");
			int index = sc.nextInt();
			
			if(studentList.isEmpty()) {
				return "입력된 학생 정보가 없습니다";
			} else if(index < 0) {
				return "음수는 입력할 수 없습니다";
			} else if(index >= studentList.size()) {
				return "범위를 넘어선 값을 입력할 수 없습니다.";
			} else {
				System.out.println(index + "번째에 저장된 학생 정보");
				System.out.println(studentList.get(index));
				
				System.out.println("이름 : ");
				String name = sc.next();
				
				System.out.println("나이 : ");
				int age = sc.nextInt();
				sc.nextLine(); // 입력 버퍼 개행 문자 제거용
				
				System.out.println("사는 곳 : ");
				String region = sc.nextLine();
				
				System.out.println("성별(M/F) : ");
				char gender = sc.next().charAt(0); // 'M' or'F'
				
				System.out.println("점수 : ");
				int score = sc.nextInt();
				
				// 입력받은 index 번째의 새로운 학생 정보(위에 입력받은 값)를 세팅 == 수정
				// index 번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장한다.
				Student temp = studentList.set(index, new Student(name, age, region, gender, score));
				
				return temp.getName() + "의 정보가 변경되었습니다";
			}
			
	
	
		
		
		
	}
	/** 학생 정보 제거 메서드
	 * @return String 
	 */
	public String removeStudent() throws InputMismatchException{
		
		System.out.println("====학생 정보 제거=====");
		
		System.out.println("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		} else if(index < 0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index >= studentList.size()) {
			return "범위를 넘어선 값은 입력할 수 없습니다.";
		} else
			
			System.out.println("정말 삭제하시겠습니까? (Y/N)");
			char ch = sc.next().toUpperCase().charAt(0);
			
			
			if(ch == 'Y') {
				studentList.remove(index);
				
				Student temp = studentList.remove(index);
				return temp.getName() + "의 정보가 제가되었습니다.";
				
			} else {
				return "취소";
			}
			
}
		
	
	
	
	
	
	
	
	
	
	

}
