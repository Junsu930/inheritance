package edu.kh.inheritance.model.service;
import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	public void ex1() {
		// 상속 확인용 메소드
		// - person을 상속받은 Student가 Person의 필드, 메소드를 사용할 수 있는가? 
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(49);
		p.setNationality("남수단");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
	
		System.out.println("==================");
		
		// Student 객체 생성
		
		Student std = new Student();
		
		// Student만 가지고 있었던 고유 메소드 ㅇ
		std.setGrade(2);
		std.setClassRoom(5);
		std.setName("김찐빵");
		std.setAge(18);
		std.setNationality("아일랜드");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("====================");
		
		p.breath();
		std.breath();
		p.move();
		std.move();
		
		Employee emp = new Employee();
		emp.move();
	}

	public void ex2() {
		//super() 생성자 사용 방법
		Student std = new Student("김빵빵", 12, "브라질", 2, 12);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		

		
	}

	public void ex3() {
		Person p = new Person("김갑환", 30, "한국");
		
		// toString 오버라이딩 테스트 
		
		System.out.println(p.toString());
		System.out.println(p);
		// print 구문 수행 시 참조변수 명을 작성하면
		// 자동으로 toString() 메소드를 호출해서 출력한다! 
		
		// super 참조변수
		
		Student std = new Student("조나단", 30, "캐나다", 3, 5);
		System.out.println(std.toString());
		
		Employee emp = new Employee("빵빵이", 50, "스페인", "삼성"); 
		
		System.out.println(emp.toString());
		
	}
}
