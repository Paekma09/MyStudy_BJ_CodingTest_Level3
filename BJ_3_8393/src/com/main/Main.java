package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int result = 0;
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			result = result + i;
		}
		System.out.println(result);
	}

}
