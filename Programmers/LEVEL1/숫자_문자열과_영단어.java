package programmers;

public class 숫자_문자열과_영단어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "one4seveneight";
		solution(s);
	}

	public static int solution(String s) {	
		s = s.replace("zero", "0");
		s = s.replace("one", "1");
		s = s.replace("two", "2");
		s = s.replace("three", "3");
		s = s.replace("four", "4");
		s = s.replace("five", "5");
		s = s.replace("six", "6");
		s = s.replace("seven", "7");
		s = s.replace("eight", "8");
		s = s.replace("nine", "9");
		
		return Integer.valueOf(s);
	}

}
