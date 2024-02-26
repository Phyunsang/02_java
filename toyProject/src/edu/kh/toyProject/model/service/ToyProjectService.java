package edu.kh.toyProject.model.service;

import java.time.LocalDateTime;
import java.util.Map;

public interface ToyProjectService {
	
	public abstract Map<String, Object> toyProjectFullView();
	
	
	public abstract String dateFormat(LocalDateTime regDate);

	
	public abstract String toyDetailView(int index);

	
	public abstract int toyAdd(String title, String content) throws Exception;


	public abstract boolean toyComplete(int index) throws Exception;


	public abstract boolean toyUpdate(int index, String title, String content) throws Exception;


	public abstract String toyDelete(int index) throws Exception;


	public abstract String toyDelete();

	
	
	
	

}
