package recursive;

public class Maze {
	private static int N = 8;
	private static int[][] maze = { { 0, 0, 0, 0, 0, 0, 0, 1 }, { 0, 1, 1, 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 0, 0, 1, 1, 0, 0 }, { 0, 1, 1, 1, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0, 1, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 0, 0 } };
	private static final int PATHWAY_COLOUR = 0; // white 통로
	private static final int WALL_COLOUR = 1; // blue 벽
	private static final int BLOCKED_COLOUR = 2; // red 방문했었고, 출구까지의 경로상에 있지 않음이 밝혀진 cell
	private static final int PATH_COLOUR = 3; // green 방문했고, 아직 출구로 가는 경로가 될 가능성이 있는 cell

	public static boolean findMazePath(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		} else if (maze[x][y] != PATHWAY_COLOUR) {
			return false;
		} else if (x == N - 1 && y == N - 1) { //출구
			maze[x][y] = PATH_COLOUR;
			return true;
		} else {
			maze[x][y] = PATH_COLOUR;
			if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1)) { // x,y 인접 4개의 셀  검사
				return true; // 위 검사 조건에서 하나라도 참이나오면 true 리턴
			}
			maze[x][y] = BLOCKED_COLOUR; // daed end 여기 도착했다는 것은 어느 방향으로라도 출구가 될 방향이 없다는 의미임
			return false;
		}
	}

	public static void printMaze() {
		for (int[] path : maze) {
			for (int cell : path) {
				System.out.print(cell);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		printMaze();
		findMazePath(0, 0);
		printMaze();
	}
}
