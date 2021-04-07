package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 문자열 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12917*/
public class NeaRimChaSun {

	public static void main(String[] args) {
		String str = "Zbcdefg";
		System.out.println("내림차순으로 정렬 ? " + solution(str));
	}

	public static String solution(String str) {
		String answer = "";
		Character[] chars = new Character[str.length()];
		for (int i = 0; i< chars.length; i++) {
			chars[i] = str.charAt(i);
		}
		
		Arrays.sort(chars, Collections.reverseOrder());
		for(int i = 0; i < chars.length; i++) {
			answer += chars[i];
		}
		return answer;
	}
	
	/* 답이 나오지 않지만, 유용한 api
	public static String wrong(String str) {
		String[] strs = str.split("");
		Arrays.sort(strs);
		// 배열 -> 리스트 -> 리스트 원소를 역순으로 만듦
		Collections.reverse(Arrays.asList(str));
		return String.join("", strs);
	}
	*/
}
