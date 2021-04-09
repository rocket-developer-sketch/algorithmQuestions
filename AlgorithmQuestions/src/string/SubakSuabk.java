package string;

/*수박수박수박수박수박수?
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class SubakSuabk {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("리턴된 문자열 ? " + solution(n));

	}

	public static String solution(int n) {
		String answer = "";
		// 0 부터 시작하면, 나머지가 0, 1 순으로 진행됨. 그래서 i 가 0 일 때, 그 안에서 또 다른 조건문이 필요함
		// 시작은 1부터
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) { // 홀수
				answer += "수";
			}
			if (i % 2 == 0) { // 짝수
				answer += "박";
			}
		}
		return answer;
	}
	
}
