package math;

/*소수찾기
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * 소수 : 자기 자신과 1만을 가지는 수
 * 1은 소수가 아님
 * 제곱근이 되면 소수 아님
 * 두 수의 나머지 연산이 0 이 아님
 * */
public class SoSuChatKi {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("1 부터 " + n + " 까지의 소수 개수? " + solution1(n));
	}
	
	/* 에라토스테네스의 체 이용 */
	public static int solution1(int n) {
		int answer = 0;
		
		int[] number = new int[n + 1];

		// 2부터 n까지의 수를 배열에 넣는다.
		for (int i = 2; i <= n; i++) {
			number[i] = i;
		}

		// 2부터 시작하여 그의 배수들을 0으로 만듦
		// 후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만듦
		for (int i = 2; i <= n; i++) {
			/*
			 * break 만나는 즉시 반복문 전체 탈출
				continue 만나면 해당 반복부분 탈출 후 다음반복실행
			 */
			if (number[i] == 0) {
				continue;
			}

			for (int j = 2 * i; j <= n; j += i) {
				number[j] = 0;
			}
		}

		// 배열에서 0이 아닌 것들의 개수를 세준다.
		for (int i = 0; i < number.length; i++) {
			if (number[i] != 0) {
				answer++;
			}
		}

		return answer;
	}

	public static int solution2(int n) {
		int answer = 0;
		boolean[] sosu = new boolean[n + 1];

		/* n 은 2이상 1000000이하의 자연수 라는 조건 때문에 */
		for (int i = 2; i <= n; i++) {
			sosu[i] = true; // 2~n 번쨰수를 true 로 초기화
		}

		// 제곱근 구하기
		int root = (int) Math.sqrt(n);

		for (int i = 2; i <= root; i++) {
			if (sosu[i] == true) { // i 번째 값이 소수일 때

				for (int j = i; i * j <= n; j++) { // 배수들은 소수가 아니기 때문에, 배수들은 false 로 초기화
													// j = i 는 i 가 2면, n까지의 2의 배수, i 3 면, n까지의 3의 배수...
					sosu[i * j] = false;
				}

			}
		}

		for (int i = 2; i <= n; i++) {
			if (sosu[i] == true) {
				answer++;
			}
		}

		return answer;
	}

	/* 시간초과 */
	public static int solution3(int n) {
		int answer = 0;

		for (int i = 2; i <= n; i++) {
			boolean check = true;
			for (int j = 2; j * j <= i; j++) { // 배수 지우기
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				answer++;
			}
		}
		return answer;
	}
}
