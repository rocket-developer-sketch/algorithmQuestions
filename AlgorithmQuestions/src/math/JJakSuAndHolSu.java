package math;

/*짝수와홀수
 * https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
 * */
public class JJakSuAndHolSu {

	public static void main(String[] args) {
		int n = 3;
		System.out.println("짝수? 홀수? " + solution(n));

	}

	public static String solution(int num) {
		String answer = "";
		
		if(num %2 ==0 ) {
			answer ="Even";
		} else {
			answer = "Odd";
		}
		
		return answer;
	}
}
