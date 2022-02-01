package programmers;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		solution(lottos, win_nums);
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {0, 0};
        int cnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0)
            	cnt++;
        }

        for(int j = 0; j < 6; j++) {
            for(int k = cnt; k < 6; k++) {
                if(win_nums[j] != lottos[k])    
                	continue;
                answer[0]++;
                answer[1]++;
            }
        }

        answer[0] += cnt;

        for(int i = 0; i < 2; i++) {
            if(answer[i] == 6) 
            	answer[i] = 1;
            else if(answer[i] == 5) 
            	answer[i] = 2;
            else if(answer[i] == 4) 
            	answer[i] = 3;
            else if(answer[i] == 3) 
            	answer[i] = 4;
            else if(answer[i] == 2) 
            	answer[i] = 5;
            else 
            	answer[i] = 6;
        }

        return answer;
	}

}
