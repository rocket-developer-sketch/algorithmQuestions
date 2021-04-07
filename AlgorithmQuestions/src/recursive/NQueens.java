package recursive;

public class NQueens {
	private final static int N = 8;
	private static int[] cols = new int[N + 1];

	public static void main(String[] args) {
		queens(0);
	}

	private static boolean queens(int level) {
		if (!promising(level)) { //현재까지 놓인 말들이 충돌 없이 잘 놓여졌는지 검사
			return false;
		}
		else if (level == N) { // 모든 말이 놓였다는 의미
			for (int i = 1; i <= N; i++) {
				System.out.println("(" + i + ", " + cols[i] + ")");
			}
			return true;
		}
		for (int i = 1; i <= N; i++) { // 해당 행에서 모든 열 검사 반복. 자식 노드 검사
			cols[level + 1] = i;
			if (queens(level + 1))
				return true;
		}
		return false;
	}

	private static boolean promising(int level) {
		for (int i = 1; i < level; i++) {
			if (cols[i] == cols[level]) { // 동일 열 검사
				return false;
			}
			else if ((level - i) == Math.abs(cols[level] - cols[i])) { // 동일 대각선 검사
				return false;
			}
		}
		return true;
	}

}
