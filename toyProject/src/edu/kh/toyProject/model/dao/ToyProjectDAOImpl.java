package edu.kh.toyProject.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.toyProject.model.dao.Toy;
import edu.kh.toyProject.model.dao.ToyProjectDAO;

public class ToyProjectDAOImpl implements ToyProjectDAO {
private final String FILE_PATH = "/io_test/ToyList.dat";
	
	
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	
	private List<Toy> toyProject = null;
	
	// 기본생성자
	public ToyProjectDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			
			try {
				
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
			toyProject = (ArrayList<Toy>)ois.readObject();
				
			} finally {
				if(ois != null)ois.close();
			}
			
									
			
			
		} else {
			
			File directory = new File("/io_test");
			if(directory.exists()) directory.mkdir();
			
			
			toyProject = new ArrayList<Toy>();
			
			toyProject.add(new Toy("자바 공부", "수업 내용 복습하기", false, LocalDateTime.now()));
			toyProject.add(new Toy("CSS 공부", "수업 내용 복습하기", false, LocalDateTime.now()));
			toyProject.add(new Toy("HTML 공부", "수업 내용 복습하기", false, LocalDateTime.now()));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(toyProject);
				
			} finally {
				
				if(oos != null)oos.close();
				
			}
			
			System.out.println("*** TodoList.dat 파일 생성 완료 ***");
			
			
			
			
		}
		
		
		
		
	}

	@Override
	public void saveFile() throws Exception{
		
		try {
		
			
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(toyProject);
			
		} finally {
			
			oos.close();
		}
		
		
	}
		
	
	
	
	
	@Override
	public List<Toy> oyProjectFullView() {
		
		return toyProject;
				
	}
	
	@Override
	public Toy toyDetailView(int index) {
		
	
		if( index < 0 || index >= toyProject.size()) return null;
		
		return toyProject.get(index);
		
		
		
	}

	@Override
	public int toyAdd(Toy toy) throws Exception {
		
		if( toyProject.add(toy)) {
					
			saveFile();
			
			return toyProject.size() -1;
			
		}
		
		
		return -1;
	}

	@Override
	public boolean toyComplete(int index) throws Exception{
		
		
		if(index < 0 || index >= toyProject.size()) return false;
		
		
		boolean complete = toyProject.get(index).isComplete();
		toyProject.get(index).setComplete(!complete);
		
		saveFile();
		
		
		return true;
	}

	@Override
	public boolean toyUpdate(int index, String title, String content) throws Exception{
		

		Toy toy = new Toy(title, content,
				toyProject.get(index).isComplete(),
				toyProject.get(index).getRegDate()
				);
	
		if(toyProject.set(index, toy) != null) {
			saveFile();
			return true;
		}			
		
		return false;
	}

	@Override
	public Toy todoDelete(int index) throws Exception {
		
		if(index < 0 || index > toyProject.size()) return null;
				
		
		Toy toy = toyProject.remove(index);
		
		saveFile();
		
		return toy;
	}

	@Override
	public List<Toy> totProjectFullView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int toyAdd(Toy toy) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Toy toyDelete(int index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
	
	
}
