package math;

/* 콜라츠 추측
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Collatz {

	public static void main(String[] args) {
		int num = 16;
		System.out.println("몇 번 반복해야 1? " + solution(num));

	}

	public static int solution(int num) {
		int answer = 0;
		
		while (num != 1 && answer != 500) {
			
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (num * 3) + 1;
			}
			
			answer++;	

			if (answer> 500) {
				return -1;
			}
		}
		return answer;
	}
	
}
