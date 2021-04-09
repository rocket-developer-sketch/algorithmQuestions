package dfs;
/*네트워크
 * https://programmers.co.kr/learn/courses/30/lessons/43162?language=java
 */
public class Network {

	public static void main(String[] args) {
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int n = 3;
		

		System.out.println("네트워크 개수 ? "+solution(computers, n));

	}

	public static int solution(int[][] computers, int n) {
		int answer = 0;
		boolean[] visited = new boolean[n];
		
		for (int parent = 0; parent < n; parent++) {
			 // dfs 에서 노드와 검사 조건에 맞는 다른 노드를 방문하면서 노드 방문 여부를 체크 함
			// 방문하지 않은 노드인 경우에만 검사
			if (visited[parent] == false) {
				dfs(parent, computers, visited);
				answer++;
			}
		}
		
		return answer;
	}

	private static void dfs(int node, int[][] computers, boolean[] visited) {
		visited[node] = true;
		
		for (int target = 0; target < computers.length; target++) {
			// 현재 노드에서 다른 노드 검사 예를 들어 첫번째 노드(node = 0) 라면, {1,1,0}
			// node != target 자기 자신 노드 제외  {1,1,0} 에서 0,0
			// computers[node][target] == 1  다른 노드 중 1인 값 {1,1,0} 에서 0.1 과 0,2 
			// visited[target] == false 다른 노드 는 방문을 했으면 안 됨
			if(node != target && computers[node][target] == 1 && visited[target] == false) {
				dfs(target, computers, visited); // 조건에 맞으면 조건에 맞는 노드를 검사하기 위한 재귀
			}
		}

	}
}
