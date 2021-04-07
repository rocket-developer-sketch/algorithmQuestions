package stack;

import java.util.Stack;

/* 인형뽑기*/
public class InhyeongBBobGi {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println("인형이 사라진 개수 ? " + solution(board, moves));

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<Integer>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(basket.isEmpty()) {
						basket.push(board[j][moves[i]-1]);
					} else {
						if(basket.peek() == board[j][moves[i]-1]) {
							basket.pop();
							answer += 2;
						} else {
							basket.push(board[j][moves[i] - 1]);
						}
					}
					// 다시 똑같은 곳은 검사 안하도록 0 넣어주기
					board[j][moves[i] - 1] = 0;
					// j 증가 안하도록 빠져나가기. 집게는 0 아닌 값을 찾기 위해 아래로 계속 내려가야하고, 옆으로 옮겨지면 안돼니까. 
					break;
				}
			}
		}
		return answer;
	}
}
