package com.baewooga.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
	
//		명시적 생성자를 사용하여 객체를 생성하고
//		모든 필드를 출력하시오
		
		
		Student student = new Student("민수", "1234-1234", 11);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		
		Student student2 = new Student("민수", "1234-1234");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		
		

		
		
		
		
		
	}

}
