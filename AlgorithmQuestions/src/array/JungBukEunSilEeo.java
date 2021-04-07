package array;

import java.util.Arrays;
import java.util.LinkedList;

/*배열의 중복값 없애기*/
public class JungBukEunSilEeo {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		StringBuffer sb = new StringBuffer();
		for(int value : solution(arr)) {
			sb.append(value+" ");
		}
		
		System.out.println("중복 없앤 배열 ? "+ sb.toString());
		

	}
	
	public static int[] solution(int[] arr) {
	
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=list.getLast()) {
				list.add(arr[i]);
			}
		}
		
		Integer[] temp = list.toArray(new Integer[list.size()]);
		/*
		 * 스트림이란
		 * 자바에서는 파일이나 콘솔의 입출력을 직접 다루지 않고, 
		 * 스트림(stream)이라는 흐름을 통해 다룹니다. 스트림(stream)이란 실제의 입력이나 출력이 표현된 데이터의 이상화된 흐름을 의미합니다.
			Stream -> IntStream 변환 시, mapToInt(Integer::parseInt) 사용
			Stream -> IntStream 변환 시, mapToInt(Integer::intValue) 사용
			Arrays.stream(temp) : Object 반환
			intValue : Integer 값을 int 로 변환
		 */
		int[] answer = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
		return answer;
	}
	
	/* 다른 예시
	 public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
	 */

}
