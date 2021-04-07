package math;

import java.math.BigInteger;

/*멀쩡한 사각형
 * https://programmers.co.kr/learn/courses/30/lessons/62048
 * https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%A9%80%EC%A9%A1%ED%95%9C-%EC%82%AC%EA%B0%81%ED%98%95-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
 * 최대공약수
 */
public class MulJJeongHanSaGakHyeong {

	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println("사용할 수 있는 정사각형의 개수? " + solution1(w, h));

	}

	public static long solution1(int w, int h) {
		int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
		return ((long) w * (long) h) - (((long) w / gcd) + ((long) h / gcd) - 1) * gcd;
	}

	/* 기울기
	 * 기울기가 W/H인 y = W/Hx 에 0부터 W-1 까지 대입해 더해서 곱하기 2
	 *  */
	public static long solution2(long w, long h) {
		long answer = 0;
		
		for(int i = 0; i < w; i++) {
			answer += h*i/w;
		}		
		return answer * 2;
		
	}
}
