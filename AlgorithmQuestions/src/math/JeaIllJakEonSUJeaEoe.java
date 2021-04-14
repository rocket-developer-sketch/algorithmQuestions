package math;

import java.util.Arrays;

/* 제일 작은 수 제거하기
https://programmers.co.kr/learn/courses/30/lessons/12935
*/
public class JeaIllJakEonSUJeaEoe {

	public static void main(String[] args) {
//		int[] arr = { 4, 1, 2, 1 };
		int[] arr = { 4, 1, 2, 3 };
//		int[] arr = { 10 };
		for (int a : solution(arr)) {
			System.out.println("가장 작은 수를 제거한 배열을 리턴( 빈 배열이면 -1 ) ?  " + a);
		}

	}

	public static int[] solution(int[] arr) {
		int length = arr.length - 1;

		if (length == 0) {
			return new int[] { -1 };
		}

		int min = arr[0];
		for (int a : arr) {
			min = Math.min(min, a);
		}

		int[] answer = new int[length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue; // 뛰어넘고 다음 반복
			}
			answer[index++] = arr[i]; // 위 조건문에서 걸리면 실행되지 않음
		}

		return answer;
	}

	/*
	 * public static int[] solution(int[] arr) { int length = arr.length - 1;
	 * 
	 * if (length == 0) { return new int[] {-1}; } else { int[] answer = new
	 * int[length];
	 * 
	 * Arrays.sort(arr);
	 * 
	 * for (int i = 0; i < answer.length; i++) { answer[i] = arr[i + 1];
	 * 
	 * }
	 * 
	 * return answer; } }
	 */

}
