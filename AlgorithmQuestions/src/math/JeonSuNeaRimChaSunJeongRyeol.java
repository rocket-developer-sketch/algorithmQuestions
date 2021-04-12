package math;

import java.util.Arrays;
import java.util.Collections;

/* 정수 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 * */
public class JeonSuNeaRimChaSunJeongRyeol {

	public static void main(String[] args) {
		long n = 118372;
		System.out.println("정수 내림차순으로 배치 후 ? " + solution(n));

	}

	public static long solution(long n) {
		long answer = 0;

		String strN = String.valueOf(n);
		char[] chars = strN.toCharArray();
		
		Arrays.sort(chars);
		
		String reverse = new StringBuilder(new String(chars)).reverse().toString();
		answer = Long.parseLong(reverse);

		return answer;
	}
	
	/*
	public static long solution(long n) {
		long answer = 0;
		
		String strN = String.valueOf(n);
		String[] splitN = strN.split("");
		
		Arrays.sort(splitN);
		
		Collections.reverse(Arrays.asList(splitN)); // 문자열 배열일 때 reverse (역순으로) 정렬 되는 것이 확인되지만 문자 인 경우에서는 작동하지 않았음
		
		answer = Long.parseLong(String.join("", splitN));
		
		return answer;
	}
	*/
		
	/* 
	public static long solution(long n) {
		long answer = 0;
		
		String longN = String.valueOf(n);
		char[] chars = longN.toCharArray();
		Arrays.sort(chars); // 오름차순정렬

		String reverse = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			reverse += chars[i];
		}

		answer = Long.parseLong(reverse);

		return answer;
	}
	*/
}
