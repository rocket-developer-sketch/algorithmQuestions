package math;

/* 하샤드 수
 * 
 * */
public class Harshad {

	public static void main(String[] args) {
		int x = 13;
		System.out.println("하샤드 수? " + solution(x));
	}

	public static boolean solution(int x) {
		int sum = 0;
		int temp = x; // 나중에 x 값 사용할 거니까 temp 변수에 저장하여 변화하는 값으로 이용
		
		while (temp >= 1) {
			sum += temp % 10; // 나머지 합 == 자리수 합
			temp /= 10; // 다음 자리수 계산 위함
		}

		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}

	}
	/*
	 * string public static boolean solution(int x) { String convertNumStr =
	 * String.valueOf(x); int sum = 0; for(String strNum : convertNumStr.split(""))
	 * { sum += Integer.parseInt(strNum); }
	 * 
	 * if (x / sum == 0 ) { return true; } else { return false; }
	 * 
	 * }
	 */

}
