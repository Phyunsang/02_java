package edu.kh.toyProject.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import edu.kh.toyProject.model.dao.ToyProjectDAO;
import edu.kh.toyProject.model.dao.ToyProjectDAOImpl;

public class ToyProjectServiceImpl implements ToyProjectService{
	
	private ToyProjectDAO dao = null;
	
	public ToyProjectServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		dao = new ToyProjectDAOImpl();
		
	}

	@Override
	public Map<String, Object> toyProjectFullView() {
		
		List<E> dao.toyProjectFullView();
		
		
		return null;
	}
	
	
	
}
	
	
	
	
	
	



