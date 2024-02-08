package edu.kh.oop.practice.model.vo;

public class hero {
	
	// 속성
	// 필드 == 멤버 변수
	
	private String nickName; // 닉네임
	private String jop; // 직업
	private int hp; // 체력
	private int mp; // 마력
	private int level; // 레벨
	private int exp; // 경험치
	
	
	
	//기능

	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJop() {
		return jop;
	}

	public void setJop(String jop) {
		this.jop = jop;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	/*
	 * - attack(exp) : nick + "은/는 공격을 했다"
	 * 출력 후 전달받은 경험치를 현재 경험치에 누적
	 * 누적 경험치가 500을 넘으면 레벨 1 업하기
	 * 레벨이 올랐다는 문구 출력 + 현재 레벨 표시
	 * 
	 * */
	
	
	public void attack(int exp) { 
			
		System.out.println(nickName + "은/는 공격을 했다!");
		
		// 전달 받은 경험치를 현재 경험치에 누적
		this.exp += exp;
		
		if(this.exp > 500) {
			level += 1;
			System.out.println("레벨이 올랐습니다!! 현재 레벨 : " + level);
		}
	}
	
	
	/* -magicjump() : 점프 할 때마다 nicName + "의 점프" 출력,
	 * 동시에 mp가 -10씩 감소됨
	 * 단, 현재 mp가 0이하라면
	 * "더 이상 매직 점프할 수 없어요!" 출력
	 * 
	 * */
	public void magicjump() {
		
		if(mp <= 0) {
			System.out.println("더 이상 매직 점프할 수 없어요!");
		} else {
		mp -= 10;
			System.out.println(nickName + "의 점프!");
	}
	
}
}
