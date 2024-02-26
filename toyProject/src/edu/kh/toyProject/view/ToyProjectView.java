package edu.kh.toyProject.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;

public class ToyProjectView {
	
	private BufferedReader br = null;
	private ToyProjectService service = null;
	

	public ToyProjecttView() {
		
		
		
		try {
			 
			service = new ToyProjectServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	public void startView() {
		
		int input = 0;
		
		do {
			
			try {
				
				// 선택한 번호가 반환되어 input에 저장됨
				input = selectMenu();
				
				switch(input) {
				case 1 : toyListFullView(); break;
				case 2 : toyDateView(); break;
				case 3 : toyAdd(); break;
				case 4 : toyComplete(); break;
				case 5 : toyUpdate(); break;
				case 6 : toyDelete(); break;
				case 0 : System.out.println("@@프로그램 종료@@"); break;
				default : System.out.println("### 메뉴에 작성된 번호만 입력해 주세요! ###");
				
				}
				
				System.out.println("====================================");
				
				
			} catch(NumberFormatException e) {
				System.out.println("### 숫자만 입력해 주세요 ###");
				input = -1;
				
			} catch(IOException e) {
				System.out.println("### 입/출력 관련 예외 발생 ###");
				e.printStackTrace(); 
				
			} catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
		} while(input != 0);
		
	}
	

	public int selectMenu() throws NumberFormatException, IOException{
		
		System.out.println("\n======= Todo List =======");
		
		System.out.println("1. Todo List Full View");
		System.out.println("2. TOdo Detail View");
		System.out.println("3. Todo add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo delete");
		System.out.println("0. EXIT");
		
		System.out.println("select menu number");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
		
	}
	

	public void todoListFullView() {
		
		System.out.println("\n==========[1. Todo List Full View]===========\n");
	
		Map<String, Object> map = service.todoListFullView();
		

		List<Toy> todoList = (List<Toy>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
		
		// 출력
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
				, completeCount, todoList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = todoList.size(); i < len; i++) {
		
			String title = todoList.get(i).getTitle();
			
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			
			String regDate = service.dateFormat(todoList.get(i).getRegDate());
			
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}
		
		
	}
	

	public void todoDateView() throws IOException{
		
		System.out.println("\n==========[1. Todo Detail Full View]===========\n");
		
		System.out.print("인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		
		String toyDetail = service.toyDetailView(index);
		
		if(toyDetail == null) {
			System.out.println("### 입력한 인덱스 번호가 존재하지 않습니다 ###");
			return;
		}
		
		System.out.println(toyDetail);
		
	}
	
	
	

	public void toyAdd() throws IOException, Exception {
		System.out.println("\n==========[3. Todo Add]===========\n");
		
		System.out.println("할 일 제목 입력 : ");
		String title = br.readLine();
		
		System.out.println("세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터)");
		System.out.println("--------------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			// 문자열 입력 받기
			String content = br.readLine();
			
			if(content.equals("!wq")) break;
			
			sb.append(content);
			sb.append("\n");
		}
		
		
		System.out.println("--------------------------------------------");
		
		int index = service.toyAdd(title, sb.toString());
		
		if(index == -1) {
			System.out.println("### 추가 실패 ###");
			return;
		}
		
	
		System.out.printf("[%d] 인덱스에 추가 되었습니다\n", index);
		
	}
	
	
	public void toyComplete() throws IOException, Exception{
		System.out.println("\n==========[4. todo Complete]===========\n");
		
		System.out.println("변경할 인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
	
		boolean result = service.todoComplete(index);
		
		if(result) {
			System.out.println("[변경 되었습니다]");
			
		} else {
			System.out.println("### 인덱스가 존재하지 않습니다 ###");
			
		}
		
		
		
		
		
		
		
	}
	
	
	public void toyUpdate() throws Exception{
		System.out.println("\n==========[5. Todo Update]===========\n");
		
		System.out.println("수정할 인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		
		String toyDetail = service.todoDetailView(index);
		
		if(toyDetail == null) {
			System.out.println("### 인덱스 존재하지 않음 ###");
			return;			
		}
		
		System.out.println("@@@@@@@@[ 수정 전 ]@@@@@@@@");
		System.out.println(toyDetail);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	
		System.out.println("수정할 제목 입력 : ");
		String title = br.readLine();
		
		System.out.println("세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터)");
		System.out.println("--------------------------------------------");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String content = br.readLine();
			
			if(content.equals("!wq")) break; // !wq 입력 시 반복 종료
			
			sb.append(content);
			sb.append("\n");
		}
		
		
		System.out.println("--------------------------------------------");
		
		boolean result = service.toyUpdate(index, title, sb.toString());
		
		if(result) System.out.println("[수정 되었습니다]");
		else	System.out.println("### 수정 실패 ###");
		
		
		
		
	}
	
	
	public void toyDelete() throws Exception{
		System.out.println("\n==========[6. Todo Delete]===========\n");
		
		System.out.println("삭제할 인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		
		String result = service.todoDelete();
		
		if(result == null) System.out.println("### 인덱스가 존재하지 않습니다 ###");
		else	System.out.printf("[%s] 가 삭제 되었습니다?\n", result);
		
		
		
	}
	
	
	


}
