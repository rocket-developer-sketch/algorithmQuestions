package string;

/*문자열 내 p 와 y 개수*/
public class CountPandY {

	public static void main(String[] args) {
		String str = "pPoooyY";
		System.out.println("p 와 y 개수 동일 ? " + solution(str));
//		Character.getNumericValue('z')
	}

	public static boolean solution(String str) {
	        boolean answer = true;
	        
	        char[] chars = str.toCharArray();
	        int y = Character.getNumericValue('y');
	        int p = Character.getNumericValue('p');
	        int count = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	        	int c = Character.getNumericValue(chars[i]);
	        	
	        	if (y == c) {
	        		count++;
	        	} else if (p == c) {
	        		count--;
	        	}
	        }
	        
	        if (count < 0) {
	        	answer = false;
	        }

	        return answer;
	    }
}
