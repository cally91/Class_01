package com.biz.mode;

import java.util.Random;

import com.biz.mode.Student;

public class StudentArray {
	/*
	 * Student 클래스를 객체배열로 생성하고
	 * 가상의 학생 성적 데이터를 만들어서
	 * return 하는 method을 변경
	 */
	public Student[] makeScore(int stdLen) {
		
		// 숫자형배열은
		// 배열을 초기화하면 갓 개별값이 0으로 생성
		
		int[]intA= new int[10];
		//문자열형배열은
		// 배열을 초기화 하면  각 개별값이 ""으로 생성
		String[] StrA =new String[10];
		
		// 기타 다른 클래스들을 이용한
		// 객체 배열은 사용(읽기,쓰기)전에
		//각 배열 요소를 개별적으로 초기화하는 코드를 수행해야한다.
	
		
		//Student 클래스 객체 10개를 예약하라
		// 아직 예약만 되어있고
		// 가용 할 준비가 되지않은 상태
		Student[] stdScoce = new Student[stdLen];
		
		// 가상의 성적을 만들기 위해 난수발생기를 사용한다
		Random rnd =new Random();
		//for반복문을 사용해서 같은 코드을 10번 수행한다
		for (int i =0; i <stdScoce.length;i++) {
			stdScoce[i] =new Student();
			
			stdScoce[i].intNum =i+1;
			stdScoce[i].intKor =rnd.nextInt(50)+51;
			stdScoce[i].intEug =rnd.nextInt(50)+51;
			stdScoce[i].intMath =rnd.nextInt(50)+51;
		}
		
		return stdScoce;

	} //makeScore 끝나는 부분

	public void  viewScore(Student[] stdScoce) {
		
	System.out.println("===========================================================");
	System.out.println("학번\t 국어\t영어\t수학\t총점\t평균");
	System.out.println("-----------------------------------------------------------");
	for (int i = 0; i < stdScoce.length; i++) {
		int intSum = stdScoce[i]. intKor;
		intSum += stdScoce[i].intEug;
		intSum += stdScoce[i].intMath;
		
		
		float fAvg =intSum/3.0f;

		System.out.print(stdScoce[i].intNum + "\t");
		

		System.out.print(stdScoce[i].intKor + "\t");
		System.out.print(stdScoce[i].intEug + "\t");
		System.out.print(stdScoce[i].intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.print(fAvg + "\t");
		System.out.println();

	}
	System.out.println("===========================================================");
	}
}
