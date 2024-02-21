package com.poppyPlaytime.model.dto;

public class Toy {

	private String name;
	private int age;
	private int price;
	private String color;
	private int mfd;
	private String materials;
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, int mfd, String materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.mfd = mfd;
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMfd() {
		return mfd;
	}

	public void setMfd(int mfd) {
		this.mfd = mfd;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + ", price=" + price + ", color=" + color + ", mfd=" + mfd
				+ ", materials=" + materials + "]";
	}
	
	
	
	
	
	
}
