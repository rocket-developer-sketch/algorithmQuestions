package math;

/* 평균 구하기
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class PyeongunGuHaKi {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println("평균? " + solution(arr));
	}
	
	public static double solution(int[] arr) {
        double answer = 0;
        for(int num : arr) {
        	answer += num;
        }
        return answer / arr.length;
    }
	
}

