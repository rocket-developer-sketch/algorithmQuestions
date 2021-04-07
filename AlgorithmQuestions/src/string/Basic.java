package string;

/*문자열 다루기 기본
https://programmers.co.kr/learn/courses/30/lessons/12918
*/
public class Basic {

	public static void main(String[] args) {
		String str = "a234";
		System.out.println("문자열길이 4 혹은 6 ? 숫자로만 구성? " + solution(str));

	}

	public static boolean solution(String str) {

		if (str.length() == 4 || str.length() == 6) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				int c2 = str.charAt(i);
				// character 그대로 숫자 0~9 까지 비교 할 수 있다.
				// 문자형 숫자 와 문자를 비교 할 때는 문자형 숫자에 ' ' 를 붙인다!! 
				if (c < '0' || c > '9') {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

}
