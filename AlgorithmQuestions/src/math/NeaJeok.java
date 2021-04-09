package math;

/* 내적
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 * 
 * 내적 : 2개의 동일한 속성을 가진 것 끼리 곱하고 전체를 더 함
 * 
 */
public class NeaJeok {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println("a와 b의 내적 ? " + solution(a,b));
	}
	
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
        	answer += a[i] * b[i];
        }
        
        return answer;
    }

}
