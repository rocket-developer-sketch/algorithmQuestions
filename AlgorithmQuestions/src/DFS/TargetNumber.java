package DFS;
/*타겟넘버 
 * https://programmers.co.kr/learn/courses/30/lessons/43165?language=java
 * */
import java.util.Arrays;

/* 
 * 배열의 모든 원소를 다 이용해서 target 값과 일치하는 경우를 찾는 문제
배열의 원소에 하나씩 마이너스를 붙인 뒤 모든 원소의 합을 target과 비교해나가는 방식으로 DFS를 이용해 구현했다.
다음 깊이로 넘어가 탐색이 가능한 경우는 모든 배열의 합이 target보다 큰 경우이다.
배열의 합이 target보다 작은 경우는 무슨 짓을 해도 target에 도달할 수 없다.
예를 들어 배열이 [1, 2, 3, 4, 5]이고 target이 9라고 해보자.
이 때 배열의 합은 1+2+3+4+5=15로 target보다 크다.
첫 번째 원소 1을 -1로 바꾸고 다음 깊이로 넘긴다.
이 때 배열의 합은 -1+2+3+4+5=13으로 target보다 크다.
두 번째 원소 2를 -2로 바꾸고 다음 깊이로 넘긴다.
이 때 배열의 합은 -1-2+3+4+5=9로 target과 일치한다. answer++를 해준 뒤 종료를 한다.
중복을 제거하기 위해 다음 깊이로 넘어가는 경우에는 해당 배열의 이전 원소들은 건들지 않는다.
 */
public class TargetNumber {
	static int targetNumber = 0;
	public static void main(String[] args) {
		int n[] = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(n, target));
	}

	static public int solution(int[] numbers, int target) {
		dfs(numbers, 0, 0, target);
		return targetNumber;
	}

	static public void dfs(int numbers[], int idx, int sum, int target) {		
		if (idx == numbers.length) { // ( 반복의 한 단계 ) 종료 조건 및 행동
			if (sum == target)
				targetNumber++;
		}

		else if (idx < numbers.length) { // 반복조건
			dfs(numbers, idx + 1, sum + numbers[idx], target);
			dfs(numbers, idx + 1, sum - numbers[idx], target);
		}
	}
}
