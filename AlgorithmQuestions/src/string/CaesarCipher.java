package string;

public class CaesarCipher {

	public static void main(String[] args) {
		String str = "a B z";
		int n = 4;
		System.out.println("암호 ? " + solution(str, n));
	}

	public static String solution(String str, int n) {
		String answer = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// 아스키 코드 값으로 char 로 형변환
			// 문자 비교 부호 헷갈리지 않도록 조심 !
			if ('a' <= c  && c <= 'z') { // 소문자
				if ('a' <= c+n &&  c+n <= 'z' ) {
					answer += (char) (c + n);
				} else if ('z' < c + n) {
					answer += (char) (c + n - 26);
				}
			} else if ('A' <= c && 'Z' >= c) { // 대문자
				if ('A' <= c+n  &&  c+n <= 'Z' ) {
					answer += (char) (c + n);
				} else if ('Z' < c + n) {
					answer += (char) (c + n - 26);
				}
			} else { //공백 등
				answer += (char) c;
			}
		}

		return answer;
	}

}
