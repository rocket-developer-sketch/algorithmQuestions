package math;

import java.util.Arrays;

/* 핸드폰 번호 가리기 
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 * */
public class HandPhoneBunHoKaRiKi {
	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println("전화번호 뒷4자리를 제외한 나머지 숫자 전부 * ? " + solution(phone_number));
	}

	public static String solution(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.length(); i++) {
			if ((phone_number.length() - 4) <= i) {
				answer += phone_number.charAt(i);
			} else {
				answer += "*";
			}
		}

		return answer;
	}
	/*
	public static String solution(String phone_number) {
		String answer = "";
		
		String[] numbers = phone_number.split("");
		int i = 0;
		for(String number : numbers) {
			if((numbers.length - 4) <= i) {
				numbers[i] = number;
			} else {
				numbers[i] = "*";
			}
			i++;
		}
		
		for(String number : numbers) {
			answer += number;
		}

		return answer;
	}
	*/
}
