package math;

import java.util.Arrays;

/* 비밀지도
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class BiMilJiDo {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 46, 33, 33 ,22, 31, 50 };
		int[] arr2 = { 27 ,56, 19, 14, 14, 10 };

		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
			answer[i] = answer[i].replace("1", "#").replace("0", " ");
		}
		
		return answer;
	}

	/* 
	 * 비트 연산
	 * https://vmpo.tistory.com/106
	 * 
	 * 
	 * 0진수를 2진수로 변환하는 함수인 Integer.toBinaryString(int num)
			| -> 둘 중 하나라도 1이면 1, 아니면 0 (OR)
			& -> 둘 중 모두 1이면 1, 아니면 0 (AND)
			^ -> 두 비트가 다를 때 1 출력 (XOR)
			~ -> 비트 전환 연산자 / 1이면 0, 0이면 1로 전환 
		출처: https://wooaoe.tistory.com/53 [개발개발 울었다]

	 *  String.format()
		- String의 자릿수를 맞추는 경우, String.format("%자릿수s", str)를 이용
		- 숫자의 자릿수를 맞추는 경우, String.format("%자릿수d",num)을 이용하면 된다.
	 */
}
