package sort;

import java.util.Arrays;

public class NumberAtK {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4};
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		StringBuilder str = new StringBuilder();
		
		int[] result = solution(array, commands);
		str.append("[");
		for(int i = 0 ; i < result.length; i++) {
			str.append(result[i]);
			if (result.length != (i+1)) { 
				str.append(" , ");
			}
		}
		str.append("]");
		
		System.out.println("답: " + str);

	}
	/*
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int startIndex = 0;
		int endIndex = 0;
		int k = 0;
		int count = 1;
		int[] temp = {};
		
		for (int i = 0; i < commands.length; i++) {

			startIndex = commands[i][0];
			endIndex = commands[i][1];
			k = commands[i][2];
			temp = new int[endIndex - startIndex + 1];
			count = 0;
			
			for (int j = startIndex -1; j <= endIndex-1; j++) {
				temp[count] = array[j];
				count++;	
			}
			
			Arrays.sort(temp);
			answer[commands.length-(i+1)] = temp[temp.length-k];
			
		}
		return answer;
	}
	 */
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int startIndex = 0;
		int endIndex = 0;
		int k = 0;
		int[] temp = {};
		
		for(int i = 0; i < commands.length; i++) {
			startIndex = commands[i][0];
			endIndex = commands[i][1];	
			k = commands[i][2];
			temp = new int[endIndex-(startIndex-1)];
			
			for(int j = 0; j < temp.length; j++) {
				temp[j] = array[j + (startIndex - 1)];
			}
			Arrays.sort(temp);
			answer[i] = temp[k-1];
		}

		return answer;
	}
	
}
