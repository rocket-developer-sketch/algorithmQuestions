package string;

/* 가운데 글자 가져오기 */
public class GaundeaGuelJa {
	public static void main(String[] args) {
		String str = "String";
		System.out.println("가운데 글자는 ? " + solution(str));
	}

	public static String solution(String str) {
		String answer = "";
		int countToMiddle = str.length() / 2;
		if (str.length() % 2 == 0) {
			// substring(int a, int b) : a에서 시작해서 b 앞에 까지 잘라 보여줌. 인덱스 b 의 문자 포함이 아니라 그 앞에
			// 까지만!
			answer = str.substring(countToMiddle - 1, countToMiddle + 1);
		} else {
			answer = str.substring(countToMiddle, countToMiddle + 1);
		}
		return answer;
	}

}
