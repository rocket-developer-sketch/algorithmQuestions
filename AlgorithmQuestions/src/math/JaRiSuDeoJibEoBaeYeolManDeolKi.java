package math;

/* 자연수 뒤집어 배열로 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 *  */

public class JaRiSuDeoJibEoBaeYeolManDeolKi {
	public static void main(String[] args) {
		long n = 12345;
		for( int a : solution(n)) {			
			System.out.println("각 자리를 뒤집어진 배열의 원소로 가짐 " + a);
		}
	}
    public static int[] solution(long n) {
    	String longN = Long.toString(n);
        int[] answer = new int[longN.length()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = (int) (n % 10);
        	n = n /10;
        }

        return answer;
    }

}
