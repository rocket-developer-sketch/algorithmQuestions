package array;

import java.util.Arrays;

/* x만큼 간격이 있는 n개의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class XManKeomKanKyeok {

	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		System.out.println("x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트? " + Arrays.toString(solution(x, n)));
	}
	
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int temp = x;
        for (int i = 0; i < n; i++) {
	        	answer[i] = temp * (i+1);
        }
    
        return answer;
    }
	/*
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int sum = x;
        for (int i = 0; i < n; i++) {
	        	answer[i] = sum;
	        	sum += x;
        }
    
        return answer;
    }
    */

}
