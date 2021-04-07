package stack;

import java.util.LinkedList;
import java.util.Queue;

/*프린터
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 */
public class Printer {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		System.out.println("내가 요청한 인쇄 문서는 " + solution(priorities, location) + " 째로 인쇄됨");
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		Queue<Printers> q = new LinkedList<Printers>();
		for (int i = 0; i < priorities.length; i++) {
			q.add(new Printers(i, priorities[i]));
		}

		while (!q.isEmpty()) {
			boolean higherPriority = false;
			int peekPriority = q.peek().priority;
			for (Printers printer : q) {
				if(peekPriority < printer.priority) { // 큐에 제일 처음에 있는 값 	보다 큰 값이 있을 떄
					higherPriority = true;
				}
			}
			
			if (higherPriority == true) { // 큐에 제일 처음에 있는 값 보다 큰 값이 있으면, 가장 처음에 있는 값을 뒤로 보냄
				q.offer(q.poll());
			} else if (higherPriority == false ) { // 큐에 제일 처음에 있는 값이 가장 큰 값일 때
				if(q.poll().location == location) {
					answer = priorities.length  - q.size();
				}
			}
		}
		return answer;
	}

	static class Printers {
		int location;
		int priority;

		Printers(int location, int priority) {
			this.location = location;
			this.priority = priority;

		}
	}
}
