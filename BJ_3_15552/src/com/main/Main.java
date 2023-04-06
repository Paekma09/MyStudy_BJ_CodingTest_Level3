package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T;
		try {
			T = Integer.parseInt(br.readLine());
			for (int i = 1; i <= T; i++) {
				int A, B;
				StringTokenizer st = new StringTokenizer(br.readLine());
				int result = 0;
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				result = A + B;
				bw.write(result +""+"\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
