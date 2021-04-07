package greedy;
/*조이스틱
https://programmers.co.kr/learn/courses/30/lessons/42860
*/
public class JoyStick {

	public static void main(String[] args) {
		String name = "JAZ";
		System.out.println("이름을 만들기위해 조이스틱 움직여야하는 최소 횟수는? " + solution(name));
	}
	  public static int solution(String name) {
	        int answer = 0;
	        
	        // 대문자 아스키 코드값은 65~90까지
	        // 조이스틱 위 아래로 움직이기
	        // 알파벳 바꾸는 회수
	        for (char c : name.toCharArray()) {
	        	if(c < 78) { //A~M까지
	        		answer += c % 65;
	        	} else { // N~Z까지
	        		answer += 91 - c;
	        	}
	        }
	        
	        // 좌, 우의 최소는 문자열 시작부터 끝까지(왼->오) 가는 경우임
	        int minCursorMove = name.length() - 1;
	        
	        // A 가 연속되는 경우, 뒤로 돌아갔을 때 최솟값을 구해주어 비교
	        for (int i = 0; i < name.length(); i++) {
	        	int index = i;
	        	// 커서이동하다가 A 만나면
	        	if (name.charAt(i) == 'A') {
	        		// 연속된 A 개수를 세준다.
	        		while(index < name.length() && name.charAt(index) == 'A') {
	        			index++;
	        		}
	        		
	        		//(( i - 1 ) * 2)은 A가 가기 전까지 갔다가, 다시 back 하는 수를 세준 것
	        		// 연속된 A 가 끝나는 index까지 뒤에서 세야하므로 ( 전체길이 - index )
	        		System.out.println(index);
	        		int moveCount = ((i-1)*2) + name.length() - index;
	        		minCursorMove = Math.min(minCursorMove, moveCount);
	        	}// if() end
	        }
	        
	        System.out.println("좌 우 이동거리" + minCursorMove);
	        
	        return answer + minCursorMove;
	    }
	  
	  
	  
}
