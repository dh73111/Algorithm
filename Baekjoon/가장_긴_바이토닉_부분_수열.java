package Baekjoon.Gold;

import java.util.Scanner;

public class 가장_긴_바이토닉_부분_수열 {
 
	static Integer[] r_dp;
	static Integer[] l_dp;
	static int[] seq;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
        
		r_dp = new Integer[N];	// LIS dp
		l_dp = new Integer[N];	// LDS dp
		seq = new int[N];
 
 
		for (int i = 0; i < N; i++) {
			seq[i] = in.nextInt();
		}
 
		for (int i = 0; i < N; i++) {
			LIS(i);
			LDS(i);
		}
 
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = Math.max(r_dp[i] + l_dp[i], max);
		}
		System.out.println(max - 1);
 
	}
 
	static int LIS(int N) {
 
		if (r_dp[N] == null) {
			r_dp[N] = 1; // 1로 초기화
 
			for (int i = N - 1; i >= 0; i--) {
				if (seq[i] < seq[N]) {
					r_dp[N] = Math.max(r_dp[N], LIS(i) + 1);
				}
			}
		}
		return r_dp[N];
	}
 
	static int LDS(int N) {
		
		if (l_dp[N] == null) {
			l_dp[N] = 1; // 1로 초기화
 
			for (int i = N + 1; i < l_dp.length; i++) {
				if (seq[i] < seq[N]) {
					l_dp[N] = Math.max(l_dp[N], LDS(i) + 1);
				}
			}
		}
		return l_dp[N];
	}
}
 