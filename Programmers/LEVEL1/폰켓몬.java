package Programmers.lev1;


import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,1,2,3};
		solution(nums);
	}
    public static int solution(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
        
		for(int i=1; i<nums.length; i++) 
			if(!list.contains(nums[i]))
				list.add(nums[i]);
        
		answer = (list.size() < nums.length/2) ? list.size() : nums.length/2;
		return answer;
    }

}
