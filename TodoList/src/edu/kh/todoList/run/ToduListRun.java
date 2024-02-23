package edu.kh.todoList.run;

import edu.kh.todoList.view.TodoListView;

public class ToduListRun {
	
	public static void main(String[] args) {
		
		System.out.println("========프로그램 실맹========");
		
		// 프로잭트 흐름
		// Run <-> View <-> Service <-> DAO <-> File
		TodoListView view = new TodoListView();
		//view.startView();
		view.todoListFullView();
	}

}
