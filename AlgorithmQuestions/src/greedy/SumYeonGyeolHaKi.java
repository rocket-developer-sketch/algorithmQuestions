package greedy;
/*섬 연결하기
 * https://programmers.co.kr/learn/courses/30/lessons/42861
 * https://tosuccess.tistory.com/22
 */
public class SumYeonGyeolHaKi {

	public static void main(String[] args) {
		int n  =4; // 섬 개수
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}}; // 부모, 자식, 비용
		System.out.println("모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용 ? "+ solution(n, costs));

	}
	
	public static int solution(int n, int[][] costs) {
        int answer = 0;
        
        
        return answer;
    }

}
