package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		for (int i = 1; i <= N; i++ ) {
			for (int j = N; j >=1; j--) {
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}
}
