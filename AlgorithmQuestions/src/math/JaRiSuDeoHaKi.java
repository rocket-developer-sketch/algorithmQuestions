package math;
/* 자리수 더하기 
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 * */
public class JaRiSuDeoHaKi {

	public static void main(String[] args) {
		int n = 123;
		System.out.println("자리수 합? " + solution(n));

	}

	
	public static int solution(int n) {
        int answer = 0;
    
        while (n > 0) {
        	answer += n % 10;
        	n = n / 10;
        	
        }

        return answer;
    }
	
	
	/* 형변환 이용
	 public static int solution(int n) {
	        int answer = 0;
	        
	        String strN = Integer.toString(n);
	        for (int i = 0; i < strN.length(); i++) {
	        	answer += Character.getNumericValue(strN.charAt(i)); //char 를 int로 변환
	        }
	        
	        return answer;
	    }
	 */
}
