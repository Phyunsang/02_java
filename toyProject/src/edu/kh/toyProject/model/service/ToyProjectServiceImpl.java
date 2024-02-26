package edu.kh.toyProject.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.Todo;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
import edu.kh.toyProject.model.dao.ToyProjectDAO;
import edu.kh.toyProject.model.dao.ToyProjectDAOImpl;

public class ToyProjectServiceImpl {
	
	private ToyProjectDAO dao = null;
	
	public ToyProjectServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		
		dao = new ToyProjectDAOImpl();
				
	}

	
	@Override
	public Map<String, Object> toyProjectFullView() {
	
		
		List<Toy> todoList = dao.toyProjectFullView();
		
		
		int completeCount = 0;
		
		for(Toy toy : todoList) {
			
			
			if(toy.isComplete()) {
				completeCount++;
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("toyProject", toyProject);
		map.put("completeCount", completeCount);
		
	
		return map;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		
		String fomattedDateTime =  regDate.format(formatter);
		
		return fomattedDateTime;
	}
	
	
	@Override
	public String toyDetailView(int index) {
		
		
		
		Toy toy = dao.toyDetailView(index);
		
		
		if(toy == null) return null;
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("-------------------------------------\n");
		sb.append( String.format("제목 : %s\n", toy.getTitle()));
		sb.append(String.format("등록일 : %s\n", dateFormat(todo.getRegDate())));
		sb.append(String.format("완료여부 : %s\n", toy.isComplete() ? "O" : "X"));
		sb.append("\n[세부 내용]\n");
		sb.append("-------------------------------------\n");
		sb.append(String.format("%s\n", toy.getDetail()));
		
		
		return sb.toString();
	}
	
	
	
	@Override
	public int toyAdd(String title, String content) throws Exception{
		
		
		Toy toy = new Toy(title, content, false, LocalDateTime.now());
		
		
		
		int index = dao.todoAdd(toy);
		
		return index;
	}
	
	
	
	@Override
	public boolean toyComplete(int index) throws Exception{
		
		return dao.toyComplete(index);
	}
	
	@Override
	public boolean toyUpdate(int index, String title, String content) throws Exception{
		
		return dao.toyUpdate(index, title, content) ;
	}
	
	
	@Override
	public String toyDelete(int index) throws Exception {
		
		
		Toy toy = dao.toyDelete(index);
		
		if(toy == null) return null;
		
		return toy.getTitle();
	}

	@Override
	public String toyDelete() {
		return null;
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	



