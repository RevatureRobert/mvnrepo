package com.example.model;

public class People {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(this.name==null) {
			return "People [age= "+age+"]";
		}else {
		return "People [age=" + age + ", name=" + name + "]";
		}
	}

	public int haveBirthday() {
		this.age++;
		return this.age;
	}

	public String work(String work) {
		return "I am working on " + work;
	}

}
