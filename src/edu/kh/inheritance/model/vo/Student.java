package edu.kh.inheritance.model.vo;

public class Student extends Person{
	//extends 사용 상속 
	//Student 클래스에 Person 클래스 내용을 확장한다.
	// == Student 클래스에 person 클래스 내용이 추가됨
	
	//private String name;
	//private int age;
	//private String nationality;
	private int grade;
	private int classRoom;
	
	
	public Student() {
		//기본 생성자
		//Student() 객체 생성시
		//내부에서 상속받은 Person 객체를 생성하기 위한
		//Person 생성자 호출 코드가 필요하다!
		//Person(); 이렇게 사용할 수 없다!
		super(); // super 생성자를 통해 부모의 생성자를 호출한다. 
		//부모의 생성자를 호출하는 코드
		//반드시 자식 생성자 최상단에 작성
		
		//* super() 생성자 미작성시
		//컴파일러가 컴파일 단계에서 자동 추가
	}


	public Student(String name, int age, String nationality, int grade, int classRoom) {
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		super(name, age, nationality);
		this.grade = grade;
		this.classRoom = classRoom;
	}

/*
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	@Override
	public String toString() {
		return super.toString() + "/" + grade + "/" + classRoom;	
	}

	
}
