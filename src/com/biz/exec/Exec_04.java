package com.biz.exec;

import java.util.Random;

import com.biz.mode.Student;

public class Exec_04 {

	public static void main(String[] args) {
		
		//Student 클래스 객체 10개를 예약하라
		// 아직 예약만 되어있고
		// 가용 할 준비가 되지않은 상태
		Student[] stdScoce = new Student[10];
		
		// 객체 배열은 사용(읽기,쓰기)전에
		//각 배열 요소를 개별적으로 초기화하는 코드를 수행해야한다.
		stdScoce[0] = new Student();
		stdScoce[1] = new Student();
		stdScoce[2] = new Student();
		stdScoce[3] = new Student();
		stdScoce[4] = new Student();
		stdScoce[5] = new Student();
		stdScoce[6] = new Student();
		stdScoce[7] = new Student();
		stdScoce[8] = new Student();
		stdScoce[9] = new Student();
	
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
