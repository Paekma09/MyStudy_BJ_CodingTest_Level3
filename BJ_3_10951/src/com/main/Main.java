package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int A, B;
		while(sc.hasNextInt()) {	// 종료되는 시점을 입력값이 없을때로 정함.(꼭 복습해야함)
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}
