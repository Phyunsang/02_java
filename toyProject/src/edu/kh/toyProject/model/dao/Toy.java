package edu.kh.toyProject.model.dao;

import java.io.Serializable;

// 직렬화
public class Toy implements Serializable{
	
	private String titleOfSong; // 노래 제목
	private String singer; // 가수
	private String genre; // 음악 장르
	private String lyrics; // 가사
	
	public Toy() {}

	public Toy(String titleOfSong, String singer, String genre, String lyrics) {
		super();
		this.titleOfSong = titleOfSong;
		this.singer = singer;
		this.genre = genre;
		this.lyrics = lyrics;
	}

	public String getTitleOfSong() {
		return titleOfSong;
	}

	public void setTitleOfSong(String titleOfSong) {
		this.titleOfSong = titleOfSong;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "Toy [titleOfSong=" + titleOfSong + ", singer=" + singer + ", genre=" + genre + ", lyrics=" + lyrics
				+ "]";
	}
	
	
	
	
	
	
}
