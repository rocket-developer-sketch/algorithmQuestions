package string;

/* 문자열을정수로바꾸기
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class MunJaYeolElJeongSuRoBaKKuKi {

	public static void main(String[] args) {
		String str = "-1234";
		System.out.println("문자열 s를 숫자로 변환한 결과 ? " + solution(str));

	}

	public static int solution(String s) {
		return Integer.parseInt(s);
	}
	
}
