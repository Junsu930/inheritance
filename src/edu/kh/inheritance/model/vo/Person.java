package edu.kh.inheritance.model.vo;

public class Person {

	//필드
	//국민이라면 가지고 있는 것
	private String name;// 이름
	private int age; //나이
	private String nationality; //국적
	
	//기본생성자
	public Person() {}
	//매개변수 생성자
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		
	}
	
}

