package math;

import java.util.ArrayList;
import java.util.Arrays;

/*나누어 떨어지는 숫자 배열 */
public class NaNuEoDDulEoJiNeonSutJa {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
//		int[] arr = {3,2,6};
		int divisor = 5;
//		int divisor = 10;
		StringBuffer sb = new StringBuffer();
		for(int value : solution(arr, divisor)) {
			sb.append(value+" ");
		}
		System.out.println("나누어 떨어지는 숫자 배열 ? "+ sb.toString());
	}
	
	public static int[] solution(int[] arr, int divisor) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i =0; i < arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
			if(list.isEmpty()) {
				list.add(-1);
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		
		/* arraylist 를 int 배열로 변환 */
		//Integer[] temp = list.toArray(new Integer[list.size()]);
		//answer = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();

		return answer;
	}
}
