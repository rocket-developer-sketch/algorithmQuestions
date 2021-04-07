package math;

/* 두 정수 사이의 합 */
public class DuJeongSuSaiHab {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println("두 정수의 합 ? " + solution2(a, b));
	}

	public static long solution1(int a, int b) {
		long answer = 0;
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <=a; i++) {
				answer += i;
			}
		}

		return answer;

	}
	
	public static long solution2(int a, int b) {
		long answer = 0;
		
		if ( a != b) {
			int start = Math.min(a, b);
			int end = Math.max(a, b);
			for(int i = start; i <= end; i++) {
				answer += i;
			}
		} else if (a==b) {
			answer = a;
		}	
		return answer;
	}
}
