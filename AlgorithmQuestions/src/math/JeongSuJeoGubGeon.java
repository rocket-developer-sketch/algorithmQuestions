package math;
/*정수 제곱근 판별
https://programmers.co.kr/learn/courses/30/lessons/12934
*/

public class JeongSuJeoGubGeon {

	public static void main(String[] args) {
		long n =121;
		System.out.println("n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴 ? " +solution(n));

	}

	public static long solution(long n) {
		Double squrt = Math.sqrt(n);
		if (squrt == squrt.intValue() ) { // 11.0 == 11 비교. double 과 int 비교가 됨을 배움
			  return (long)Math.pow(squrt + 1, 2); // Math.pow : 제곱 만들기. 실수형 double 반환
		} else {
			return -1;
		}
	}
	
	/*
	public static long solution(long n) {
		if (Math.sqrt(n) % 1.0 == 0.0) {
			int sqrt = (int) Math.sqrt(n) + 1;
			return sqrt * sqrt;
		} else {
			return -1;
		}
	}
	*/
}
