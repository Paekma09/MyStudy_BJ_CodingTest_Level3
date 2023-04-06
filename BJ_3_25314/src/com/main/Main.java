package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		for (int i = 1; i <= N/4; i++ ) {
			if (i != N/4) {
				System.out.print("long ");
			} else if (i == N/4) {
				System.out.print("long int");
			}
		}		
	}
}
