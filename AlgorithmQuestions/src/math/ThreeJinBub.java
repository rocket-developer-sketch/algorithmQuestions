package math;

import java.util.ArrayList;

public class ThreeJinBub {

	public static void main(String[] args) {
		int n = 45;
		System.out.println("자연수 - > 3진법 -> 뒤집은 후 다시 자연수 ? "+ solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		// 10 진법 -> 3진법 (역순)
		while (true) {
			if(n < 3) {
				temp.add(n);
				break;
			}
			// 리스트는 마지막 들어간 숫자가 가장 처음에 나오기 때문에 자연스럽게 역순이 됨
			// 한 번 반복될 때 마다 n 이 3 나눈 몫으로 줄어듦
			// 3 진법으로 바꾸는 것을 직접 손으로 써보면 알 수 있음
			temp.add(n%3);
			n = n / 3; 
		}
		
		// 3 진법 (역순) -> 10 진법
		for (int i=0; i<temp.size(); i++) {
			answer += (Math.pow(3, temp.size()-1-i)*temp.get(i));
		}
		
		return answer;
	}

}
