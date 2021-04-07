package recursive;

/* 멱집합: 전체집합의 부분집합 */
public class MyekJibHab {
	private static char data[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
	private static int n = data.length;
	private static boolean[] include = new boolean[n]; // 트리상에서 현재 위치를 표현한다​

	public static void powerSet(int k) { // 트리상에서 현재 위치
		if (k == n) { // 현재 위치가 리프 노드이면 출력, 리턴
			for (int i = 0; i < n; i++)
				if (include[i]) {
					System.out.print(data[i] + " ");
				}
			System.out.println("");
			return;
		}
		//그렇지 않고, 트리에 위치하고 있는 노드라면
		include[k] = false; // 트리의 왼쪽노드를 방문한다.
		powerSet(k + 1);
		include[k] = true; // 트리의 오른쪽노드를 방문한다.
		powerSet(k + 1);
	}
}
