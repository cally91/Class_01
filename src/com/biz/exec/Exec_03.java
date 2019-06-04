package com.biz.exec;

public class Exec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10]; //학번
		String[] strName = new String[10]; //이름
		int intkor[] = new int[10]; //국어
		int inteng[] = new int[10];//영어
		int intmath[] = new int[10]; //수학
		intNum[0] = 1;
		strName[0] = "홍길동";

		intkor[0] = 90;
		inteng[0] = 70;
		intmath[0] = 70;

		intNum[1] = 2;
		strName[1] = "이몽룡";

		intkor[1] = 90;
		inteng[1] = 80;
		intmath[1] = 70;

		intNum[2] = 3;
		strName[2] = "성춘향";

		intkor[2] = 77;
		inteng[2] = 88;
		intmath[2] = 98;

		intNum[3] = 4;
		strName[3] = "임꺽정";

		intkor[3] = 90;
		inteng[3] = 70;
		intmath[3] = 70;

		System.out.println("===========================================================");
		System.out.println("학번\t이름\t 국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < 3; i++) {
			int intSum = intkor[i];
			intSum += inteng[i];
			intSum += intmath[i];
			intSum = intkor[i]+inteng[i]+intmath[i];
			
			float fAvg =intSum/3.0f;

			System.out.print(intNum[i] + "\t");
			System.out.print(strName[i] + "\t");

			System.out.print(intkor[i] + "\t");
			System.out.print(inteng[i] + "\t");
			System.out.print(intmath[i] + "\t");
			System.out.print(intSum + "\t");
			System.out.print(fAvg + "\t");
			System.out.println();

		}
		System.out.println("===========================================================");

	}

}
