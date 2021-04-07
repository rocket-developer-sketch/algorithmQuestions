package math;
/*124 나라의 숫자 
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 */
public class OneTwoFourNaRa {

	public static void main(String[] args) {
		int n = 85;
		System.out.println("124 나라의 숫자는 ? " + solution(n));

	}
	 public static String solution(int n) {
	        String answer = "";
	        
	        /*
	         3 나머지 연산을 하면, 나오는 1,2,0 을 인덱스로 사용함
	         예시로 n = 1 , 2 , 3 일때
		        1 % 3 = 1 (124 나라 : 1)
	    		2 % 3 = 2 (124 나라 : 2)
	    		3 % 3 = 0 (124 나라 : 4)
	    		
	    		3으로 바로 나누어 떨어지는 경우에는 몫을 -1 하고, 나머지
    		*/
	        String[] nums = {"4", "1", "2"};
	        
	        while(n > 0) {
	        	answer = nums[n%3] + answer;
	        	n = (n-1) / 3;
	        }
	        
	        return answer;
	    }
}
