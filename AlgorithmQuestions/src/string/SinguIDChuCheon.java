package string;

/* 신규 아이디 추천 */
public class SinguIDChuCheon {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.println("추천 아이디는 ? " + solution2(new_id));
	}

	public static String solution1(String new_id) {
		String answer = "";
		String step1 = new_id.toLowerCase();

		char[] step1_chars = step1.toCharArray();
		// character 를 문자와 비교시는 "" 아니고, '' // String " " | char ' '

		StringBuilder step2 = new StringBuilder();
		for (char c : step1_chars) {
			if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
				step2.append(c);
			}
		}

		String step3 = step2.toString().replace("..", ".");
		while (step3.contains("..")) {
			step3 = step3.replace("..", ".");
		}

		String step4 = step3;
		if (step4.length() > 0) {
			if (step4.charAt(0) == '.') {
				step4 = step4.substring(1, step4.length());
			}
		}

		if (step4.length() > 0) {
			if (step4.charAt(step4.length() - 1) == '.') {
				step4 = step4.substring(0, step4.length() - 1);
			}
		}

		String step5 = step4;
		if (step5.equals("")) {
			step5 = "a";
		}

		String step6 = step5;
		if (step6.length() >= 16) {
			step6 = step6.substring(0, 15);

			if (step6.charAt(step6.length() - 1) == '.') {
				step6 = step6.substring(0, step6.length() - 1);
			}
		}

		StringBuilder step7 = new StringBuilder(step6);
		if (step7.length() <= 2) {
			char last = step7.charAt(step7.length() - 1);

			while (step7.length() < 3) {
				step7.append(last);
			}
		}

		answer = String.valueOf(step7);

		return answer;
	}

	/* 정규 표현식 */
	/*
	 * ^ : 시작표시(매칭이 처음부터 되어야 함) $ : 끝표시(문자열 끝에 매칭되어야 함) [] : 문자열 셋 [ab][a-z][0-9] 라고
	 * 써주면 첫글자는 a또는 b이고 그 다음에 a~z가 나오고 그 뒤에 0~9가 나온다는 뜻.. []안에서 ^쓰면 그 문자가 아닌것들 : 0번
	 * 이상 반복 + : 1번 이상 반복 ? : 0 또는 1회 {} : 횟수 표시 [a]{2}이면 aa이고 [a]{2,}이면 a가 2개 이상인거
	 * [a]{2, 4}이면 aa, aaa, aaaa 이다. \d : 숫자, [0-9]와 같음 \D : 숫자가 아닌 것들 [^0-9]와 같음 |
	 * : Or의 뜻 {} : 그룹을 묶어 준다. . : 뉴라인(\n)제외한 한 문자 (진짜 .을 찍기 위해선 \.으로 표시해야 한다.)
	 * 
	 */
	public static String solution2(String new_id) {
		String answer = new_id.toLowerCase();

		answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계 (-_.a-z0-9 외의 문자가 포함되면, 없애버린다)
		answer = answer.replaceAll("[.]{2,}", "."); // 3단계
		answer = answer.replaceAll("^[.]|[.]$", ""); // 4단계

		if (answer.equals("")) { // 5 단계
			answer += "a";
		}

		if (answer.length() >= 16) { // 6 단계
			answer = answer.substring(0, 15);
			answer = answer.replaceAll("[.]$", "");
		}

		if (answer.length() <= 2) { // 7 단계
			while (answer.length() < 3) {
				answer += answer.charAt(answer.length() - 1);
			}
		}

		return answer;
	}

}
