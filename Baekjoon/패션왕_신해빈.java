package Baekjoon.Silver;

import java.util.Scanner;
import java.util.HashMap;
 
public class 패션왕_신해빈 {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int T = sc.nextInt();	// 테스트 케이스 
 
		while (T -- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>
			
			int N = sc.nextInt();	// 입력받는 옷의 개수
			
			while (N-- > 0) {
				
				sc.next();	// 옷 이름은 필요 없음 
				
				String kind = sc.next();	// 옷 종류 
				
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
 
			int result = 1;
			for (int val : hm.values()) {
				result *= (val + 1);
			}
	
			System.out.println(result - 1);		
		}
	}
}