package edu.kh.todoList.model.dao;

import java.util.List;

// DAO (Data Access Object) :
// 데이터가 저장된 파일/DB/외부 장치에 접근하는 역할
public interface TodoListDAO {
	
	/** TodoList를 파일로 저장하는 메서드
	 * 
	 */
	public void saveFile() throws Exception;
	
	
	
	/** 할 일 목록 반환 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();
	
	
	/** 전달 받은 index번째 todo 를 반환 DAO
	 * @param index
	 * @return index 번째 todo, 없으면 null
	 */
	Todo todoDetailView(int index);


	/** 할 일 추가 DAO
	 * @param todo
	 * @return 추가된 index or -1
	 */
	int todoAdd(Todo todo) throws Exception;



	/** 할 일 완료 여부 변경 DAO
	 * @param index
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 			index 요소가 없으면 false
	 * @throws Exception 
	 */
	public boolean todoComplete(int index) throws Exception;



	/** 할 일 수정 DAO
	 * @param index
	 * @param title
	 * @param content
	 * @return 성공하면 true, 실패하면 false
	 * @throws Exception 
	 */
	public boolean todoUpdate(int index, String title, String content) throws Exception;



	
	/**
	 * @param index
	 * @return 성공 시 삭제된 할일(Todo)반환
	 * @throws Exception
	 */
	public Todo todoDelete(int index) throws Exception;


	

}
