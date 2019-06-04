package com.biz.exec;

import com.biz.mode.Student;

public class Exec_02 {

	public static void main(String[] args) {

		// 선언된 Student class 사용해서
		// Student 객체를 선언하고
		// 사용할수 있도록 초기화를 수행
		Student student1 = new Student();
		student1.intNum = 1;
		student1.strName = "홍길동";
		student1.intGrade = 3;
		student1.srtDetp = "컴공과";

		Student student2 = new Student();
		student2.intNum = 2;
		student2.strName = "이몽룡";
		student2.intGrade = 2;
		student2.srtDetp = "물리학과";
		
		Student student3 = new Student();
		student3.intNum = 3;
		student3.strName = "성춘향";
		student3.intGrade = 4;
		student3.srtDetp = "회계학과";


		view(student1);
		view(student2);
		view(student3);
	
	}
	public static void view( Student std ) {
		System.out.println("학번:" + std. intNum);
		System.out.println("이름 :" +std.strName);
		System.out.println("학년:" + std.intGrade);
		System.out.println("학과:" + std. srtDetp);

	}

}
