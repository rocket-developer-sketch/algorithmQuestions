package greedy;

import java.util.Arrays;

/*구명보트
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 */
public class GuMyeongBoat {
	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		int limit = 100;
		System.out.println("모든 사람을 구출하기 위해 필요한 구명보트 개수의 최소값은 ? " + solution(people, limit));

	}

	public static int solution(int[] people, int limit) {
		int answer = 0;
		int min = 0;

		Arrays.sort(people);
		// i > 최대 몸무게를 가진 사람
		for (int max = people.length - 1; min <= max; max--) { // 최소값 위치가 최대값 위치보다 커지면 중지
			if (people[max] + people[min] <= limit) { // limit 보다 낮으면, 이 사람 구명보트에 태우기
				min++;
			}
			answer++;
		}
		return answer;
	}

}
