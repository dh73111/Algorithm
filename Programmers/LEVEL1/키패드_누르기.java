package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 키패드_누르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
	}
	
	public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int Lhand = 10;
        int Rhand = 12;
        for (int i = 0; i < numbers.length; i++) {
        	int LCnt = 0, RCnt = 0;
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append('L');
				Lhand = numbers[i];
			}
			else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				sb.append('R');
				Rhand = numbers[i];
			}
			else {
				if(numbers[i] == 0)
					numbers[i] += 11;
				LCnt = (Math.abs(numbers[i] - Lhand)) / 3 + (Math.abs(numbers[i] - Lhand)) % 3;
				RCnt = (Math.abs(Rhand - numbers[i])) / 3 + (Math.abs(Rhand - numbers[i])) % 3;
				if(LCnt == RCnt) {
					if(hand.equals("right")) {
						sb.append('R');
						Rhand = numbers[i];
					}
					else {
						sb.append('L');
						Lhand = numbers[i];
					}
				}
				else if(LCnt > RCnt) {
					sb.append('R');
					Rhand = numbers[i];
				}
				else {
					sb.append('L');
					Lhand = numbers[i];
				}
			}
			
		}
        return sb.toString();
    }
	
}
