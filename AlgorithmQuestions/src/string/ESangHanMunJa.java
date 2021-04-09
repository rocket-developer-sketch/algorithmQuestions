package string;

/*이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class ESangHanMunJa {

	public static void main(String[] args) {
		String str = "try hello world";
		System.out.println(solution(str));

	}

	public static String solution(String str) {
		String answer = "";
		char space = ' ';
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == space) {
				answer += space;
				count = 0;
			} else {
				if (count % 2 == 0) {
					answer += Character.toUpperCase(str.charAt(i));
					count++;
				} else {
					answer += Character.toLowerCase(str.charAt(i));
					count++;
				}
			}
		}
		
		return answer;
		
		/* 문자열 배열 과 문자로 풀은 방식 ASCII 코드를 문자로 형변환에 대해 배운 것 이용해 봄 */
		/*
		  String[] words = str.split(" "); 
		  for (int i = 0; i < words.length; i++) { 
		  		for (int j = 0; j < words[i].length(); j++) { 
		  			char c = words[i].charAt(j); 
		  			if (j % 2 == 0) { // 짝수번 문자라면 
		  				answer += (char) (c - 32); // 대문자로 
		  			} else { // 홀수라면
		  				answer += (char) c; // 소문자로 
		  			} 
	  			} 
		  	}
		 */

	}
}
