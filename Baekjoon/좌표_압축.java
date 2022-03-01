package Baekjoon.Silver;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
 
public class 좌표_압축 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] origin = new int[N];	// 원본 배열
		int[] sorted = new int[N];	// 정렬 할 배열
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// rank를 매길 HashMap
 
		
		for(int i = 0; i < N; i++) 
			sorted[i] = origin[i] = sc.nextInt();
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 갖고온다.
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
}