package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 문자열 내 마음 대로 정렬하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * */

/*
 * Comparator는 기본적으로 Object를 매개변수로 받아서 비교한다. 
 * 따라서, Comparator를 통해 정렬을 하고자할 때 정렬 대상이 primitive 타입이라면 
 * wrapper 클래스를 이용해 Object로 만들어서 매개변수로 넘겨야 한다.
 * https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0-Java
 */
public class NeaMaUmDeaRoJeongRyeol {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;

		result.append("[ ");
		for (String strs : solution1(strings, n)) {
			result.append(strs + " ");
		}
		result.append("]");
		System.out.println("n 번째 문자를 기준으로 문자열 정렬 ? " + result);

	}

	/* n번째 문자를 기존 문자열에 붙여 중복값에 영향을 안 받는 것과 Collections.sort()함수 사용 */
	public static String[] solution1(String[] strings, int n) {
		String[] answer = new String[strings.length];

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1);
		}

		return answer;
	}

	public static String[] solution2(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				char c1 = str1.charAt(n);
				char c2 = str2.charAt(n);

				// n 번째 문자가 같을 경우에 원본 스트링을 사전 순으로
				if (c1 == c2) {
					return str1.compareTo(str2);
				} else {
					return c1 - c2;
				}
			}
		});
		return strings;
	}
}
