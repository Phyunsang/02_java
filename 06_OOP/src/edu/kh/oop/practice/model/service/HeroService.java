package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.hero;

public class HeroService {
	
	public void practice() {
		
		hero hr = new hero();
		hero wizard = new hero();
		
		hr.setNickName("현상");
		hr.setJop("백수");
		hr.setHp(100);
		hr.setMp(100);
		hr.setLevel(100);
		hr.setExp(10);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
				hr.getJop(), hr.getNickName(), hr.getLevel() );
		
		
		wizard.setNickName("위자드");
		wizard.setJop(null);
		wizard.setHp(100);
		wizard.setMp(1000);
		wizard.setLevel(10);
		wizard.setExp(1000);
		
		System.out.printf("%s 직업으로 '%s' 님이 생성되었습니다. 현재 레벨 : %d \n",
				wizard.getJop(), wizard.getNickName(), wizard.getLevel() );
		
		wizard.attack(500);
		wizard.magicjump();
		
	}

}












