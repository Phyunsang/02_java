package edu.kh.toyProject.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ToyProjectDAOImpl implements ToyProjectDAO{
	
	private final String FILE_PATH = "/io_test/ToyProject.dat";
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;	
	
	private List<Toy> toyProject = null;
	
	public ToyProjectDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			
			try {
				// 객체 입력 스트림을 이용해서 입력 받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				toyProject = (ArrayList<Toy>)ois.readObject();
				
			} finally {
				
				if(ois != null) ois.close();
				
			}
			
		
			
			
		} else {
			
			File directory = new File("/io_test");
			if(!directory.exists()) directory.mkdir();
			
			
			toyProject = new ArrayList<Toy>();
			
			toyProject.add(new Toy("밤양갱", "비비", "힙합", "떠나는 길에 니가 내게 말했지"));
			toyProject.add(new Toy("첫눈", "엑소", "캐롤", "첫눈 오는 이런 오후에"));
			toyProject.add(new Toy("너의 모든 순간", "성시경", "발라드", "이윽고 내가 한눈에"));
			
			
			try {
				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(toyProject);
				
				
			} finally {
				
				if(oos != null) oos.close();
				
			}
			
			System.out.println("*** ToyProject 파일 생성 완료 ***");
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
