package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*기능개발
https://programmers.co.kr/learn/courses/30/lessons/42586
*/
public class GiNeongGeaBal {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		StringBuffer sb = new StringBuffer();
		for(int value : solution(progresses,speeds)) {
			sb.append(value+" ");
		}
		
		System.out.println("각 배포 마다 몇 개의 기능이 배포 ? "+ sb.toString());

	}
	
	public static int[] solution(int[] progresses, int[] speeds) {      
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = progresses.length -1; i >= 0; i--) {
        	int requireDays = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
        	stack.add(requireDays);
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        while (!stack.isEmpty()) {
        	int distribution = 1;  // 같은 날 몇 개까지 배포할 수 있는 지 카운트 하는 변수
        	int top = stack.pop();
        	// 꺼낸 값(top)과 현재 스택의 제일 위의 값을 비교해서 스택 위의 값이 작다라는 의미는
        	// 꺼낸 값(top) 일수만큼 일 진행하는 동안 스택 제일 위의 값(stack.peek()) 일수 만큼 일 진행이 되어 완료할 수 있다는 의미.
        	while(!stack.isEmpty() && stack.peek() <= top) {
        		distribution++;
        		stack.pop();
        	}
        	list.add(distribution);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }

}
