package math;

/* 약수의 합
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class YakSuEoHab {

	public static void main(String[] args) {
		int n = 12;
		System.out.println("n의 약수를 모두 더한 값? " + solution(n));

	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}
