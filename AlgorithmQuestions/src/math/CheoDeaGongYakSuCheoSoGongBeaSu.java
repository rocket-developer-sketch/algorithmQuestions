package math;
/* 최대공약수와 최소공배수
 * https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
 */
public class CheoDeaGongYakSuCheoSoGongBeaSu {

	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		System.out.println("최대 공약수 ? " + solution(n,m)[0] + " 최소공배수 ? " + solution(n,m)[1]);

	}
	
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        answer[0] = gcd;
        answer[1] = gcd * (n / gcd) * ( m / gcd);

        return answer;
    }

	public static int gcd(int n, int m) {
		int big = Math.max(n, m);
		int small = Math.min(n, m);
		
		while (small != 0) {
			int mod = big % small;
			big = small;
			small = mod;
		}
		
		return big;
	}

}

/* 참고 
 * https://javacoding.tistory.com/56?category=352749
 */
