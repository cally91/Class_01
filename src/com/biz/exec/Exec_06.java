package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intNum = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {

			System.out.print(intNum[i] + "\t");

		}
		System.out.println();
		int index;
		for ( index = 0; index < intNum.length; index++) {
			if (intNum[index] == 7) {

				System.out.print("7은 "+(index + 1) + "번째 있슴");
				
				break;

			}if (index >= intNum.length) {
				System.out.println("7은 없습니다.");
			}
		}

	}

}
