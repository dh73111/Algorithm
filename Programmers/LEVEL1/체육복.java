package Programmers.lev1;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};
		solution(n, lost, reserve);
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
        int answer = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = 1;
		}
        
        for (int i = 0; i < lost.length; i++) 
			arr[lost[i] - 1]--;
		
        
        for (int i = 0; i < reserve.length; i++) {
			arr[reserve[i] -1]++;
		}
        
        
		for (int i = 0; i < n; i++) {
			if(arr[i] >= 1)
				answer++;
			
			if (arr[i] > 1) {
				
				if (i - 1 >= 0 && arr[i - 1] == 0) {
					arr[i - 1]++;
					answer++;
				} else if (i + 1 < n && arr[i + 1] == 0) {
					arr[i + 1]++;
				}

			}
		}
        System.out.println(answer);
        return answer;
    }
}
