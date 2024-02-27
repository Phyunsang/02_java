package edu.kh.toyProject.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import edu.kh.toyProject.model.service.ToyProjectService;
import edu.kh.toyProject.model.service.ToyProjectServiceImpl;

public class ToyProjectView {
	
	private BufferedReader br = null;
	private ToyProjectService service = null;
	
	
	public ToyProjectView() {
		
		try {
			
			service = new ToyProjectServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//-------------------------------------------------------------------------
	
	public void startView() {
		
		int input = 0;
		
		do {
			
			try { 
				
				input = selecMusic();
				
				switch(input) {
				case 1 : /*toyProjectFullView();*/ break;
				case 2 : /*toyDetailView();*/ break;
				case 3 : /*toyAdd();*/ break;
				case 0 : System.out.println("프로그램 종료");
				default : System.out.println("메뉴에 작성된 번호만 입력해주세요");
				}
				
				System.out.println("==============================================");
				
				
				
				
				
				
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
	
	
	public int selecMusic() throws NumberFormatException, IOException{
		
		System.out.println("\n===== Toy Project =====\n");
		
		System.out.println("1. Toy Project Full View");
		System.out.println("2. Toy Detail View");
		System.out.println("3. Toy Add");
		
		int input = Integer.parseInt(br.readLine());
		
		return input;
		
	}
	
	//----------------------------------------------------------------
	
	public void toyProjectFullView() {
		
		System.out.println("\n=====[1. Toy Project Full View]=====\n");
		
		Map<String, Object> map = service.toyProjectFullView();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
