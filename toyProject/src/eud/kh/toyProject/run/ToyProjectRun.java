package eud.kh.toyProject.run;

import edu.kh.toyProject.view.ToyProjectView;

public class ToyProjectRun {
	
	public static void main(String[] args) {
		
		System.out.println("=====프로그램 실행=====");
		
		// 프로잭트 흐름
		// Run <-> View <-> Service <-> DAO <-> File
		ToyProjectView view = new ToyProjectView();
		view.startView();
		
		
		
	} 

}
