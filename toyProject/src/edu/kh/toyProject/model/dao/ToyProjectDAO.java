package edu.kh.toyProject.model.dao;

import java.util.List;

public interface ToyProjectDAO {
	
public void saveFile() throws Exception;
	
	
	List<Toy> totProjectFullView();
	
	
	Toy toyDetailView(int index);


	int toyAdd(Toy toy) throws Exception;


	public boolean toyComplete(int index) throws Exception;



	public boolean toyUpdate(int index, String title, String content) throws Exception;


	public Toy toyDelete(int index) throws Exception;


	List<Toy> toyProjectFullView();


	

}
