package math;
/*2016 은 윤년*/
public class TwoThousandSixteen {

	public static void main(String[] args) {
		int month = 5;
		int date = 26;
		System.out.println("몇 요일? "+solution(month, date));
	}
	
	public static String solution(int month, int date) {
		int total = 0;
		String[] w = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] m = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
		// 5월 이면, 5월 까지 매 달 월 총 일자를 더해야 5월달 까지 일자 흐름을 구할 수 있음
		for(int i = 0; i < month - 1; i++) {
			total += m[i];
		}
		// 5월에 도착하고, 5월 24일 이면, 5월 달까지 흐른 일자 에 24일 을 더해줘야 총 5월 24일까지의 일자수가 구해짐
		total += date-1;
		
		// 일주일은 7일 단위로 끊기니까
		return new String(w[total%7]);
	}

}
