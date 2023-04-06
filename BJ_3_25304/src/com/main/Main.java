package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, N;
		int amount = 0;
		X = sc.nextInt();
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++ ) {
			int a, b;
			int result = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			result = a * b;
			amount = amount + result;
		}		
		if (X == amount) {
			System.out.print("Yes");
		} else if (X != amount) {
			System.out.print("No");
		}	
	}
}
