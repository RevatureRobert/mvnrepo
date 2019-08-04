package com.example;

import com.example.model.People;

public class MainDriver {
	public static void main(String[] args) {
		People person = new People(14,"dude");
		person.haveBirthday();
		System.out.println(person.work("the railroad"));
	}
}
