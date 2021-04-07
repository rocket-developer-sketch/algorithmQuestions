package greedy;

public class Cheyukbok {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		System.out.println("체육수업 들을 수 있는 학생의 최대값 : " + solution(n, lost, reserve));
	}
	
	public static int solution(int n,  int[] lost, int[] reserve) {
		int[] all = new int[n];
		/*
		 인덱스 = 학생 번호
		 값 = 학생의 체육복 상태
		 	학생의 체육복 상태 : 0 , 1, -1
		 		0 : 기본 상태(체육복이 있고, 도난 당하지 않은 상태)
		 		1 : 여부의 체육복이 있는 상태
		 		-1 : 체육복을 도난 당한 상태
		 */
		for(int i : reserve) {
			all[i-1]++;
		}
		
		for(int j : lost) {
			all[j-1]--;
		}
		
		for (int i=0; i < all.length; i++) {
			if (all[i] < 0) { // 체육복 상태가 -1 = 도난 당한 상태
				if (i != all.length - 1 && all[i + 1] > 0) { // 마지막 학생이 아니고, 처음 학생 다음부터 1일 때 (빌려줄 여분이 있을 떄). 뒷 번호 학생이 여분 있을 떄
					all[i]++; // 도난 당한 학생의 체육복 상태 -1 에서 +1 해주어 기본 상태가 됨
					all[i+1]--; //여분의 체육복 가졌던 학생의 체육복 상태 +1 에서 -1 해주어 기본 상태가 됨
				} else if (i!=0 && all[i-1] > 0) { // 첫 번째 학생이 아니고, 앞 번호 학생이 여분 있을 떄
					all[i]++;
					all[i-1]--;
				}
			}
		}
		
		int answer = 0;
		
		for (int i = 0; i < all.length; i++) {
			if(!(all[i] < 0)) {
				answer++;
			}
		}
		
		return answer;
	}
}
