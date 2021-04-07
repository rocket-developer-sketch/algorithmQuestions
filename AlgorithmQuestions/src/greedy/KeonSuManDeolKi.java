package greedy;

/*큰 수 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/42883
 */
public class KeonSuManDeolKi {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;

		System.out.println("k 개를 제거하고 남은 문자열로 만들 가장 큰 수 ? " + solution(number, k));

	}

	public static String solution(String number, int k) {

		int index = 0;
		char max = '0';
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0)== '0' || number.length() - k == 0) {
			return "0";
		}
		
		for (int i = 0; i < number.length() - k; i++) {
			max = '0';
			for (int j = index; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j); // 현재 값 저장
					index = j + 1; // 현재 다음 인덱스 저장
				}
			}
			answer.append(max);
		}
		return answer.toString();
	}
}
