package string;

/*
 * 서울에서 김서방 찾기
https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class SeoulEaSeoKimSeoBang {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println("김서방의 위치 x 는? " + solution(seoul));
	}

	public static String solution(String[] seoul) {
		String answer = "";
		
		String Kim =  "Kim";
		
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals(Kim)) {
				answer = "" + i;
				break;
			}
		}
		
		return answer;
	}
}
