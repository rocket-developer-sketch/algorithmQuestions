package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PocketMon {

	public static void main(String[] args) {
		int[] nums = { 3, 3, 3, 2, 2, 4 };
//		System.out.println("포켓몬 종류 번호의 개수 ? " + solution1(nums));
	}

	/* 한 종류의 포켓몬을 1만개 넣으면 쓸모없음. 데이터의 중복제거가 필요함 => hashset 을 이용 */
	public static int solution1(int[] nums) {
		int max = nums.length / 2;
		HashSet<Integer> hashset = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			hashset.add(nums[i]);
		}

		/*
		 * 포켓몬 수 / 2 밖에 가져갈 수 없기 때문에 
		 * max 보다 크면 max 값 리턴 아니면 중
		 * 복 제거되어 hashset에 들어간 포멧몬 종류의 총 수 로  리턴
		 */

		if (hashset.size() > max) {
			return max;
		}

		return hashset.size();
	}
	
	/* arraylist 사용 */
	public int solution2(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);

		for (int i = 1; i < nums.length; i++)
			if (!list.contains(nums[i]))
				list.add(nums[i]);
		
		answer = (list.size() < nums.length / 2) ? list.size() : nums.length / 2;
		return answer;
	}
}
